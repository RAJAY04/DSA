package StaffProgram;

public class Contract extends Staff{
    private int period; // in months

    // Constructor
    public Contract(String staffId, String name, String phone, double salary, int period) {
        super(staffId, name, phone, salary);
        this.period = period;
    }

    // Display method
    @Override
    public void display() {
        super.display();
        System.out.println("Contract Period: " + period + " months");
        System.out.println("------------------------");
    }
}
