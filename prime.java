/** This Program gives the check number is prime or not */
import java.util.*;

public class prime{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the number :");

        int n= s.nextInt();

        boolean prime=true;
        
            for(int j=2;j<n;j++)
            {
                    if(n%j==0)
                    {
                        prime=false;
                    }
                  
            }  
       if(prime == true)
         {System.out.println(n + " is Prime");}
        else
         {System.out.println(n + " is not Prime"); }  
       
    }
}