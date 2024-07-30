
import java.util.Scanner;


class ElseIfLadder {
    public static void main(String[] args) {
        String city = "";
        Scanner scanner = new Scanner(System.in);
        city = scanner.nextLine();

        if(city.equals("Kolhapur")){
            System.out.println("Welcome to "+city);
        }else if(city.equals("Nagpur")){
            System.out.println("Welcome to "+city);
        }else if(city.equals("Pune")){
            System.out.println("Welcome to "+city);
        }else if(city.equals("Mumbai")){
            System.out.println("Welcome to "+city);
        }else{
            System.out.println("Invalid city");
        }
    }
}
