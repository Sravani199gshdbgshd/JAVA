import java.io.*;
import java.util.*;
class leapyear{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a year: ");
 int year = scanner.nextInt();
if((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)) 
{
System.out.println("it is leap year:");
}
else
{
System.out.println("it is not a leap year:");
}
}
}
