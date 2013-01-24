#!/bin/bash

if [[ "$#" != 1 ]]; then
    echo "Usage: $0 (main container host)" >&2
    exit 1
fi

HOST=$1
RCA_CLASS=es.uca.agents.RequestCreatorAgent

mvn compile exec:java \
    -Dexec.mainClass=jade.Boot \
    -Dexec.args="-container -host $HOST -agents 'creator:$RCA_CLASS'"
