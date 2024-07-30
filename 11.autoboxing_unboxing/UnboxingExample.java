class UnboxingExample {
    public static void main(String[] args) {
        Integer a = new Integer(10);

        int b = a.intValue();
        
        System.out.println(a);
        System.out.println(b);
    }
}
