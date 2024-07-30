import java.util.Scanner;

class HCMOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int largest = (num1>num2)?num1:num2;


        for(int i=largest/2;i>=2;i--) { 
            if(num1%i==0 && num2%i==0) {
                largest = i;
                break;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 +" is: " + largest);
    }
}

