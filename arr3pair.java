import java.io.*;
import java.util.*;
class arr3pair{
public static void main(String args[]){
Scanner M = new Scanner(System.in);
int s = M.nextInt();
int k = M.nextInt();
int[] arr = new int[s];
for(int i=0; i<s; i++)
{
arr[i] = M.nextInt();
}
for (int i = 0; i < s; i++) {
for(int j = i+1; j < s; j++) {
if(arr[i] + arr[i] == k)
{
System.out.println("true");
}
else {
break;
}
}
}
}
}



