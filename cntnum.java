import java.io.*;
import java.util.*;
class cntnum{
public static void main(String args[]){
Scanner S = new Scanner(System.in);
 System.out.print("Enter the value of number: ");
int t = S.nextInt();
for(int i=0; i<t; i++)
{
int n = S.nextInt();
int c = 0;
while(n>0)
{
int digit = n % 10;
n /= 10;
c++;
}
System.out.println(c);
}
}
}