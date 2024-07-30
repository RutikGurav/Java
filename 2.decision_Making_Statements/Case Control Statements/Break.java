
import java.util.Scanner;


class Break {
    public static void main(String[] args) {
        int i=1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(i<=num){
            if(i==5){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
