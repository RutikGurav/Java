
import java.util.Arrays;


class CopyOf {
    public static void main(String[] args) {
        int marks[] = {46,68,65,78,42};
        int marksCopy[] = Arrays.copyOf(marks,3);
        String mstr = Arrays.toString(marksCopy);
        System.out.println(mstr);
    }
}
