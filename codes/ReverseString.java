
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        String rev="";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int len = name.length();

        for(int i=len-1;i>=0;i--){
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }
}
