import java.io.*;
import java.util.*;
class evenodd{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num;
if(num%2==0)
{
System.out.println((num%2==0)?"Even" : "Odd" );
}
else{
System.out.println("it is odd:");
}
}
}