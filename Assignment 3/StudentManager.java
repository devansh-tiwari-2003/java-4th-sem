package PIJ_Class_1;

import java.util.Scanner;

class Student {
    int prn;
    String name;
    String dob;
    float marks;

    public Student(int prn, String name, String dob, float marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public void display() {
        System.out.println("PRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Marks: " + marks);
    }

    public void update(String name, String dob, float marks) {
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }
}

public class StudentManager {
    private static final int MAX_STUDENTS = 100;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("-----Student Manager-----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search By PRN");
            System.out.println("4. Search By Name");
            System.out.println("5. Search By Position");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchByPRN();
                    break;
                case 4:
                    searchByPRN();
                    break;
                case 5:
                    searchByPRN();
                    break;
                case 6:
                    addStudent();
                    break;
                case 7:
                    addStudent();
                    break;
                case 8:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
            System.out.println();
        } while (choice != 8);
    }

    private static void addStudent() {
        if (numStudents == MAX_STUDENTS) {
            System.out.println("Maximum number of students reached.");
            return;
        }
        System.out.print("Enter PRN: ");
        int prn = scanner.nextInt();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Date of Birth (dd/mm/yyyy): ");
        String dob = scanner.next();
        System.out.print("Enter Marks: ");
        float marks = scanner.nextFloat();

        Student student = new Student(prn, name, dob, marks);
        students[numStudents] = student;
        numStudents++;
        System.out.println("Student added successfully.");
    }

    private static void displayAllStudents() {
        if (numStudents == 0) {
            System.out.println("No students found.");
            return;
        }
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
            System.out.println();
        }
    }

    private static void searchByPRN() {
        if (numStudents == 0) {
            System.out.println("No students found.");
            return;
        }
    }
}