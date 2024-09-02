import java.io.*;
import java.util.*;
class sum{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int s = 0;
for(int i=0; i<n; i++)
{
s += i;
System.out.println(s);
}
}
}
