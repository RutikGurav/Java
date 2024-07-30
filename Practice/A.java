interface CanFly{
    public static final int flyspeed = 5;

    abstract void fly();
}
interface CanSwim{
    public static final int swimspeed = 3;

    abstract void swim();
}

class Duck implements CanFly,CanSwim{
    public String name;
    public Duck(String name){
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.println(name+" is flying at speed "+flyspeed);
    }

    @Override
    public void swim(){
        System.out.println(name+" is swimming at speed "+swimspeed);
    }
}
class A{
    public static void main(String[] args) {
        Duck duck = new Duck("Daffy");
        duck.fly();
        duck.swim();
    }
}