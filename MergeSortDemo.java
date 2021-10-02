import java.util.Scanner;

public class MergeSortDemo { 

    int Array[];
    int tempSortArray[];
    int length;

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the array size :");
        int size = s.nextInt();
        
        int [] InputArr = new int[size];

        System.out.println("Enter the array element :");
        for(int i = 0; i < size; i++) 
        {
            InputArr[i] = s.nextInt();
        }

        MergeSortDemo ms = new MergeSortDemo();
        ms.Array(InputArr);

        System.out.println("The Sorted Output :");
        for(int i : InputArr)
        {
           System.out.print(i + " ");
        }

    }

    void Array(int InputArr[])
    {

        this.Array = InputArr ;
        this.length = InputArr.length;

        this.tempSortArray = new int[length];
        MergeSort(0, length-1 );
    }
 
    void MergeSort(int p, int r)
    {
        int q = 0;
        if (p < r) 
        {
            q = (p + r) / 2;

            MergeSort(p, q);

            MergeSort(q + 1, r);

            Merge(p, q, r);
        }

    }

    void Merge(int p,int q,int r) 
    {
        // p= start_index q=middle_index r=last_index 
        for(int i = p; i <= r; i++)
        {
            tempSortArray[i] = Array[i];
        }

        int i = p, j = q+1, k = p;

        while (i <= q && j <= r) 
        {
            if (tempSortArray[i] <= tempSortArray[j]) 
            {
                Array[k] = tempSortArray[i];
                i++;
            } 
            else 
            {
                Array[k] = tempSortArray[j];
                j++;
            }
            k++;
        }

        while(i <= q)
        {
            Array[k] = tempSortArray[i];
            k++;
            i++;
        }
    }
}