package StaffProgram;

public class Technical extends Staff {
    private String skills;

    // Constructor
    public Technical(String staffId, String name, String phone, double salary, String skills) {
        super(staffId, name, phone, salary);
        this.skills = skills;
    }

    // Display method
    @Override
    public void display() {
        super.display();
        System.out.println("Skills: " + skills);
        System.out.println("------------------------");
    }
}
