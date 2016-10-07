#!/bin/bash

TOTAL_LOC=0
for var in "$@"
do
  if [[ -f $var ]]; then
      printf '%s: ' `basename $var`
      FILE_LOC=`cat $var | egrep -v "^[[:blank:]]*(/|$|\*)" | wc -l`
      printf '%d LOC\n' $FILE_LOC
      TOTAL_LOC=$((TOTAL_LOC + FILE_LOC))
  else
      echo "Argument is not file"
      exit 1
  fi
done
printf 'Total: %d LOC\n' $TOTAL_LOC
exit 0
