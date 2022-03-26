#!/bin/sh

# Dumps the data in a PostgreSQL database so Hibernate can import it back
# Copyright (C) 2013 Antonio García-Domínguez

if [ "$#" != 2 ]; then
  echo "Usage: $0 (db name) (user)"
  exit 1
fi

DB_NAME=$1
DB_USER=$2

pg_dump "$DB_NAME" -U "$DB_USER" -a --disable-triggers --column-insert \
 | sed -r '/^$/d; /^[-][-]/d; s/SELECT pg_catalog.setval\(.([^,]*)., ([0-9]+),.*/ALTER SEQUENCE \1 RESTART WITH \2; ALTER SEQUENCE \1 INCREMENT BY 1;/g'
