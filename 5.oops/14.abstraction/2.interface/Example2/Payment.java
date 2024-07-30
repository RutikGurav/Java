interface Payment {
    abstract void processPayment(double amount);
    abstract String getPaymentStatus();

    static String getPaymentMethod(){
        return "This is general payment method.";
    }
}
