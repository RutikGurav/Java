class AutoMobile{
    private int topSpeed;
    private String brandName;
    private String yearOfManufacture;
    private int cost;
    private int durability;

    public AutoMobile(int topSpeed, String brandName, String yearOfManufacture, int cost, 
    int durability){
        this.topSpeed = topSpeed;
        this.brandName = brandName;
        this.yearOfManufacture = yearOfManufacture;
        this.cost = cost;
        this.durability = durability;
    }

    public void movement(){
        System.out.println("AutoMobile.movement() was called...");
    }
    public void speed(int speed){
        System.out.println("AutoMobile is moving at speed " + speed);
    }
}

class Car extends AutoMobile{
    private String streeingWheels;
    private String moonRoof;
    private String batteryLife;
    private String headLamps;

    public Car(int topSpeed, String brandName, String yearOfManufacture, int cost, 
    int durability,String stearingWheels,String moonRoof,String batteryLife,String headLamps){
        super(topSpeed, brandName, yearOfManufacture, cost, durability);
        this.streeingWheels = stearingWheels;
        this.moonRoof = moonRoof;
        this.batteryLife = batteryLife;
        this.headLamps = headLamps;
    }

    @Override
    public void movement(){
        System.out.println("Car.movement() was called...");
        super.movement();
    }

    @Override
    public void speed(int speed){
        System.out.println("Car is moving at speed: "+speed);
        super.speed(speed);
    }
}
class TestResult{
    public static void main(String[] args) {
        AutoMobile auto = new AutoMobile(40,"Audi","2015",200000,5);
        auto.movement();
        auto.speed(30);
        Car car = new Car(60,"LandRover","2000",1000000,10,"yes","yes","500Mhz","yes");
        car.movement();
        car.speed(50);
        
    }
}