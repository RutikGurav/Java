import java.util.Scanner;

class StringPattern {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        int len = name.length();

        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+name.charAt(j));
            }
            System.out.println();
        }
    }
}
