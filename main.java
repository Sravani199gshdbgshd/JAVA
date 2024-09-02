import java.io.*;
import java.util.*;
class main {
public static Boolean a(int n)  {
int c = 0;
for(int i = 1; i <= n; i++) 
{
if(n % i == 0 )
{
c++;
}
}
if(c == 2)
{
return true;
}
return false;
}
public static void main(String args[])
{
int n = 10;
for(int i=1; i<=n; i++)
{
if(a(i))
{
System.out.println(i+" ");
}
}
}
}
 