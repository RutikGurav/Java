
import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        String rev="";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int len = name.length();

        for(int i=len-1;i>=0;i--){
            rev += name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("The given string is a palindrome.");
        }else{
            System.out.println("The given string is not a palindrome.");
        }
    }
}
