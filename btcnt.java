import java.io.*;
import java.util.*; 
class btcnt {
public static void main(String args[]){
Scanner S = new Scanner(System.in);
System.out.print("enter the number");
int n = S.nextInt();
int c = 0;
while(n>0)
{
c += n & 1;
n>>=1;
}
System.out.println("the number of bits is: " +c);
}
}
