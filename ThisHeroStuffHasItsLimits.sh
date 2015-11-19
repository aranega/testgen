#!/bin/sh

FINALNAME=model.arnoldc
JAR=ArnoldC.jar

echo "Merging files..."
cat main.arnoldc > $FINALNAME

cat stateLib.arnoldc >> $FINALNAME

echo "Launching..."
java -jar $JAR -run model.arnoldc

