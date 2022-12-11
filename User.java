
class  Bank extends Thread
{


        double deposit_money(double deposit_money,double balance )
        {
                try {
                    balance = balance + deposit_money;


                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            return balance;
        }
   double withdraw_money(double withdraw_money,double balance )
    {
        balance=balance-withdraw_money;
        return  balance;
    }

}
public class User extends Thread {
    public static void main(String[] args) {
        Bank b = new Bank();
        Users1 u1 = new Users1(b);
    }
}

