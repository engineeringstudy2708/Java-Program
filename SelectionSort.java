import java.util.*;

class SelectionSort {

    public static void main(String [] args)
    {

        
    Scanner s=new Scanner(System.in);
    int size=5;
    int [] arr=new int[size];

    System.out.println("Enter the Array no.");
    for(int i=0;i<size;i++)
    {
        arr[i]=s.nextInt();
    }
int count=0;
    for(int i=0;i<size;i++)
    {
        int min=i;
        for(int j=i+1;j<size;j++)
        {
            if(arr[min]>arr[j])
            {
                min=j;
            }
        }

        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
        count++;
         System.out.println(count);
    }


    System.out.println("The Sorted array :");
    for(int i=0;i<size;i++)
    {
     System.out.print(arr[i]);
    }

    }
    
    
}