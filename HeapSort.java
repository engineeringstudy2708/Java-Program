import java.util.Scanner;


class Heap{

    int Array[];
    int n;

    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Array elements :");
        for(int i=0 ; i < n ; i++)
        {
            arr[i] = s.nextInt();
        }
        Heap h = new Heap();
        h.Array(arr);
    }

    void Array(int arr[])
    {
        this.Array = arr;
        this.n = arr.length;

        HeapSort(Array);
    }


    void HeapSort(int Array[])
    {
        Build_Max_Heap(Array);

        for(int i=Array.length; i>=2;i++)
        {
            int temp = Array[1];
            Array[1] = Array[i];
            Array[i] = temp;
            
            Max_Heapify(Array,1,i-1);
        }
    }

   
}