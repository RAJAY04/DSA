public class Student {
    private String name;
    private String branch;
    private String USN;
    private int phone;

    public Student(String name, String branch, String usn, int phone) {
        this.name = name;
        this.branch = branch;
        this.USN = usn;
        this.phone = phone;
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("branch: "+ branch);
        System.out.println("usn: "+ USN);
        System.out.println("phone: "+phone);
    }
}
