import java.io.*;
import java.util.*;
class numbers{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number: ");
int n = scanner.nextInt();
if(n>0)
{
System.out.println("it is positive:");
}
else if(n<0)
{
System.out.println("it is negative");
}
else if(n==0)
{
System.out.println("it is zero");
}
else
{
System.out.println("invalid");
}
}
}
