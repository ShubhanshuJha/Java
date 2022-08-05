/* The finalize() method of Object class is a method that the Garbage Collector always calls just before the deletion/destroying the object
which is eligible for Garbage Collection, so as to perform clean-up activity. Clean-up activity means closing the resources associated
with that object like Database Connection, Network Connection or we can say resource de-allocation. Remember it is not a reserved keyword.
Once the finalize method completes immediately Garbage Collector destroy that object.
protected void finalize throws Throwable{} 
Since Object class contains the finalize method hence finalize method is available for every java class since Object is the superclass
of all java classes. Since it is available for every java class hence Garbage Collector can call the finalize method on any java object

# Why finalize method is used()?
finalize() method releases system resources before the garbage collector runs for a specific object. JVM allows finalize() to be invoked
only once per object.
# How to override finalize() method?
Now, the finalize method which is present in the Object class, has an empty implementation, in our class clean-up activities are there,
then we have to override this method to define our own clean-up activities.
In order to Override this method, we have to explicitly define and call finalize within our code. 

* There is no guarantee about the time when finalize is called. It may be called any time after the object is not being referred anywhere
  (cab be garbage collected).
* JVM does not ignore all exceptions while executing finalize method, but it ignores only Unchecked exceptions. If the corresponding catch
  block is there then JVM won’t ignore and corresponding catch block will be executed.    
* System.gc() is just a request to JVM to execute the Garbage Collector. It’s up-to JVM to call Garbage Collector or not.Usually JVM calls
  Garbage Collector when there is not enough space available in the Heap area or when the memory is low.  */

// This is the Java code to show the overriding of finalize() method
import mypackages.io.Writer;

class Finalize_Example {

	private static final Writer writer = new Writer(System.out);

	public static void main(String[] args) throws Throwable {
		Finalize_Example demo = new Finalize_Example();
		demo = null;
	// Requesting JVM to call Garbage Collector method
        System.gc(); // GarbageCollector method is calling the finalize() and cleans the null value object.
	// Calling finalize of demo
        // demo.finalize(); // Explicitly calling the finalize()
	}

	protected void finalize() throws Throwable {
        try {
            writer.println("Inside Finalize_Example's finalize() method.");
        } catch (Throwable e) {
            throw e;
        }finally {
            writer.println("Calling finalize method of the Object class.");
            // Calling finalize() of Object class
            super.finalize();
        }
    }
}