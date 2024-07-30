class GroceryMart1 {
    private static String custId;
    private static  String custName;
    private static String custNo;
    private static double accBal;
    private static String address;

    public GroceryMart1(){
        this(custId, custName);
        System.out.println("I am a default GroceryMart");
    }
    public GroceryMart1(String custId, String custName){
        this(custId, custName,custNo);
        this.custId = custId;
        this.custName = custName;
        System.out.println("I am a GroceryMart with customer details");
    }
    public GroceryMart1(String custId, String custName, String custNo){
        this(custId, custName, custNo, accBal, address);
        this.custId = custId;
        this.custName = custName;
        this.custNo = custNo;
        System.out.println("I am a GroceryMart with customer contact details");
    }
    public GroceryMart1(String custId, String custName, String custNo, double accBal, String address){
        this.custId = custId;
        this.custName = custName;
        this.custNo = custNo;
        this.accBal = accBal;
        this.address = address;
        System.out.println("I am a GroceryMart with complete customer details");
    }


    public void shop(double money){
        if(accBal>=money) {
            double remBal = accBal - money;
            System.out.println("Thanks for shopping, your account balance is : "+remBal);
            accBal = remBal;
        }else{
            double lowbal = money - accBal;
            System.out.println("Insufficient balance, please add more money,add money : "+lowbal);
        }
    }
    public void recharge(double recharge){
        accBal += recharge;
        System.out.println("Thank you for recharging, Your account balance is : "+accBal);
    }

    public static void main(String[] args) {
        // GroceryMart1 gm = new GroceryMart1();
        // gm.shop(700);

        GroceryMart1 gm1 = new GroceryMart1("01", "Rutik", "9011", 1000.29, "Pune");
        gm1.shop(500);

       
    }
}
