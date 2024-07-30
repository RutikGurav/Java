interface CustomerRohan {
    public static final int rice = 5;
    abstract void purchase();
}
class SellerDigu implements CustomerRohan{
    int rice = 10;
    
    @Override
    public void purchase() {
        System.out.println("Rohan purchased " + rice + " kg of rice.");
    }
}
class Main {
    public static void main(String[] args) {
        CustomerRohan customerRohan = new SellerDigu();
        customerRohan.purchase();  
        System.out.println(CustomerRohan.rice);
    }
}
