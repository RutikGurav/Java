
import java.util.Scanner;


class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println(num+" is Even No.");
        }else{
            System.out.println(num+" is Odd No.");
        }
    }
}
