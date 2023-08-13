package AccessControls;

public class ObjectDemo {

    int num;
    float gpa;
    public ObjectDemo(int num) {
        this.num = num;
    }
    public ObjectDemo(int num ,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override// we will go into details of how to create it in hashmap lecture
    public int hashCode() {//it basically gives number representation of the object
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;//we have casted it as it was not ObjectDemo type
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

   /*
 @Override // these things we have already covered
    public String toString() { gives the string representation
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable { // gets called when garbage collection occurs
        super.finalize();
    }
*/

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj.hashCode());//363771819 is the output when hash code gives return super.hashCode();

        ObjectDemo obj2 = new ObjectDemo(34);
        System.out.println(obj2.hashCode());  // 2065951873 is the output when hash code gives return super.hashCode();
        //hash code is not adress in java we can access address, its just a random integer value
        //to check wheather two objects are same or not
        ObjectDemo obj3 = obj2;
        System.out.println(obj3.hashCode());//we can see same hashcode value when the object is same


        ObjectDemo obj4 = new ObjectDemo(12,55.8f);
        ObjectDemo obj5 = new ObjectDemo(12,78.9f);

        if(obj4 == obj5){//obj4 < obj5 , java gets confused which varibale to compare and gives error now
            //will look into this in later part now lets see about ==, it basically checks if two objects
            //are pointing to the same objects or not
            System.out.println("obj1 is equal to obj2");
        }
        if(obj4 .equals(obj5)){//this checks int internal contents
            System.out.println("obj1 is equal to obj2");//it prints nothing until we modify the .equals
            //function above , after modification now it checks the num value
        }
    }
}
