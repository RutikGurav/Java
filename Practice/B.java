interface Payment{
    abstract void processPayment(double amount);
    abstract String getPaymentStatus();

    static String getPamentMethod(){
        return "This is general Payement Method.";
    }
}
class CreditCardPayment implements Payment{
    private String status;

    public void processPayment(double amount){
        status = "Payment of $"+amount+" made using Credit Card.";
    }

    public String getPaymentStatus(){
        return status;
    }
}
class PayPalPayment implements Payment{
    private String status;

    public void processPayment(double amount){
        status = "Payment of $"+amount+" made using PayPal.";
    }

    public String getPaymentStatus(){
        return status;
    }
}
class B{
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        creditCard.processPayment(100);
        System.out.println(creditCard.getPaymentStatus());

        Payment payPal = new PayPalPayment();
        payPal.processPayment(200);
        System.out.println(payPal.getPaymentStatus());

        System.out.println(Payment.getPamentMethod());
    }
}