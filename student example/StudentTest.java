import java.util.Scanner;
import java.util.ArrayList;

class StudentTest {
    public static ArrayList<Student> students = new ArrayList<>();
    
    public static Student[] theStudents = new Student[10];
    public static Student[] students;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int numOfStudents = input.nextInt();

        int count = 0;

        while(count < numOfStudents) {
            //ask student name

            String name = input.nextLine();
            

            Student student = new Student(name);

        }

        input.close();
    }
}