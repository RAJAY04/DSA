package StaffProgram;

public class Teaching extends Staff{
    private String domain;
    private String publications;

    // Constructor
    public Teaching(String staffId, String name, String phone, double salary, String domain, String publications) {
        super(staffId, name, phone, salary);
        this.domain = domain;
        this.publications = publications;
    }

    // Display method
    @Override
    public void display() {
        super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Publications: " + publications);
        System.out.println("------------------------");
    }
}
