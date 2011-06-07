#!/bin/bash

# run this script with 'DRY_RUN="" $0' to actually perform the changes
if test -n "${DRY_RUN-x}"; then
  DRY_RUN="-n"
fi

rsync $DRY_RUN -ravz --delete \
  --exclude '.*' --exclude "$0" \
  . agarcia@neptuno.uca.es:/home/agarcia/public_html/sodmt-updates/
