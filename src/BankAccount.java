public class BankAccount {
    private int accountNumber ;
    private double accountBalance ;
    private String cutomerName;
    private String email;
    private String phonrNumber ;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonrNumber() {
        return phonrNumber;
    }

    public void setPhonrNumber(String phonrNumber) {
        this.phonrNumber = phonrNumber;
    }
    public void deposit(double depositeBalance)
    {
        accountBalance+=depositeBalance ;
        System.out.println("Deposit of "+ depositeBalance + "$ New Balance is " +
                accountBalance +"$" );
    }

    public void withDrow(double withDrow)
    {
        if (accountBalance-withDrow<1)
        {
            System.out.println("Insufficient Balance you only have "+ accountBalance);
        }
        else
            accountBalance-=withDrow;
        System.out.println("Withdrow transaction of "+withDrow+ " is successfull Your Balance Now is " +
                + accountBalance);
    }
}
