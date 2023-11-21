package ResumeGenerating;

public class Student implements Resume{
    private String personalInformation;
    private String result;
    private String discipline;

    // Constructor
    public Student(String personalInformation, String result, String discipline) {
        this.personalInformation = personalInformation;
        this.result = result;
        this.discipline = discipline;
    }

    // Implement the biodata method from the Resume interface
    @Override
    public void biodata() {
        System.out.println("Student Biodata:");
        System.out.println("Personal Information: " + personalInformation);
        System.out.println("Result: " + result);
        System.out.println("Discipline: " + discipline);
        System.out.println("------------------------");
    }
}
