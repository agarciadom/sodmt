#!/bin/bash
source "$(dirname "$0")/setGrinderEnv.sh"

# Clean up results from previous runs
rm -f *.log

# Make Maven download all dependencies and compute the classpath for the project (except for Grinder)
CLASSPATH_FILE="$(dirname "$0")/build.classpath"
mvn -f ../pom.xml -Dmdep.outputFile="$CLASSPATH_FILE" \
    test-compile dependency:build-classpath

# Launch the Grinder agent
java -cp "$GRINDER_JAR:$(cat "$CLASSPATH_FILE")" \
    net.grinder.Grinder "$GRINDER_PROPERTIES"
