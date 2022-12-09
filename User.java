import java.util.ArrayList;
import java.util.Scanner;
class Bank
{

       synchronized double deposit_money(double deposit_money,double balance )
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
   synchronized double withdraw_money(double withdraw_money,double balance )
    {
        balance=balance-withdraw_money;
        return  balance;
    }

}
public class User
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank B = new Bank();
       double balance =0;
        ArrayList<UserDetails> MYBANK = new ArrayList<>();


    while(true) {

        System.out.println("Choose the operation to exceute");
        System.out.println("enter 1 :to create an new account 2:Deposit the money 3:to withdraw money 4:close the account PRESS Any key to exit");
        int response = sc.nextInt();


        if (response == 1) {

                    System.out.println("enter your name:");
                    String s = sc.next();
                    System.out.println("enter your age:");
                    int age = sc.nextInt();
                    System.out.println("enter your DOB without any gap");
                    long dob = sc.nextLong();
                    System.out.println("your new account number is");
                    String new_Accountnumber = "101" + dob + age;
                    System.out.println("its your new account number:->" + new_Accountnumber);
                    System.out.println("your bank account was successfully created.....");
                    System.out.println("your new balance is:0.00");
                    UserDetails ud = new UserDetails(s, age, dob, new_Accountnumber, balance);
                    MYBANK.add(ud);

                }




        if (response == 2) {

                    System.out.println("enter the money to deposit");
                    double deposit_money = sc.nextDouble();

                    System.out.println("enter your account number");
                    String acctnum = sc.next();
                    int flag = 0;
                    for (UserDetails ud : MYBANK) {
                        if (ud.new_AccountNumber.equalsIgnoreCase(acctnum)) {
                            System.out.println("new balance is:" + B.deposit_money(deposit_money, balance));
                        }
                    }
                    if (flag == 0) {
                        System.out.println("user not found plz try again");
                    }
                }








                        if (response == 3) {
                            {
                            System.out.println("enter the money to withdarw");
                            double withdraw_money = sc.nextDouble();


                            System.out.println("enter your account number");
                            String acctnum = sc.next();
                            int flag = 1;

                            for (UserDetails i : MYBANK) {
                                System.out.println(i.new_AccountNumber);
                                if (i.new_AccountNumber.equalsIgnoreCase(acctnum)) {
                                    if (i.balance >= withdraw_money) {
                                        System.out.println("New balance is:" + B.withdraw_money(withdraw_money, balance));
                                        flag = 0;
                                    } else {
                                        System.out.println("money doesnt matches");
                                    }
                                }

                            }
                            if (flag == 1) {
                                System.out.println("user not found try again");
                            }
                        }








                        if (response == 4) {

                            System.out.println("are you sure you want to close the account Press 1: to close 2:EXIT");
                            int response1 = sc.nextInt();
                            if (response1 == 1) {
                                System.out.println("enter your account number");
                                String acctnum = sc.next();
                                for (UserDetails i : MYBANK) {
                                    if (i.new_AccountNumber.equalsIgnoreCase(acctnum)) {
                                        MYBANK.remove(i);
                                    }
                                }
                            }
                        }

                }

                if(response>4) {
                    break;
                }
            }

    }
}

