import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter USN: ");
        String usn = sc.nextLine();
        System.out.print("Enter phone: ");
        int phone = sc.nextInt();
        Student s1 = new Student(name,branch,usn,phone);
        s1.display();
    }
}
