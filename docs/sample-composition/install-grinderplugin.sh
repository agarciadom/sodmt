#!/bin/bash

mkdir -p grinderplugin
pushd grinderplugin

wget "https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/grinder-maven-plugin/grinder-maven-plugin-distributable-1.0.0-RC3.zip"
unzip grinder-maven-plugin-distributable-1.0.0-RC3.zip 
mvn install:install-file -Dfile=grinderplugin-1.0.0-RC3.jar -DpomFile=pom.xml

popd
rm -r grinderplugin