class Cellphone {
    private int ram;
    private int noOfCameras;
    private String model;
    private String color;
    private String processor;

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        if(validModel.equals("samsung")||validModel.equals("7pro")){
            this.model = model;
        }else{
            this.model = "Unknown!!";
        }
        
    }
    public String getModel(){
        return this.model;
    }
    public static void main(String[] args) {
        Cellphone onePlus = new Cellphone();

        onePlus.setModel("7pro");
        System.out.println(onePlus.getModel());

        Cellphone twoPlus = new Cellphone();

        twoPlus.setModel("8pro");
        System.out.println(twoPlus.getModel());

        Cellphone threePlus = new Cellphone();
        threePlus.setModel("samsung");
        System.out.println(threePlus.getModel());

    }
}
