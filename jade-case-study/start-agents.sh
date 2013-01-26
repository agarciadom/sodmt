#!/bin/bash

## OPTION PROCESSING ###########################################################

DEBUG=
JDWP_PORT=9876
while getopts dp: option; do
    case "$option" in
        d) DEBUG=1;;
        p) JDWP_PORT=$OPTARG;;
        ?) echo "Unknown option: $option"; exit 1;;
    esac
done
if [[ "$DEBUG" == 1 ]]; then
    JVM_FLAGS="-Xrunjdwp:transport=dt_socket,address=$JDWP_PORT,server=y,suspend=y"
fi
shift $((OPTIND - 1))

if [[ "$#" != 1 ]]; then
    echo "Usage: $0 [-d for remote debugging | -p for JDWP port] (main container host)" >&2
    exit 1
fi

## MAIN BODY ###################################################################

HOST=$1
RCA_CLASS=es.uca.agents.RequestCreatorAgent

mvn compile

MAVEN_OPTS="$MAVEN_OPTS $JVM_FLAGS" mvn exec:java \
    -Dexec.mainClass=jade.Boot \
    -Dexec.args="-container -host $HOST -agents 'creator:$RCA_CLASS'"
