public class Suzu {
    public static void main(String[] args) {
        String[] student = {"zoe", "zue"};
        student[0] = "kevin";
        System.out.println(student[0]);
        System.out.println(student.length);
        System.out.println(student.clone());
    }
}
