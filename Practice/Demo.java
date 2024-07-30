
import java.io.File;
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Rutik\\Desktop\\Programming\\practice\\Practice\\Demo.txt");
            Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.hasNextLine());
            System.out.println(sc.nextLine());
            System.out.println(sc.hasNextLine());
        }
        sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}