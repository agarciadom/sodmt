#!/bin/bash

VERSION="$1"

if test -z "$VERSION"; then
  echo "Usage: $0 version"
  exit 1
fi

mvn org.eclipse.tycho:tycho-versions-plugin:set-version "-DnewVersion=$VERSION"
