class Encapsulation{
    private String accNo;
    private double balance;

    public Encapsulation(String accNo, double balance){
        this.accNo = accNo;
        if(balance>0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited : "+amount);
        }else{
            System.out.println("Invalid deposit amount!!");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw : "+amount);
        }else{
            System.out.println("Insuffient amount in your account!!");
        }
    }
    public static void main(String[] args) {

        Encapsulation e = new Encapsulation("1234567890",1000);

        System.out.println("Initial Balance : "+e.getBalance());

        e.deposit(500);

        System.out.println("After Deposit : "+e.getBalance());

        e.withdraw(200);

        System.out.println("After Withdrawal : "+e.getBalance());

        e.deposit(-50);
        e.withdraw(2000);
    }
}