class BankAccount {
    private String custName;
    private String mobNo;
    private String accountNumber;
    private double balance;

    public BankAccount(String custName,String mobNo,String accountNumber, double balance) {
        this.custName = custName;
        this.mobNo = mobNo;
        this.accountNumber = accountNumber;
        if(balance>0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }

    public void displayDetails(){
        System.out.println("Customer Name : "+custName+"\nMobile No : "+mobNo+"\nAccount Number : "+accountNumber);
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited "+amount);
        }else{
            System.out.println("Invalid deposit amount!!");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw "+amount);
        }else{
            System.out.println("insufficient balance in your account!!");
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rutik Gurav","9011715158","123456789",1000.0);
        account.displayDetails();
        System.out.println();
        
        System.out.println("Initial Balance is : "+account.getBalance());

        account.deposit(500.0);
        System.out.println("After Deposit is : "+account.getBalance());

        account.withdraw(200.0);
        System.out.println("After Withdrawal is : "+account.getBalance());

        account.deposit(-50);
        account.withdraw(2000.0);
    }
}
