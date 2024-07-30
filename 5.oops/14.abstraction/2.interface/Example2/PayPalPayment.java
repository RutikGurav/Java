class PayPalPayment implements Payment{
    private String status;

    @Override
    public void processPayment(double amount){
        status = "Payment of $"+amount+" made using PayPal.";
    }
    @Override
    public String getPaymentStatus(){
        return status;
    }
}
