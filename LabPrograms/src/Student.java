import java.util.Scanner;

public class Student {
        private String USN, Name, Branch, phone;

        Scanner in = new Scanner(System.in);

        Student() {
            System.out.println("Enter a name");
            this.Name = in.nextLine();
            System.out.println("Enter your USN");
            this.USN = in.nextLine();
            System.out.println("Enter your branch");
            this.Branch = in.nextLine();
            System.out.println("Enter your phone number");
            this.phone = in.nextLine();
        }

        public void printDetails() {
            System.out.println("Name is: " + Name);
            System.out.println("Branch is: " + Branch);
            System.out.println("USN is: " + USN);
            System.out.println("Phone number is: " + phone);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students you wish to enter");
        int n = in.nextInt();
        Student[] obj1 = new Student[n];
        for (int i = 0; i < n; i++) {
            obj1[i] = new Student();
            obj1[i].printDetails();
        }
    }
}
