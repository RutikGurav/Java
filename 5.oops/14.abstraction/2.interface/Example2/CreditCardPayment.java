class CreditCardPayment implements Payment{
    private String status;

    @Override
    public void processPayment(double amount){
        status = "Payment of $"+amount+" made using Credit Card.";
    }

    @Override
    public String getPaymentStatus(){
        return status;
    }

}
