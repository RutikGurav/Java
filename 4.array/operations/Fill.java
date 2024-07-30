import java.util.Arrays;


class Fill {
    public static void main(String[] args) {
        int marks[] = {46,68,65,78,42};
        Arrays.fill(marks,81);
        String mstr = Arrays.toString(marks);
        System.out.println(mstr);
    }
}
