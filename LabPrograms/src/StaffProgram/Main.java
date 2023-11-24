package StaffProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays for at least 3 objects for each category
        Teaching[] teachingStaff = new Teaching[3];
        Technical[] technicalStaff = new Technical[3];
        Contract[] contractStaff = new Contract[3];

        // Input details for Teaching staff
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Teaching Staff " + (i + 1) + ":");
            System.out.print("Staff ID: ");
            String staffId = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            System.out.print("Domain: ");
            String domain = scanner.next();
            System.out.print("Publications: ");
            String publications = scanner.next();

            teachingStaff[i] = new Teaching(staffId, name, phone, salary, domain, publications);
        }

        // Input details for Technical staff
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Technical Staff " + (i + 1) + ":");
            System.out.print("Staff ID: ");
            String staffId = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            System.out.print("Skills: ");
            String skills = scanner.next();

            technicalStaff[i] = new Technical(staffId, name, phone, salary, skills);
        }

        // Input details for Contract staff
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Contract Staff " + (i + 1) + ":");
            System.out.print("Staff ID: ");
            String staffId = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            System.out.print("Contract Period (months): ");
            int period = scanner.nextInt();

            contractStaff[i] = new Contract(staffId, name, phone, salary, period);
        }

        // Display details of all staff members
        displayStaffDetails("Teaching Staff Details:", teachingStaff);
        displayStaffDetails("Technical Staff Details:", technicalStaff);
        displayStaffDetails("Contract Staff Details:", contractStaff);
    }

    private static void displayStaffDetails(String title, Staff[] staffArray) {
        System.out.println(title);
        for (Staff staff : staffArray) {
            staff.display();
        }
        System.out.println();
    }
}
