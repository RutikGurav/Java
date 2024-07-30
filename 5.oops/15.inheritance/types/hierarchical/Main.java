class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sheru");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Kajol");
        cat.eat();
        cat.meow();

        Bird bird = new Bird("Duck");
        bird.eat();
        bird.fly();
    }
}
