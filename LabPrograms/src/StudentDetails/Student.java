package StudentDetails;

import java.util.Scanner;

public class Student {
    private String usn;
    private String name;
    private String branch;
    private String phone;

    // Constructor to initialize the student object
    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    // Method to display student information
    public void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Create an array to store n Student objects
        Student[] students = new Student[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Branch: ");
            String branch = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();

            // Create a new Student object with the entered details
            students[i] = new Student(usn, name, branch, phone);
        }

        // Display details of all students
        System.out.println("Student Details:");
        for (Student student : students) {
            student.display();
        }
    }
}

