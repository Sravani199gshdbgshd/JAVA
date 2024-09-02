import java.io.*;
import java.util.*;
class arsum{
public static void main(String args[]){
Scanner S = new Scanner(System.in);
 System.out.print("Enter the value of number: ");
int n = S.nextInt();
int arr[] = new int[n];
int res=0;
for(int i=0; i<n; i++)
{
arr[i] = S.nextInt();
res += arr[i];
}
System.out.println("The sum of the array elements is: " + res);
}
}

