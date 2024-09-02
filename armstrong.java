import java.io.*;
import java.util.*;
class armstrong{
public static void main(String args[]){
Scanner S = new Scanner(System.in);
 System.out.print("Enter the value of number: ");
int n = S.nextInt();
int originalNumber = n;
int res = 0;
while(n>0)
{
int digit = n %10;
res = res + digit * digit * digit;
n   = n / 10;
}
if(res == originalNumber )
{
System.out.println("it is Armstrong");
}
else
{
System.out.println("it is not a Armstrong");
}
}
}


