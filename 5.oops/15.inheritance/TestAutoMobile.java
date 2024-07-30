

class TestAutoMobile {
    public static void main(String[] args) {
        AutoMobile testAutoMobile = new AutoMobile(330,"LandRover","2016",2000000,10);
        testAutoMobile.movement();

        Car car = new Car(250,"RangeRover","2002",10000000,30,"yes","yes","100kw","yes");
        car.movement();
        car.speed(40);
    }
}
