package AccessControls;

public class A {
    protected int num;//now this is private we need to have getters and setters inside this class
    //inorder to make the num availabe outside this file
    String name;
    int[] arr;
    //if you dont sepcify public or private then it is default access, which can be only accessible inside the package

    public int getNum() {
        return num;
    }
//note that the above and below functions are public so we can access them outside the class
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [34];
    }
}
