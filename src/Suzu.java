import java.util.Arrays;
import java.util.Scanner;

public class Suzu {
    public static void main(String[] args) {
        String[] students = new String[3];
        for (int i = 0; i < students.length ; i++) {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            students[i] = name;
        }

        System.out.println(Arrays.toString(students));

    }
}
