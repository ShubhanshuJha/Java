/* The static keyword indicates that the particular member belongs to a type itself, rather than to an
instance of that type. It is mainly used to help memory management.
This keyword can be applied to variables, methods, blcks, and nested class. 

static keyword is basically related to class not with the objects  */
public class StaticKeywordImplementation{
    // Here static is being used to initialize blocks before main method
    static{
        System.out.println("1st block is being executed.");
    }
    static{
        System.out.println("2nd block is being executed.");
    }
    static{
        System.out.println("3rd block is being executed.");
    }
    public static void main(String []args){

        Person p1 = new Person();
        System.out.println("Name: "+p1.name+"\nAge: "+p1.age);
        System.out.println(p1.breed);

        // For Nested Class
        // First create an object of A class
        // A objA = new A();

        // Then have to create object of B class
        // A.B objB = objA.new B();

        // We can directly access C class as it is static by using A's name
        // For class C, don't need to create object for class A
        // C objC = new A.C();


        // System.out.println(Math.abs(p1.age)); //To get absolute value

    }
    static{
        System.out.println("4th block is being executed.");
    }
    static{
        System.out.println("5th block is being executed.");
    }
}
class A{
    // System.out.println("A class is activated.");
    class B{
        // System.out.println("B class is activated.");
    }
    static class C{
        // System.out.println("C class is activated.");
    }
}
class Person{
    String name = "Tom";
    int age = 17;
    static String breed = "Homo Sapiens";
}
/* We can't declare a top level class with static modifier, but we can declare a nested class
as static.
In java, we can define a class within another class. Such a class is called a Nested Class. Nested
class are of two types:
static and non-static. */
/*Format example
class OuterClass{
    ...
    static class StaticNestedClass{
    ...
    }
    class InnerClass{
    ...
    }
}   */