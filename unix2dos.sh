#!/bin/sh
for i in `find . -name \*.java -print`; do sed 's/$'"/`echo \\\r`/" $i > tmp; mv tmp $i; done
for i in `find . -name \*.properties -print`; do sed 's/$'"/`echo \\\r`/" $i > tmp2; mv tmp2 $i; done
