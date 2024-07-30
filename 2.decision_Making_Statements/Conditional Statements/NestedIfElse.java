
import java.util.Scanner;


class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1>num3){
            if(num1>num2){
                System.out.println("Greatest number is: " + num1);
            }else{
                System.out.println("Greatest number is: " + num2);
            }
        }else{
            if(num2>num3){
                System.out.println("Greatest number is: " + num2);
            }else{
                System.out.println("Greatest number is: " + num3);
            }
        }

    }
}
