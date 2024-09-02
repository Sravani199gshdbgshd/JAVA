import java.io.*;
import java.util.*;
class alphabet{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
if((ch>='A' &&  ch<='Z') || (ch>='a' && ch<='z'))
{
System.out.println("it is alphabet");
}
else
{
System.out.println("it is not a alphabet");
}
}
}

