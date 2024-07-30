/*Scope of the variable is a region of the program in which the variable is visible. i.e
 * in which it accessible by name and can be displayed
 * 
 * 4 keywords for deciding scope of variable
 * 1. public 2. private 3. protected 4. default
 */
class Example {
    public int publicVar = 5;
    private int privateVar = 1;

    public void checkingScope(){
        System.out.println("The private variable is : " + privateVar + " And the public variable : " + publicVar);
    }

    public int getPrivateVar(){
        return privateVar;
    }

    public int getPublicVar(){
        return publicVar;
    }

    public void multiplier(){
        privateVar = 3;
        for(int i=0;i<5;i++){
            System.out.println(i+" is multiply by "+privateVar+" is : "+(i*this.privateVar));
        }
    }
    public static void main(String[] args) {
        // int privateVar = 10;
        Example example = new Example();
        System.out.println("The private variable is : "+example.getPrivateVar());
        System.out.println("The private variable is : "+privateVar);
        //we cant access the private variable directly because it is private
        System.out.println("The public variable is : "+example.getPublicVar());
        example.multiplier();


    }
}
