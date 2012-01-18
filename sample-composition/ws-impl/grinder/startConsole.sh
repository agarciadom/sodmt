#!/bin/bash
source "$(dirname "$0")/setGrinderEnv.sh"
java -classpath $GRINDER_JAR net.grinder.Console
