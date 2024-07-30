
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Example2 {
    public static void main(String[] args) {
        try {
            File file = new File("Demo.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                System.out.println(sc.hasNextLine());//go 1st line check line present or not if yes return true
                System.out.println(sc.nextLine());//print the text
                System.out.println(sc.hasNextLine());//go 1st line check line present or not if yes return true
            }
            sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Exception is Handled!!");
            }
        
    }
}
/*
 * 
true
Hello, my name is Rutik Gurav and i am from kolhapur itself.
true
true
And i currently based in pune pursuing Full Stack Java Development
false
 */