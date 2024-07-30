abstract class Animal {
    abstract void sound();

    public void sleep(){
        System.out.println("Slepping....");
    }
}
class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Woof");
    }
}
class Demo{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}
