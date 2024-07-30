
import java.util.Scanner;


class Continue {
    public static void main(String[] args) {
        int i=1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // for(i =1 ;i<=num;i++){
        //     if(i==6){
        //         System.out.println(i+" is skipped");
        //         continue;
        //     }
        //     System.out.println(i);

        // }

        while(i<=num){
            if(i==6){
                System.out.println(i+" is skipped");
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
