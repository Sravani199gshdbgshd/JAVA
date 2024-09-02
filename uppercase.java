import java.io.*;
import java.util.*;
class uppercase{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
if(ch>='A' &&  ch<='Z')
{
System.out.println("it is uppercase");
}
else if(ch>='a' && ch<='z')
{
System.out.println("it is lowercase");
}
else 
{
System.out.println("it is invalid");
}
}
}
