class Animal{
    public static void aName(){
        System.out.println("This is Animal class");
    }
}
class Dog extends Animal{
    public static void aName(){
        System.out.println("This is Dog class");
    }
}

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.aName(); 

        //static binding
        Animal cat = new Dog();
        cat.aName();  
        
        Dog dog = new Dog();
        dog.aName(); 
    }
}
