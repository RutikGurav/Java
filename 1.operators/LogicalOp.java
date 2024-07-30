import java.util.Scanner;

class LogicalOp {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("(a>b)||(a<b) : "+((a>b)||(a<b)));
        System.out.println("(a!=b) && (b>a) : "+((a!=b) && (b>a)));
        sc.close();
    }
}
