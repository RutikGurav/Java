class Try_Catch_Finally {
    public static void main(String[] args) {
        try{
            int result = (6+7)/(9-9);
            System.out.println("Result: "+result);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            System.out.println("This is always executed.");
        }
    }
}
