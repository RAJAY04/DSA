package AccessControls;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj  = new SubClass(43,"Ajay");
        int n = obj.num;

        System.out.println(obj instanceof A);

        System.out.println(obj.getClass());//you cant override the getclass as its final
        //this is used to get the data about the classes , check different methods by using
        //getclass().
        //instanceof
    }
}
