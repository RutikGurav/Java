class AutoMobile {
    private double topSpeed;
    private String brandName;
    private String yearOfManufacture;
    private double cost;
    private double durability;

    public AutoMobile(double topSpeed, String brandName, String yearOfManufacture, double cost, 
    double durability) {
        this.topSpeed = topSpeed;
        this.brandName = brandName;
        this.yearOfManufacture = yearOfManufacture;
        this.cost = cost;
        this.durability = durability;
    }

    public void movement(){
        System.out.println("AutoMobile.movement() was called...");
    }
    public void speed(double speed){
        System.out.println("AutoMobile is moving at speed: "+speed);
    }
}

