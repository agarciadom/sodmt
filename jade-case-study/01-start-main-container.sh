#!/bin/sh

mvn -pl ontologies exec:java -Dexec.mainClass=jade.Boot -Dexec.args='-gui'
