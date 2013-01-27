#!/bin/bash

## OPTION PROCESSING ###########################################################

CONTAINER=localhost
DEBUG=
JDWP_PORT=9876
HELP=

while getopts c:dhp: option; do
    case "$option" in
	c) CONTAINER=$OPTARG;;
        d) DEBUG=1;;
        h) HELP=1;;
        p) JDWP_PORT=$OPTARG;;
        ?) echo "Unknown option: $option"; exit 1;;
    esac
done
shift $((OPTIND - 1))

if [[ "$DEBUG" == 1 ]]; then
    JVM_FLAGS="-Xrunjdwp:transport=dt_socket,address=$JDWP_PORT,server=y,suspend=y"
fi

if [[ "$HELP" == 1 ]]; then
    echo "Usage: $0 [options]" >&2
    echo "Options:" >&2
    echo "  * -c H  connect to container on host H" >&2
    echo "  * -d    wait for remote debugger" >&2
    echo "  * -h    print this help message" >&2
    echo "  * -p P  use port P for remote debugging" >&2
    exit 1
fi

## MAIN BODY ###################################################################

RCA_CLASS=es.uca.agents.RequestCreatorAgent
PA_CLASS=es.uca.agents.ProductAgent

MAVEN_OPTS="$MAVEN_OPTS $JVM_FLAGS" mvn -pl agents exec:java \
    -Dexec.mainClass=jade.Boot \
    -Dexec.args="-container -container-name Workfloor -host $CONTAINER -agents 'creator:$RCA_CLASS;p1:$PA_CLASS(\"product1\",true)'"
