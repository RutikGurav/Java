
import java.util.Scanner;

class HCMOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int largest;

        if(num1>num2 && num1>num3){
            largest = num1;
        }else if(num2>num3){
            largest = num2;
        }else{
            largest = num3;
        }


        for(int i=largest/2;i>=2;i--) { 
            if(num1%i==0 && num2%i==0 && num3%i==0) {
                largest = i;
                break;
            }
        }
        System.out.println("The HCM of " + num1 + " and " + num2 +" and "+ num3 +" is: " + largest);
    }
}

