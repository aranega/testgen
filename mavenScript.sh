#!/bin/sh
mkdir -p dooapptest-component-parent/ && cd dooapptest-component-parent/ ;
echo "firea-component-parent generation report" > ../generation.log ;
echo "########################################" >> ../generation.log ;
if [ ! -f dooapptest-e-component/pom.xml ]
then
	echo "* For dooapptest-e-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapptest.e -DartifactId=dooapptest-e-component -DFileShortName=E -DJavaShortName=E -Dauthor=genmymodel -Dtime="date" -DDOMAIN=E -DwrapperPackage=com.dooapp.dooapptest.wrapper -DdomainPackage=com.dooapp.dooapptest -DbuilderPackage=com.dooapp.dooapptest.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapptest-e-component/pom.xml not generated by maven because dooapptest-e-component/pom.xml already existing" >> ../generation.log
fi;
if [ ! -f dooapptest-b-component/pom.xml ]
then
	echo "* For dooapptest-b-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapptest.b -DartifactId=dooapptest-b-component -DFileShortName=B -DJavaShortName=B -Dauthor=genmymodel -Dtime="date" -DDOMAIN=B -DwrapperPackage=com.dooapp.dooapptest.wrapper -DdomainPackage=com.dooapp.dooapptest -DbuilderPackage=com.dooapp.dooapptest.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapptest-b-component/pom.xml not generated by maven because dooapptest-b-component/pom.xml already existing" >> ../generation.log
fi;
if [ ! -f dooapptest-a-component/pom.xml ]
then
	echo "* For dooapptest-a-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapptest.a -DartifactId=dooapptest-a-component -DFileShortName=A -DJavaShortName=A -Dauthor=genmymodel -Dtime="date" -DDOMAIN=A -DwrapperPackage=com.dooapp.dooapptest.wrapper -DdomainPackage=com.dooapp.dooapptest -DbuilderPackage=com.dooapp.dooapptest.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapptest-a-component/pom.xml not generated by maven because dooapptest-a-component/pom.xml already existing" >> ../generation.log
fi;
if [ ! -f dooapptest-c-component/pom.xml ]
then
	echo "* For dooapptest-c-component" >> ../generation.log ;
	mvn archetype:generate -B -DarchetypeGroupId=com.dooapp -DarchetypeArtifactId=component-archetype -DgroupId=com.dooapp.dooapptest.c -DartifactId=dooapptest-c-component -DFileShortName=C -DJavaShortName=C -Dauthor=genmymodel -Dtime="date" -DDOMAIN=C -DwrapperPackage=com.dooapp.dooapptest.wrapper -DdomainPackage=com.dooapp.dooapptest -DbuilderPackage=com.dooapp.dooapptest.entity.factories  >> ../generation.log 2>>../generation.log ;
	echo "" >> ../generation.log
else
	echo "- dooapptest-c-component/pom.xml not generated by maven because dooapptest-c-component/pom.xml already existing" >> ../generation.log
fi;


