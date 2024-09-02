import java.io.*;
import java.util.*;
class sumsq1{
public static void main(String args[]){
Scanner S = new Scanner(System.in);
 System.out.print("Enter the value of number: ");
int n = S.nextInt();
int res = 0;
while(n>0)
{
int digit = n % 10;
res = digit * digit;
n /= 10;
}
System.out.println("the number:");
}
}