import java.io.*;
import java.util.*;
class fact{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int s = 1;
for(int i=1; i<=5; i++)
{
s *= i;
System.out.println(s);
}
}
}