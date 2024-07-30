class Animal {
    //static void speak(){
        void speak(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    //static void speak(){
    void speak(){
        System.out.println("Dog barks");
    }
}
class Test{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak(); // Animal makes a sound
        
        Animal dog = new Dog();
        dog.speak(); // Dog barks
    }
}
