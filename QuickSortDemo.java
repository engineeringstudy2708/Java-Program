import java.util.Scanner;

public class QuickSortDemo
{
    int Array[];
    int length;
    public static void main(String [] args)
    {
       Scanner s = new Scanner(System.in);
       
       System.out.println("Enter the size ");
       int size=s.nextInt();

       int arr[] = new int[size];

       System.out.println("Enter the Number : ");
       for(int i = 0; i < size; i++)
       {
           arr[i]=s.nextInt();
       }

       QuickSortDemo qs = new QuickSortDemo();
       qs.Array(arr);

       System.out.println("The Sorted Output : ");
       for(int i : arr)
       {
        System.out.print(i +" ");
       }

    }

    void Array(int [] Array)
    {
        this.Array = Array;
        this.length = Array.length;

        QuickSort(Array ,0,length-1);
    }

    void QuickSort(int Array[],int p,int r)
    {
        if(p < r)
        {
           int q = Partition(Array,p,r);
           QuickSort(Array,p, q-1);
           QuickSort(Array,q+1, r);

        }
    }

    int Partition(int Array[],int p,int r)
    {
        int pivot = Array[r];
        int i = p - 1;

        for (int j = p; j<r;j++)
        {
            if(Array[j] <= pivot )
            {
                i += 1;
                int temp = Array[i];
                Array[i] = Array[j];
                Array[j] = temp;
            }
        }
        int temp = Array[r];
        Array[r] = Array[i+1];
        Array[i+1] = temp;

        return i+1;
    }
}