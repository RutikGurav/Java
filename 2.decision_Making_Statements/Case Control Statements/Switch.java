
import java.util.Scanner;


class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operator (+,-,*,/,%) : ");
        char op = scanner.next().charAt(0);
        System.out.println("Enter the value of operands : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        switch(op){
            case '+': System.out.println("num1 + num2 = "+(num1+num2));break;
            case '-': System.out.println("num1 - num2 = "+(num1-num2));break;
            case '*': System.out.println("num1 * num2 = "+(num1*num2));break;
            case '/': System.out.println("num1 / num2 = "+(num1/num2));break;
            case '%': System.out.println("num1 % num2 = "+(num1%num2));break;
            default:System.out.println("Invalid Op!!");
        }
    }
}
