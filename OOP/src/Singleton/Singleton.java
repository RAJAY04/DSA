package Singleton;

public class Singleton {
    private Singleton() {
        //you cant run private things in other class and hence we cant create
        //new objects in other class as we have denied the access to the constructor itself
    }
        private static Singleton instance;
    //here we see how we can allow to just create a single obj

        public static Singleton getInstance(){
            //check wheather only one object is created or not

            if(instance == null){
                instance = new Singleton();//we can acces constructor inside the class even if its private
            }
            return instance;//if the object is already created it returns the same object , ref variable
            //pointing changes
        }
    }
