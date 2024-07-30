import java.util.Scanner;

class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        do{
            System.out.println(num+" * "+num+ " = "+(num*num));
            num--;
        }while(num>=1);
    }
}
