import java.io.*;
import java.util.*;
class numalpha{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a character: ");
        char a = scanner.next().charAt(0);
if((a>='A' &&  a<='Z') || (a>='a' && a<='z'))
{
System.out.println("it is alphabet");
}
else if(a>='0'&& a<='9')
System.out.println("it is number");
else
{
System.out.println("it is a specialcharacter");
}
}
}



