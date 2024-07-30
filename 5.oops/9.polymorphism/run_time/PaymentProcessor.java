class Payment {
    void processPayment() {
        System.out.println("Processing generic payment");
    }
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

class PayPal extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        Payment payment2 = new PayPal();

        payment1.processPayment(); // Outputs: Processing credit card payment
        payment2.processPayment(); // Outputs: Processing PayPal payment
    }
}
