package Enums;

public class basic {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are called enums constants
        //every sigle one here is public static and final by default
        //since its final u can create a child
        //type of there enums is week

        //as the enums cant be inherited abstract ar not allowed and body is required

        Week(){
            System.out.println("constructor called for"+this.toString());
        }
        //this is not public or protected, only private or default
        //why? we dont want to create new objects
        //because this is not the enum concepts thats why

        //internally its like: public static final Week Monday = new Week();

        void hello(){
            System.out.println("hey how are you");
        }
    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for(Week day : Week.values()){
//            System.out.println(day);
       // }
        System.out.println(week.ordinal());
        //ordinal says position of emum declaration

        week.hello();
    }
}
