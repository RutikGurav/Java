import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        int i=1, sum=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
