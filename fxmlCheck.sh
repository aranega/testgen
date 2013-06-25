#!/bin/bash
echo > error.log;
list=`find . -name \*.fxml | sed '/\/target\//d'`;
size=`echo ${list} | wc -w`;
echo "Testing "${size}" fxml files" > error.log ;
echo >> error.log ;
while [ ${#list} -gt 0 ] 
do
    f=`echo ${list} | cut -d\  -f1` ;
    for other in ${list[@]//${f}}
    do
 	if [[ `basename ${f}` == `basename ${other}` ]] ;
 	then
	    r1=`cat ${f} | grep -E '\"_stack\"|\"genMyModel\"'`;
	    r2=`cat ${other} | grep -E '\"_stack\"|\"genMyModel\"'`;
	    if [[ ${r1} != '' && ${r2} != '' ]] ;
	    then
 			echo "Problem between, both files have same name in different path with a _stack or genMyModel annotation: " >> error.log;
 			echo "  * "${f} >> error.log;
 			echo "  * "${other} >> error.log;
			list=${list[@]//${other}};
	    fi
 	fi
    done;
    list=${list[@]//${f}};
done;

if [ `cat error.log | wc -l` -gt 2 ]
then
    exit 1
else
	rm error.log;
    exit 0
fi
