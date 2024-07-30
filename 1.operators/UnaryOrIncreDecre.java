import java.util.Scanner;

class UnaryOrIncreDecre {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("a++ : "+(a++));
        System.out.println("++a : "+(++a));
        System.out.println("b-- : "+(b--));
        System.out.println("--b : "+(--b));
        System.out.println("++a + a++ : "+(++a + a++));
        System.out.println("++a + ++a : "+(++a + ++a));
        System.out.println("b-- + b-- : "+(b-- + b--));
        System.out.println("b-- + --b : "+(b-- + --b));
        sc.close();

    }
}
