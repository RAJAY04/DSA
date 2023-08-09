package packages.staticExample;
//this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    //static block: will only run once , when the first obj is created i.e when the
    //class is loaded for the first time
    static{
        System.out.println("hello world");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+ " " + StaticBlock.b);
        b+=2;
        //we see that the hello word is just printed once and b= a*5 just happend once
        //only for the first time when the object is created
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+ " " + StaticBlock.b);
    }
}
