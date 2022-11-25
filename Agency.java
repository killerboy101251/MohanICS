import java.util.Scanner;

public class Agency {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the item");
        String s= sc.next();
        System.out.println("enter the quantity");
        int x= sc.nextInt();
        if(s.equals("induction heater") || s.equals("heater"))
        {
            if(x>=50)
            {
                System.out.println(x*850);
            }
            else if(x>=30)
            {
                System.out.println(x*900);
            }
            else
            {
                System.out.println(x*950);
            }
        }
      else  if(s.equals("electric kettle") || s.equals("kettel"))

        {
            if(x>=50)
            {
                System.out.println(x*700);
            }
            else if(x>=30)
            {
                System.out.println(x*800);
            }
            else
            {
                System.out.println(x*900);
            }
        }
        else
        {
            System.out.println("we dont deal with :"+s);
        }
    }
}
