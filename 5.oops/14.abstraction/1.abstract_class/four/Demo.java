abstract class Animal{
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public String eat(){
        return (name+" is eating..");
    }

    public String getName(){
        return name;
    }

    public abstract void height();
    public abstract void lifespan();
}
class Elephant extends Animal{

    public Elephant(String name){
        super(name);
    }
    @Override
    public void height(){
        super.eat();
        // System.out.println(getName()+" height is 5 meter.");
        System.out.println(super.eat()+"\n"+name+" height is 5 meter.");
    }

    @Override
    public void lifespan(){
        // System.out.println(getName()+" lifespan is 150 years.");
        System.out.println(name+" lifespan is 150 years.");
    }
}
class Birds extends Animal{

    public Birds(String name){
        super(name);
    }

    @Override
    public void height(){
        super.eat();
        System.out.println(super.eat()+"\n"+name+" heigth is 3 cms");
    }

    @Override
    public void lifespan(){
        System.out.println(name+" lifespan is 2 years.");
    }
}
class Demo {
    public static void main(String[] args) {
        // Animal alephant = new Animal("Alephant");

        Animal elephant = new Elephant("Tiger");
        elephant.height();
        elephant.lifespan();

        Animal picoc = new Birds("Picoc");
        picoc.height();
        picoc.lifespan();

    }
}
