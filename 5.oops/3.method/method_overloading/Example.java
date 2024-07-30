

class Example {

    public void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
    public void add(String str, String str1){
        String sum = str + str1;
        System.out.println("Sum: " + sum);
    }
    public void add(float num1, float num2){
        float sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }   
    
    
    public static void main(String[] args) {
        Example x = new Example();
        x.add(3,5);
        x.add("Rutik ","Gurav");
        x.add(3.5f, 5.5f);
    }

}
