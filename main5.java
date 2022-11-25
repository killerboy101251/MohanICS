public class main5 {
    public static void main(String args[])
    {
        permenantEmployee p = new permenantEmployee();
        p.setEmployee_name("jhon");
        p.setEmployee_netSalary(400000);
        p.setPfpercent_filed(12);
       System.out.println(p.salary());
    }
}
