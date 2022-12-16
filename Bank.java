import java.sql.*;
import java.util.Scanner;



public class Bank{
    public static void main(String... args) throws ClassNotFoundException ,SQLException
    {

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet result=null;
        try
        {
            String un="root";
            String pass="Mohanreddy123@";
            String s = "jdbc:mysql://localhost:3306/mohan";
            Class.forName("com.mysql.cj.jdbc.Driver");


            conn=DriverManager.getConnection(s,un,pass);
            System.out.println("connection success");
    Scanner sc = new Scanner(System.in);




            String sql1="{call get_card_details(?,?,?)}";
            CallableStatement cstmt=conn.prepareCall(sql1);
            System.out.println("enter the account number");
            String s1=sc.next();
            cstmt.setString(1, s1);
            System.out.println("enter the month ");
            int y=sc.nextInt();
            cstmt.setInt(2,y);
            cstmt.registerOutParameter(3,Types.INTEGER);
            cstmt.execute();
            if(cstmt.getInt(3)!=0 && y<=12) {
                System.out.println("Account number:" + s1);
                System.out.println("Month:" + y);
                System.out.println("Due:" + cstmt.getInt(3));
            }
            else
            {
                System.out.println("account number not found");
            }
        }
        catch (Exception e)
        {
            System.out.println("error @@@"+e);
        }



        finally {
            if(conn!=null )
            {
                try
                {
                    conn.close();
                }
                catch (Exception e)
                {
                    System.out.println("error"+e.getMessage());
                }
            }
            if(pstmt!=null)
                try
                {
                    pstmt.close();
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            if(result!=null)
            {
                try
                {
                    result.close();
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }


        }
    }
}

