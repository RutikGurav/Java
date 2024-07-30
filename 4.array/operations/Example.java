
import java.util.Arrays;

class Example {
    public static void main(String[] args) {
        int marks[] = {12,4,46,75,57};
        marks[1] = 100;
        Arrays.sort(marks);
        // Arrays.fill(marks,0);
        // int copyMarks[] = Arrays.copyOf(marks,3);
        System.out.println(Arrays.toString(marks));  
        int copyMarks[] = Arrays.copyOfRange(marks,1,3);
        System.out.println(Arrays.toString(copyMarks));  


    }
}
