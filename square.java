import java.io.*;
import java.util.*;
class square{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        int number = scanner.nextInt();
        int square = number*number;
 System.out.println("The square of " + number + " is: " + square);
}
}