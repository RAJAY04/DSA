package StaffProgram;

public class Staff {
    private String staffId;
    private String name;
    private String phone;
    private double salary;

    // Constructor
    public Staff(String staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: $" + salary);
    }
}
