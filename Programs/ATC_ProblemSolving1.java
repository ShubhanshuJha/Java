import java.util.*;

public class ATC_ProblemSolving1{

    public static void main(String[] args) throws Exception{
        Scanner in=new Scanner(System.in);
        int numOfTrips = in.nextInt();
        // ArrayList<Trip> list = new ArrayList<>();
        for (int i=1; i<=numOfTrips; i++) {
            int type = in.nextInt();
            String origin = in.next();
            String destination = in.next();
            int distance = in.nextInt();
            int base_fair = in.nextInt();
            if (type == 1){
                Bus object = new Bus(origin, destination, distance, base_fair);
                // list.add(object);
            }
            else if (type == 2){
                Boat object = new Boat(origin, destination, distance, base_fair);
                // list.add(object);
            }
            else if (type == 3){
                Plane object = new Plane(origin, destination, distance, base_fair);
                // list.add(object);
            }
        }
        System.out.println("Total Cost of trips: " + (new Trip()).getCost());
    }
}
class Trip{
    public String origin, destination;
    public int distance, base_fair;
    protected static int total_cost = 0;

    Trip(String origin, String destination, int distance, int base_fair){
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.base_fair = base_fair;
        System.out.println("Trip Constructor");
    }
    Trip(){
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.base_fair = base_fair;
        System.out.println("Trip Constructor");
    }
    public int getCost(){
        return total_cost;
    }
}
class Bus extends Trip{
    Bus(String origin, String destination, int distance, int base_fair){
        System.out.println("Bus Constructor");
        System.out.println("Bus Trip: "+origin+" to "+destination+", "+distance+" km, P"+base_fair+" base fare");
        super.total_cost += (distance * base_fair);
    }
}
class Boat extends Trip{
    Boat(String origin, String destination, int distance, int base_fair){
        System.out.println("Boat Constructor");
        System.out.println("Boat Trip: "+origin+" to "+destination+", "+distance+" km, P"+base_fair+" base fare");
        super.total_cost += (base_fair);
    }
}
class Plane extends Trip{
    Plane(String origin, String destination, int distance, int base_fair){
        System.out.println("Plane Constructor");
        System.out.println("Plane Trip: "+origin+" to "+destination+", "+distance+" km, P"+base_fair+" base fare");
        super.total_cost += (base_fair + (0.10 * base_fair));
    }
}
/*A travel agency organizes a client's travel itinerary. Each itinerary is composed of multiple trips.
A trip has a fixed distance (in kilometers), starts at an origin and ends at the destination.
There are several types of trips: by plane, boat, or bus.

The cost of a trip depends on what type it is:
Boat trips cost a fixed base fare. Plane trips cost a base fare plus 10% fuel surcharge.
Bus trips cost a base fare times every kilometer travelled.
Create a class hierarchy that will represent trips, including member variables to store trip details.
Create member functions that will:
compute the cost of the trip, and
display the details of the trip: origin, destination, distance and cost
Study the sample output carefully so you can correctly implement the trip hierarchy. 

Input Format:
The first input is a positive integer n representing the number of trips. What follows are the n trips themselves.
Each trip is composed of the type of trip (1 for bus, 2 boat, and 3 for plane), origin, destination, distance travelled in kilometers, and base fare.

Input Sample:
5
1 Zamboanga Cagayan 494 5
1 Tagbilaran Panglao 20 10
2 Cebu Tagbilaran 90 800
3 Manila Davao 1500 4500
3 Clark Iloilo 751 2300

Output Format:
Display the details of each trip, including trip type, origin, destination, distance travelled, and base fare.
Finally, out the total cost for all trips in the test case.

Output Sample:
Trip Constructor
Bus Constructor
Bus Trip: Zamboanga to Cagayan, 494 km, P5 base fare
Trip Constructor
Bus Constructor
Bus Trip: Tagbilaran to Panglao, 20 km, P10 base fare
Trip Constructor
Boat Constructor
Boat Trip: Cebu to Tagbilaran, 90 km, P800 base fare
Trip Constructor
Plane Constructor
Plane Trip: Manila to Davao,1500 km, P4500 base fare
Trip Constructor
Plane Constructor
Plane Trip: Clark to Iloilo, 751 km, P2300 base fare
Total Cost of trips: 10950 */