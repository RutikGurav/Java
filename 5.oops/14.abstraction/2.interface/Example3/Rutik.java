import java.util.Scanner;

class Rutik implements Client{
    private String name;
    private double salary;

    // public Rutik(String name, double salary) {
    //     this.name = name;
    //     this.salary = salary;
    // }

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter salary : ");
        salary = sc.nextDouble();
    }

    @Override
    public void output(){
        System.out.println(name+" "+salary);
    }
}
