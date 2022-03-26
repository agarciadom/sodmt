#!/bin/bash

fail() {
  echo "$@" >&2
  exit 1
}

if test -z "$POSTGRES_HOST"; then fail "POSTGRES_HOST not set"; fi
if test -z "$POSTGRES_USER"; then fail "POSTGRES_HOST not set"; fi
if test -z "$POSTGRES_PASSWORD"; then fail "POSTGRES_HOST not set"; fi

find -name database.properties | (while read f; do
  sed -i "/database.url/s#=.*#=jdbc\\\\:postgresql\\\\://${POSTGRES_HOST}\\\\:5432/${POSTGRES_USER}#" "$f"
  sed -i "/database.username/s/=.*/=${POSTGRES_USER}/" "$f"
  sed -i "/database.password/s/=.*/=${POSTGRES_PASSWORD}/" "$f"
done)
