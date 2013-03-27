#!/bin/sh
for i in `find . -name \*.java -print`; do tr -d '\r'< $i > tmp; mv tmp $i; done
for i in `find . -name \*.properties -print`; do tr -d '\r'< $i > tmp2; mv tmp2 $i; done
