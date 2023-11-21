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
        super.display();//if there is no overriden method, we could use Classname.display() to call the method from the parent class
        System.out.println("Contract Period: " + period + " months");
        System.out.println("------------------------");
    }
}
