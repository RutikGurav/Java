import java.util.Scanner;

class TernaryOrConditionalOp{
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int min = (num1>num2)?num1:num2;
        System.out.println("Gretest number is : "+min);
        sc.close();
    }
}