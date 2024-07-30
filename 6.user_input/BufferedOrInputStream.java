import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedOrInputStream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println("Entered Number: " + num);
    }
}
