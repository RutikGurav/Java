import  java.util.*;
class ForenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double forenheit = sc.nextDouble();

        double celsius = (forenheit-32)*5/9;

        System.out.println(celsius);
    }
}
