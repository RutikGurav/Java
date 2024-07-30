interface CanFly{
    public static final int flySpeed = 5;

}
interface CanSwim extends CanFly{
    public static final int swimSpeed = 3;

    public abstract void fly();

    public abstract void swim();
}
class Duck implements CanFly,CanSwim{

    public String name;
    public int age;

    public Duck(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void fly(){
        System.out.println(name+" is flying at speed "+flySpeed);
    }
    @Override
    public void swim(){
        System.out.println(name+" is swimming at speed "+swimSpeed);
    }

    public void displayDetails(){
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
class AutoUn{
    public static void main(String[] args) {
        Duck duck = new Duck("Duck", 4);
        duck.displayDetails();
        duck.fly();
        duck.swim();
    }
}