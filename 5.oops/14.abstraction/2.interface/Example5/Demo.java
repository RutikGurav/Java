interface Animal {
    abstract void sound();

    static void sleep(){
        System.out.println("Slepping....");
    }
}
class Cat implements Animal {
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
class Demo{
    public static void main(String[] args) {
        Animal dog = new Cat();
        dog.sound();
        Animal.sleep();
    }
}
