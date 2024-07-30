
import java.util.Scanner;

class LCMOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int largest = (num1>num2)?num1:num2;

        while (true) { 
            if(largest%num1==0 && largest%num2==0) {
                System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + largest);
                break;
            }
            largest++;
        }
    }
}
