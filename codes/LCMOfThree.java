import java.util.Scanner;

class LCMOfThree {
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


        while (true) { 
            if(largest%num1==0 && largest%num2==0 && largest%num3==0) {
                System.out.println("The LCM of " + num1 + " and " + num2 +" and "+ num3 +" is: " + largest);
                break;
            }
            largest++;
        }
    }
}

