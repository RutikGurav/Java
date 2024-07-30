
import java.util.Scanner;

public class AithmeticOp {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Addition of a and b is : "+(a+b));
        System.out.println("Subtraction of a and b is : "+(a-b));
        System.out.println("Multiplication of a and b is : "+(a*b));
        System.out.println("Division of a and b is : "+(a/b));
        System.out.println("Modulus of a and b is : "+(a%b));
        sc.close();
    }
}
