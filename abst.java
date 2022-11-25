abstract class abst {
    abstract void fun();
}
class derives extends abst{
    derives()
    {
        System.out.println("iam constructor");
    }
    void fun()
    {
        System.out.println("iam abstract class");
    }
    static
    {
        System.out.println("iam static class");
    }
}
class main
{

    public  static  void main(String args[])
    {
        derives d = new derives();

        d.fun();

    }


}
