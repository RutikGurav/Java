import java.util.Scanner;

class BitwiseOp {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("a&b = "+(a&b));
        System.out.println("a|b = "+(a|b));
        System.out.println("a^b = "+(a^b));
        System.out.println("~a = "+(~a));
        System.out.println("a<<b = "+(a<<b));
        System.out.println("a>>b = "+(a>>b));
        System.out.println("a>>>b = "+(a>>>b));
        System.out.println("c<<b = "+(c<<b));
        System.out.println("c>>b = "+(c>>b));

    }
}
