class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Lion extends Animal {
    void makeSound() {
        System.out.println("Lion roars");
    }
}

class Elephant extends Animal {
    void makeSound() {
        System.out.println("Elephant trumpets");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();

        lion.makeSound();      // Outputs: Lion roars
        elephant.makeSound();  // Outputs: Elephant trumpets
    }
}
