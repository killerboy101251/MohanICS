import java.util.ArrayList;
import java.util.Scanner;

public class Users1 extends Thread {
    Bank b;
    Bank B = new Bank();

    Users1(Bank b)
    {
        this.b=b;
        Thread t = new Thread(this,"Users1");
        t.start();
    }
    ArrayList<UserDetails> MYBANK = new ArrayList<>();


    double balance=0.00;

    static boolean flag=false;
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        UserDetails ud1 = new UserDetails("mohan", 21, 14012001, "1011401200121", 100);
        MYBANK.add(ud1);
        while (true) {
            System.out.println("Choose the operation to exceute");
            System.out.println("enter 1 :to create an new account 2:Deposit the money 3:to withdraw money 4:close the account #PRESS Any key to exit");
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

                System.out.println("your bank account was successfully created.....");

                System.out.println("its your new account number:->" + new_Accountnumber);
                System.out.println("your new balance is:0.00");
                UserDetails ud = new UserDetails(s, age, dob, new_Accountnumber, balance);
                MYBANK.add(ud);

            }


            if (response == 2) {

                System.out.println("enter the money to deposit");
                double deposit_money = sc.nextDouble();

                System.out.println("enter your account number");
                String acctnum = sc.next();
                int flag1 = 0;
                for (UserDetails ud : MYBANK) {
                     if (ud.new_AccountNumber.equalsIgnoreCase(acctnum) ) {
                        flag1 = 1;
                        flag = true;
                        ud.balance=B.deposit_money(deposit_money,ud.balance);
                       System.out.println("new balance is:" + ud.balance);

                        try {
                            Thread.sleep(10000);
                        } catch (Exception e) {
                                System.out.println(e.getMessage());
                        }

                        System.out.println("operation done......Credited");
                        flag = false;


                    }
                }
                if (flag1 == 0) {
                    System.out.println("user not found plz try again");
                }
            }


            if (response == 3) {
                int flag1 = 1;
                System.out.println("enter the money to withdarw");
                double withdraw_money = sc.nextDouble();


                System.out.println("enter your account number");
                String acctnum = sc.next();


                for (UserDetails i : MYBANK) {

                    if (i.new_AccountNumber.equalsIgnoreCase(acctnum)) {

//                        if(flag) {
//                            try {
//                                wait();
//                            } catch (Exception e) {
//
//                            }

                        if (i.balance >= withdraw_money && !flag) {
                            flag = true;
                            System.out.println("New balance is:" + B.withdraw_money(withdraw_money, i.balance));
                            System.out.println("Money is withdrawing cant perform other operations");
                            try {
                                Thread.sleep(10000);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());

                            }
                            flag1 = 0;
                            System.out.println("money is withdrawn cmpltd.........");
                            flag = false;

                        } else {
                            System.out.println("money doesnt matches");
                        }
                    }
                }


                if (flag1 == 1) {
                    System.out.println("user not found try again");
                }
            }


        if (response == 4) {

            System.out.println("are you sure you want to close the account Press 1: to close 2:EXIT");
            int response1 = sc.nextInt();
            if (response1 == 1) {
                System.out.println("enter your account number");
                String acctnum = sc.next();
                MYBANK.removeIf(i -> i.new_AccountNumber.equalsIgnoreCase(acctnum));
            }
        }


        if (response > 4) {
            break;
        }
    }
        }
    }




