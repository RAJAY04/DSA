package ResumeGenerating;

public class Main {
    public static void main(String[] args) {
        // Create instances of Teacher and Student
        Teacher teacher = new Teacher("John Doe, Address: ABC Street", "Masters in Education", "5 years", "Published research papers");
        Student student = new Student("Jane Doe, Address: XYZ Street", "A", "Computer Science");

        // Call the biodata method for both Teacher and Student
        teacher.biodata();
        student.biodata();
    }
}
