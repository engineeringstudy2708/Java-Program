import java.util.Scanner;
public class InsertionSort{
    public static void main(String [] args)
    {   Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=s.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
            // Insertion sort
        for(int j=1;j<size;j++)
        {
            int key=arr[j];
            int i=j-1;
            while (i>=0 && arr[i]>key)
            {
                arr[i+1]=arr[i];
                i-=1;
            }
            arr[i+1]=key;
        }
        System.out.println("The Sorted Output: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}