import java.io.*;
import java.util.*;
class perfnum{
public static void main(String args[]){
Scanner S = new Scanner(System.in);
 System.out.print("Enter the value of number: ");
int t = S.nextInt();
int n = S.nextInt();
for(int i=1; i<t; i++)
{
int res = 0;
int sum = 0;
while(n>0)
{
int digit = n % 10;
res = i * digit;
if (n % i == 0) {
sum += i;
}
i++;
}
}
}
}



import java.util.*;

class vivek{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
            System.out.println("enter the number :");
            int n=s.nextInt();
            int sum=0;int temp;int res =1;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    
                    sum=sum+i;
                    res=res*i;
                }
            }
                if(sum == n && res == n){
                   System.out.println("perfect number");
                }
                else{
                    System.out.println("Not a perfect number");
                }
                
            
        }
    }
          







2wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwrongggggggggggg