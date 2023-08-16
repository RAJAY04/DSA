package generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Student ajay = new Student(41,9.83f);
        Student vjay = new Student(40,8.73f);
        Student sjay = new Student(42,7.73f);
        Student bjay = new Student(43,6.73f);
        Student gjay = new Student(44,5.73f);

        Student[] students = {ajay,vjay,sjay,bjay,gjay};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);//we can see that it sorted on marks becase compareTo method was present
        //if it was not there it will give error as its confused what to compare
        //hence the use case of compareTO
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {//this can also be done to resolve the problem
                System.out.println("i am in sort wala compare method");
                return (int)(o1.marks-o2.marks);

                //in oreder to check if o1 is less than o2 , if the value comes -ve then it is , else no
                //we can add - to return value to make it descending order sorted
            }
        });
        System.out.println(ajay.compareTo(vjay));
        if(ajay.compareTo(vjay) > 0){

            System.out.println("vijay has more marks");
            //now java gets confused , what to compare as it has two parameters
        }
    }


}
