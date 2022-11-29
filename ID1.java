//create an user defined exception and nrml exception and print both excepyions in same class
class NewException extends Exception
{
    NewException(String s)
    {
        super(s);
    }
}
public class ID1 {

        static void ValidateDivison(int x)
        {
            try
            {
                int y=10/x;
                System.out.println("executed:"+y);
            }
            catch (ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
        }
        static void validateAge(int age) throws NewException
        {
            if(age <18)
            {
                throw new NewException("age is not sufficient to vote");
            }
            else
            {
                System.out.println("your eligible:)");
            }
        }
    public static void main(String[] args)
    {

      ValidateDivison(0);
      int age=15;
        try
        {
            validateAge(age);
        }
        catch (NewException ex)
        {
            System.out.println("Exception occured:"+ex.getMessage());
        }
    }


}
