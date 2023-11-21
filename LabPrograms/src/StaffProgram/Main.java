package StaffProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create at least 3 objects for each category
        Teaching[] teachingStaff = new Teaching[3];
        Technical[] technicalStaff = new Technical[3];
        Contract[] contractStaff = new Contract[3];

        for (int i = 0; i < 3; i++) {
            // Input details for Teaching staff
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

            // Input details for Technical staff
            System.out.println("Enter details for Technical Staff " + (i + 1) + ":");
            System.out.print("Staff ID: ");
            staffId = scanner.next();
            System.out.print("Name: ");
            name = scanner.next();
            System.out.print("Phone: ");
            phone = scanner.next();
            System.out.print("Salary: $");
            salary = scanner.nextDouble();
            System.out.print("Skills: ");
            String skills = scanner.next();

            technicalStaff[i] = new Technical(staffId, name, phone, salary, skills);

            // Input details for Contract staff
            System.out.println("Enter details for Contract Staff " + (i + 1) + ":");
            System.out.print("Staff ID: ");
            staffId = scanner.next();
            System.out.print("Name: ");
            name = scanner.next();
            System.out.print("Phone: ");
            phone = scanner.next();
            System.out.print("Salary: $");
            salary = scanner.nextDouble();
            System.out.print("Contract Period (months): ");
            int period = scanner.nextInt();

            contractStaff[i] = new Contract(staffId, name, phone, salary, period);
        }

        // Display details of all staff members
        System.out.println("Teaching Staff Details:");
        for (Teaching teaching : teachingStaff) {
            teaching.display();
        }

        System.out.println("Technical Staff Details:");
        for (Technical technical : technicalStaff) {
            technical.display();
        }

        System.out.println("Contract Staff Details:");
        for (Contract contract : contractStaff) {
            contract.display();
        }
    }
}
