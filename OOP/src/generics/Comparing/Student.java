package generics.Comparing;

public class Student implements Comparable<Student>{
    int rollNO;
    float marks;

    public Student(int rollNO, float marks) {
        this.rollNO = rollNO;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNO+","+marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("i am running in compareTo method");
        int difference = (int)(this.marks-o.marks);
        return difference;
        //if diff == 0 then equal
        //if diff < 1: o is bigger
        //if diff > 1: o is smaller
        }

}
