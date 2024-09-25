while read line;
do
if [[ ${#line} -lt 8 ]]
then
echo $line
fi
done < StringGrep.txt