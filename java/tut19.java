import java.util.ArrayList;
import java.util.Scanner;

public class StudentCollection {

    public static void main(String[] args) {
        Scanner sxccvfygyytcanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Mobile No.: ");
            long mobileNo = scanner.nextLong();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Gender (M/F): ");
            char gender = scanner.nextLine().charAt(0);

            students.add(new Student(name, mobileNo, marks, gender));
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private long mobileNo;
    private int marks;
    private char gender;

    public Student(String name, long mobileNo, int marks, char gender) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.marks = marks;
        this.gender = gender;
    }eer

    @Override
    public String toString() {
        return "Name: " + name + ", Mobile No.: " + mobileNo + ", Marks: " + marks + ", Gender: " + gender;
    }
}
