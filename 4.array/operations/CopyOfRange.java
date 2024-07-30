import java.util.Arrays;


class CopyOfRange {
    public static void main(String[] args) {
        int marks[] = {46,68,65,78,42};
        int marksCopy[] = Arrays.copyOfRange(marks,1,3);
        String mstr = Arrays.toString(marksCopy);
        System.out.println(mstr);
    }
}

