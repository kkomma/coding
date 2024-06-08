cd /c/Users/EBPLVD0/Desktop/workspace/misc/misc/intcode/lcode/leetcode-java/src/

ls *.java > kk.txt

$ while read row

> do

> sed -i '1 i\import java.util.*;' $row

> done < kk.txt
