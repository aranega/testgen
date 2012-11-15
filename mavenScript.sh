#!/bin/sh
mkdir -p test/test-component-parent/ && cd test/test-component-parent/ && mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp -DartifactId=test-simpleclass-component -Dversion=1.0-SNAPSHOT -DFileShortName=SimpleClass -DJavaShortName=SimpleClass -Dauthor=genmymodel -Dtime=`date +%s`
