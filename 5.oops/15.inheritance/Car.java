class Car extends AutoMobile{
    private String streeingWheel;
    private String moonRoof;
    private String batterySize;
    private String headLamps;

    public Car(double topSpeed, String brandName, String yearOfManufacture, double cost, 
    double durability, String streeingWheel, String moonRoof, String batterySize, 
    String headLamps){

        super(topSpeed, brandName, "2018", 100000, durability);

        this.streeingWheel = streeingWheel;
        this.moonRoof = moonRoof;
        this.batterySize = batterySize;
        this.headLamps = headLamps;
    }

    @Override
    public void movement(){
        System.out.println("Car.movement() was called...");
        super.movement();
    }

    @Override
    public void speed(double speed){
        System.out.println("Car is moving at speed: "+speed);
        super.speed(speed);
    }
}