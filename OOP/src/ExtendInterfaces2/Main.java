package ExtendInterfaces2;
//ths is just to demonstrate the additional feature of an interface , the primary intent reamins as same
//ie to use the feature of multiple inheritance to interfaces
public class Main  implements A , B {
    //note.txt that we need to implement both the methods as B  is extending A

    @Override
    public void greet() {
//note.txt that the access modifier for the overridden method should be same as the abstract metthod
        //declared or can be free than that , eg if method declared private , it can be proteced
        //if protected it can be public here , but vice versa is not acceptable
    }

    public void fun(){
        System.out.println("i am in man class");//calsses imiplementation will be an
        //priority over an interface default method if both are present
    }

    //even though we have not overriden the fun method , its not giving an error because
    //there is a default method available over there. but if you try to put the default
    //even in the other B class then it will callapse and give error, so we dont actually do tthat
    // hence the main intention
    //implement the interface remains the same ie multiple inheritance


    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();//we are calling the static method via the interface name
    }
}
