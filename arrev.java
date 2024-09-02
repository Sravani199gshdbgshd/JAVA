import java.io.*;
import java.util.*;
class arrev{
public static void main(String args[]){
Scanner S = new Scanner(System.in);
 System.out.print("Enter the value of number: ");
int n = S.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
arr[i] = S.nextInt();
}
System.out.println("reverse elements are:");
for(int i = n - 1; i >= 0; i--) {
System.out.print(arr[i] + " ");
}
}
}









 System.out.print("Enter the value of number: ");
int n = S.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
arr[i] = S.nextInt();
}
int st=0, end = n-1;
while(st<=end)
{
temp = arr[st];
arr[st] = arr[end];
arr[end] = temp;
st++;
end--;
}
System.out.println(Arrays.toString(arr));
}
}
}


