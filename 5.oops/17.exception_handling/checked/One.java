
import java.io.FileNotFoundException;
import java.io.FileReader;

class One {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Inside a finally block!!");
            try {
                fr.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
