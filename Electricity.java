import java.util.Scanner;

class BillGenerate
{
    double bill(int x,String s)
    {
        double total=0;
    if(s.equalsIgnoreCase("domestic"))
    {
         total=(x*5);
        if(total<=1000)
        {
            total=total/2;
        }
       total= total+250;
    }
    if(s.equalsIgnoreCase("Industrial"))
    {
         total=(x*8)+500;
        if(total<=8500)
        {
           total=(total-(total*(0.1)));
        }

    }
    return total;
    }
}
public class Electricity {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the connection name");
        String s =sc.next();
        System.out.println("enter the units");
        int x=sc.nextInt();
        BillGenerate bg = new BillGenerate();
        System.out.println("total bill is:"+bg.bill(x,s)+"for "+s+" purpose");

    }
}
