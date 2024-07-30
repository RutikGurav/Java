class GroceryMart {
    private String custId;
    private String custName;
    private String custNo;
    private double accBal;
    private String address;

    public void setCustId(String custId) {
        this.custId = custId;
    }
    public String getcustId(){
        return custId;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustName(){
        return custName;
    }
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
    public String getCustNo(){
        return custNo;
    }
    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }
    public double getAccBal(){
        return accBal;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
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
        GroceryMart gm = new GroceryMart();
        gm.setCustId("01");
        gm.setCustName("Rutik Gurav");
        gm.setCustNo("9876543210");
        gm.setAccBal(1000.0);
        gm.setAddress("Pune, India");

        gm.shop(700);
        gm.shop(700);
        gm.recharge(500);
        gm.shop(300);
    }
}
