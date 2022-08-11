
public class Student {
    private int rollno;
    private String name;
    private static String college ="Quan";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "Quan";
    }

    void display() {
        System.out.println(college + "jsfhjd");
    }
}
