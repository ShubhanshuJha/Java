/*  Like Method Overloading, we can also overload the Constructors if two
or more Constructors are different in parameter*/

class Vehicles{
    int wheels;
    Vehicles(){
        wheels = 4; //Object has been initialized here
    }
    Vehicles(int wheels){
        this.wheels = wheels; //Object has been initialized here
    }
}
public class ConstructorsOverloading{
    ConstructorsOverloading(){
        System.out.println("Object is created");
    }
     public static void main(String []args){
        // A new object of ConstructorsOverloading class has been made
        ConstructorsOverloading obj = new ConstructorsOverloading();

        Vehicles car = new Vehicles();
        System.out.println("The vehicle has "+car.wheels+" wheels.");

        Vehicles truck = new Vehicles(8);
        System.out.println("The vehicle has "+truck.wheels+" wheels.");
    }
}
/* If we'd already made a Constructor in Jave, then, we can't call the defualt Constructor*/