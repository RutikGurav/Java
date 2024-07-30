class Example2 {
    int age;
    String name;
    Example2(){
        this(11);
        System.out.println("I am a default constructor");
    }
    Example2(int age){
        this(22,"Rutik");
        System.out.println("I am a constructor with single parameter");
    }
    Example2(int age, String name){
        System.out.println("I am a constructor with two parameter");
        this.age = age;
        this.name = name;
    }

    // public void showData(){
    //     System.out.println("Name : "+name);
    //     System.out.println("Age : "+age);
    // }
    public static void main(String[] args) {
        Example2 example = new Example2();
        // example.age = 100;
        // example.name = "Pratik";
        // example.showData();
        System.out.println("Name : "+example.name);
        System.out.println("Age : "+example.age);
    }

}
/*
I am a constructor with two parameter
I am a constructor with single parameter
I am a default constructor
Name : Rutik
Age : 21
 */
