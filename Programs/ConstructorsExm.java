/*  A Constructor is similar to a method (but not actually a method)
that is invoked automatically when an object is instantiated...

Format for a Constructor
class Test{
    Test(){
        //Constructor body
    }
}*/

/* If a Java Constructor does not accepts any parameters, then it is
said to be No-arguement Constructor*/
class Vehicles{
    int wheels;
    Vehicles(){
        wheels = 4; //Object has been initialized here
    }
}
public class ConstructorsExm{
    ConstructorsExm(){
        System.out.println("Object is created");
    }
     public static void main(String []args){
        // A new object of ConstructorsExm class has been made
        ConstructorsExm obj = new ConstructorsExm();

        Vehicles car = new Vehicles();
        System.out.println("The car has "+car.wheels+" wheels.");

        ParameterizedVehicle diffVehicle = new ParameterizedVehicle(12);
        System.out.println("The car has "+diffVehicle.wheels+" wheels & "+diffVehicle.headLights+" head lights.");
    }
}
/*If a Java Constructor accepts some parameters, then it is
said to be Parameterized Constructor
Format for this Constructor
class Test{
    int a;
    Test(int n){
        a = n; //Constructor body
    }
}*/
class ParameterizedVehicle{
    int wheels, headLights;
    ParameterizedVehicle(int n){
        wheels = n;//Object has been initialized here
        headLights = 2;
    }
}

/* "this" keyword points the current object
If the object & the parameter has same name, then "this" can be used
For example
class ParameterizedVehicle{
    int wheels;
    ParameterizedVehicle(int wheels){
        this.wheels = wheels;//Object has been initialized here
    }
}*/