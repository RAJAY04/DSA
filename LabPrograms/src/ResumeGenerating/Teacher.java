package ResumeGenerating;

public class Teacher implements Resume{
    private String personalInformation;
    private String qualification;
    private String experience;
    private String achievements;

    // Constructor
    public Teacher(String personalInformation, String qualification, String experience, String achievements) {
        this.personalInformation = personalInformation;
        this.qualification = qualification;
        this.experience = experience;
        this.achievements = achievements;
    }

    // Implement the biodata method from the Resume interface
    @Override
    public void biodata() {
        System.out.println("Teacher Biodata:");
        System.out.println("Personal Information: " + personalInformation);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience);
        System.out.println("Achievements: " + achievements);
        System.out.println("------------------------");
    }
}
