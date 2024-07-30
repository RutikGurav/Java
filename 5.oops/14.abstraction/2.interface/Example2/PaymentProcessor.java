class PaymentProcessor {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(100.0);
        System.out.println(creditCardPayment.getPaymentStatus());

        Payment payPalPayment = new PayPalPayment();
        payPalPayment.processPayment(200.0);
        System.out.println(payPalPayment.getPaymentStatus());

        System.out.println(Payment.getPaymentMethod());
    }
}
