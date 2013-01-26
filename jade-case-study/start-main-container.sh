#!/bin/sh

mvn -pl ontologies compile exec:java -Dexec.mainClass=jade.Boot -Dexec.args='-gui'
