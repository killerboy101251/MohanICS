public class permenantEmployee extends EMPLOYEE{
    int pfpercent_filed;

    public int getPfpercent_filed() {
        return pfpercent_filed;
    }

    public void setPfpercent_filed(int pfpercent_filed) {
        this.pfpercent_filed = pfpercent_filed;
    }

    double salary()
    {
        double x = pfpercent_filed*0.01;
        employee_salary=employee_netSalary-(x*employee_netSalary);
        System.out.println(employee_name);
        return employee_salary;
    }

}
