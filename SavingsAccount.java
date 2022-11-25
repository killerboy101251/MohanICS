public class SavingsAccount implements Account2 {
    int intial_amount=1000;
    @Override
    public int deposit(int camount) {
        intial_amount =intial_amount+camount;
        return intial_amount;
    }

    @Override
    public int withdraw(int camount)
    {
        intial_amount=intial_amount-camount;
        return  intial_amount;
    }
}
