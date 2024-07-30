class Car {
    //Nested static class
    static class Manufacture{
        public static final String name = "Automaker Inc.";

        static void displayManufacture(){
            System.out.println("Manufacture : "+name);
        }
    }
    //Member inner class
    class Engine{
        private int horsepower;

        public Engine(int horsepower){
            this.horsepower = horsepower;
        }
        public void start(){
            System.out.println("Engine with "+horsepower+" Hp is started...");
        }
    }

    private String model;

    public Car(String model){
        this.model = model;
    }

    public void displayModel(){
        System.out.println("Car Model : "+model);
    }

    public static void main(String[] args) {
        //addressing nested static class
        Car.Manufacture.displayManufacture();

        Car car = new Car("Sedan");
        car.displayModel();

        //creating as instance of the memberinner class
        Car.Engine engine = car.new Engine(200);
        engine.start();

    }

}