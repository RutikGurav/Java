
import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Demo.txt");

        while(sc.hasNextLine()){
            System.out.println(sc.hasNextLine());//go 1st line check line present or not if yes return true
            System.out.println(sc.nextLine());//print the test
            System.out.println(sc.hasNextLine());//go 1st line check line present or not if yes return true
        }
        sc.close();
    }
}
