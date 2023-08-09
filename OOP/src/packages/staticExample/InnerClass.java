package packages.staticExample;
//note that classes outside the mainclass cannot be staticff
public class InnerClass {
    static class test{
        String name;

        public test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;//now since we have a toString method it will run this instead and give the name
        }

        public static void main(String[] args) {
            test a = new test("ajay");//it gives error because the class test itself is dependent
            test b = new test("vijay");//on an outer class
            //hence if you create that test class outside the InnerClass class , or make the
            //test class as static , the error will be gone

            //checking what it prints if we just try to print a

            //out is of type printstream and printstream has a println method which it is calling
            System.out.println(a);//it gives me random value because it searches for the toString method
            //if test class dosent contain it, it will call its internal toString method
        }
    }
}
