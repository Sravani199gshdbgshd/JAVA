  introduction


class HelloWorld {
    public static void main(String[] args) {
        String name="sravani";
        int reg=192110554;
        String department="computer";
        System.out.println("hi hello my name is"+name+" "+ "my register number is "+reg+" "+ "iam studying 4th year"+department);
        
    }
}


duplicate array                                       
 

public class Main {                                               
    public static void dupl(int arr[], int n)
    {
        int c[]=new int[10000];
        for(int i = 0; i < n; i++)
        {
            c[arr[i]]++;
        }
        for(int i = 0; i < n; i++)
        {
            if(c[i]>1)
            {
            System.out.print(i+" ");
        }
    }
}
public static void main(String args[])
{
    int arr[] = { 1,4,1,3,4,5,6};
    dupl(arr,7);
}
}

output.. 1 4