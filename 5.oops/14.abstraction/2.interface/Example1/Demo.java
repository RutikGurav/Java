class Demo {
    public static void main(String[] args) {
        Animal a1 = new Human();
        a1.talk();
        a1.see();
        a1.move();

        System.out.println();
        
        Animal a2 = new Snake();
        a2.talk();
        a2.see();
        a2.move();
    }
}
