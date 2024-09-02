import java.io.*;
import java.util.*;
class vowels{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a character: ");
        char a = scanner.next().charAt(0);
if((a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') || 
           (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'))
{
System.out.println("it is vowels");
}
else
{
System.out.println("it is consonents");
}
}
}

