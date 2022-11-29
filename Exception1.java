import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {




    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");


        int j=0;
        try
        {
        int x=sc.nextInt();
        int[] arr = new int[x];

          for(int i=0;i<x;i++) {
              arr[j] = sc.nextInt();
              j++;
          }
          System.out.println("enter the array index value to search");
          int y=sc.nextInt();
          try
          {
              System.out.println(arr[y]);
          }
          catch (IndexOutOfBoundsException e)
          {
              System.out.println("enter the value inside the array length");
          }
       }
       catch(InputMismatchException e)
       {
           System.err.println(e.getMessage());
       }

       finally
       {
           System.out.println("iam exited:::....");
       }
    }
}
