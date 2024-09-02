import java.io.*;
import java.util.*;
class arnum5{
public static void main(String args[]){
Scanner S = new Scanner(System.in);
 System.out.print("Enter the value of number: ");
int n = S.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++)
{
arr[i] = S.nextInt();
}
for(int i=0; i<n; i++)
{
System.out.print(arr[i]+" ");
}
}
}
