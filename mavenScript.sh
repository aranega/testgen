#!/bin/sh
mkdir -p dooapp-test-component-parent/ && cd dooapp-test-component-parent/ ;
echo "firea-component-parent generation report" > ../generation.log ;
echo "########################################" >> ../generation.log ;
if [ ! -f dooapp-test-a-component/pom.xml ]
then
	echo "* For dooapp-test-a-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapp-test.a -DartifactId=dooapp-test-a-component -DFileShortName=A -DJavaShortName=A -Dauthor=genmymodel -Dtime="date" -DDOMAIN=A -DwrapperPackage=com.dooapp.dooapp-test.wrapper -DdomainPackage=com.dooapp.dooapp-test -DbuilderPackage=com.dooapp.dooapp-test.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapp-test-a-component/pom.xml not generated by maven because dooapp-test-a-component/pom.xml already existing" >> ../generation.log
fi;
if [ ! -f dooapp-test-c-component/pom.xml ]
then
	echo "* For dooapp-test-c-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapp-test.c -DartifactId=dooapp-test-c-component -DFileShortName=C -DJavaShortName=C -Dauthor=genmymodel -Dtime="date" -DDOMAIN=C -DwrapperPackage=com.dooapp.dooapp-test.wrapper -DdomainPackage=com.dooapp.dooapp-test -DbuilderPackage=com.dooapp.dooapp-test.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapp-test-c-component/pom.xml not generated by maven because dooapp-test-c-component/pom.xml already existing" >> ../generation.log
fi;
if [ ! -f dooapp-test-e-component/pom.xml ]
then
	echo "* For dooapp-test-e-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapp-test.e -DartifactId=dooapp-test-e-component -DFileShortName=E -DJavaShortName=E -Dauthor=genmymodel -Dtime="date" -DDOMAIN=E -DwrapperPackage=com.dooapp.dooapp-test.wrapper -DdomainPackage=com.dooapp.dooapp-test -DbuilderPackage=com.dooapp.dooapp-test.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapp-test-e-component/pom.xml not generated by maven because dooapp-test-e-component/pom.xml already existing" >> ../generation.log
fi;
if [ ! -f dooapp-test-b-component/pom.xml ]
then
	echo "* For dooapp-test-b-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapp-test.b -DartifactId=dooapp-test-b-component -DFileShortName=B -DJavaShortName=B -Dauthor=genmymodel -Dtime="date" -DDOMAIN=B -DwrapperPackage=com.dooapp.dooapp-test.wrapper -DdomainPackage=com.dooapp.dooapp-test -DbuilderPackage=com.dooapp.dooapp-test.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapp-test-b-component/pom.xml not generated by maven because dooapp-test-b-component/pom.xml already existing" >> ../generation.log
fi;


