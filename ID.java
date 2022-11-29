//create a 5 object class and check weather you have an id given by the user if exists return user already defined

import java.util.Scanner;

class hello1 extends Exception
{
    int id;
    String name;
    String grade;
    hello1(int id,String name,String grade)
    {
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    hello1(String s)
    {
        super(s);
    }



}
public class ID {

    public static void main (String[] args)throws Exception {
        hello1[] h=new hello1[5];
        Scanner sc = new Scanner(System.in);
         h[0] = new hello1(101, "Mohan", "A");
         h[1] = new hello1(102, "Mohan1", "B");
         h[2] = new hello1(103, "Mohan2", "C");
         h[3] = new hello1(104, "Mohan3", "D");
         System.out.println("enter the id ");
         int x =sc.nextInt();
         int flag=0;
         for(int i=0;i<4;i++)
         {
             try {

                 if (h[i].id == x) {

                     throw new hello1("s");

                 }
                 else
                 {
                     flag=1;
                 }

             }
             catch(hello1 ex)
             {
                 System.out.println("USERID ALREADY EXISTS");
                break;


             }

         }
         if(flag==1)
         {
             System.out.println("you can proceed with this id.....");
         }

    }
}
