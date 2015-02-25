#!/bin/sh

FINALNAME=designPatterns.arnoldc
JAR=ArnoldC.jar

echo "Merging files..."
cat main.arnoldc > $FINALNAME

cat stateLib.arnoldc >> $FINALNAME

echo "Launching..."
java -jar $JAR -run designPatterns.arnoldc

