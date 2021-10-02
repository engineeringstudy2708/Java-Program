 import java.util.Scanner;
class factorial
{  
      public static void main(String [] args)
   {
       Scanner s = new Scanner(System.in);
       int n;
 
       System.out.println("Enter the number : ");
       n = s.nextInt();
       int ans=fact(n);

        System.out.println("The Factorial is : "+ans);
    }

  static int fact(int n)
     {
        if(n>1)
        {
            return (n*fact(n-1));
        }
        else
        {
            return 1;
        }
     }
    
} 