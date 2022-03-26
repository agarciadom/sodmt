#!/bin/bash

# NOTE: this should only be run from inside a machine with Java 8.

# Install the grinderplugin from Google Code (archive)
mkdir -p grinderplugin
pushd grinderplugin

wget "https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/grinder-maven-plugin/grinder-maven-plugin-distributable-1.0.0-RC3.zip"
unzip grinder-maven-plugin-distributable-1.0.0-RC3.zip 
mvn install:install-file -Dfile=grinderplugin-1.0.0-RC3.jar -DpomFile=pom.xml

popd
rm -r grinderplugin

# Download the test-generator dependency
mvn dependency:get -Dartifact=es.uca.webservices:test-generator:1.1.0-SNAPSHOT

# Run the tests
mvn clean install
