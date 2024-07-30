class One {
    public static void main(String[] args) {
        int num = 5;
        try {
            int result = num/0;
            // int result = num/2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured and Handled!!");
        }
    }
}
