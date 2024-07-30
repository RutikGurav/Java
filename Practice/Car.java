class Car{
    static class Manufacture{
        public static final String name = "Rutiks Inc.";

        static void displayManufacture(){
            System.out.println("Manufacture : "+name);
        }
    }

    class Engine{
        private int horsepower;

        public Engine(int horsepower){
            this.horsepower = horsepower;
        }
        public void start(){
            System.out.println("Engine with "+horsepower+" HP is started...");
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
        Car.Manufacture.displayManufacture();

        Car car = new Car("BMW");
        car.displayModel();

        Car.Engine engine = car.new Engine(150);
        engine.start();
    }
}