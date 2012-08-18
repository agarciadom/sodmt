#!/bin/bash

# Exit on first error
set +e

# FUNCTIONS ###################################################################

error() {
    echo $@ >&2
}

list_update_site() {
    ls -1 "$ARTIFACT_PREFIX"*.zip | egrep -v 'linux|mac|win'
}

list_rcp_distros() {
    ls -1 "$ARTIFACT_PREFIX"*.zip | egrep  'linux|mac|win'
}

list_composite_update_site() {
    ls -1 "$CMP_PROJECT/composite"*.jar
}

if test -n "${DRY_RUN-x}"; then
    DRY_RUN="-n"
    error "Using dry run mode."
    error "Run 'DRY_RUN=\"\" $0' if you want to actually perform the changes."
fi

# CONFIGURATION ################################################################

HOST=neptuno.uca.es
USER=agarcia
ACCOUNT=$USER@$HOST
WWW_DIR=/home/$USER/public_html
RSYNC_PREFIX=$ACCOUNT:$WWW_DIR

UPD_DIR=sodmt-updates
CMP_DIR=sodmt-composite
RCP_DIR=sodmt-rcp
UPD_RSYNC=$RSYNC_PREFIX/$UPD_DIR
CMP_RSYNC=$RSYNC_PREFIX/$CMP_DIR
RCP_RSYNC=$RSYNC_PREFIX/$RCP_DIR

DISTROS_PROJECT=es.uca.modeling.sodmt.distros
CMP_PROJECT=es.uca.modeling.sodmt.updatesite.composite
ARTIFACT_PREFIX=$DISTROS_PROJECT/target/$DISTROS_PROJECT
UPLOAD_AREA=upload-area

# MAIN BODY ####################################################################

# Check required files

if ! list_update_site &>/dev/null || ! list_rcp_distros &>/dev/null; then
    error "Please build the update site and RCP distributions first."
    error "Run 'mvn verify' to do so."
    exit 250
fi
if ! list_composite_update_site &>/dev/null; then
    error "Please build the composite update site from Eclipse first."
    exit 251
fi

# Prepare the upload area

rm -rf "$UPLOAD_AREA"
mkdir -p "$UPLOAD_AREA/$UPD_DIR"
unzip -q "$(list_update_site | head -1)" -d "$UPLOAD_AREA/$UPD_DIR"
mkdir "$UPLOAD_AREA/$RCP_DIR"
list_rcp_distros | (
    while read f; do
        ln "$f" "$UPLOAD_AREA/$RCP_DIR"
    done
)
mkdir "$UPLOAD_AREA/$CMP_DIR"
list_composite_update_site | (
    while read f; do
        ln "$f" "$UPLOAD_AREA/$CMP_DIR"
    done
)

# Do the uploads

ssh-add
rsync $DRY_RUN -ravz --delete "$UPLOAD_AREA/$UPD_DIR/"  "$UPD_RSYNC/"
rsync $DRY_RUN -ravz --delete "$UPLOAD_AREA/$RCP_DIR/"  "$RCP_RSYNC/"
rsync $DRY_RUN -ravz --delete "$UPLOAD_AREA/$CMP_DIR/"  "$CMP_RSYNC/"
