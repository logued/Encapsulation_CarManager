package dkit.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Encapsulation of cars in CarManager class" );
        App app = new App();
        app.start();
    }

    public void start() {

        Car c1 = new Car("Toyota","Corolla", "191LH346",14500.00);
        System.out.println(c1);

        Car c2 = c1;    // shared reference, c1 and c2 both point at the same object
        c2.setPrice(50000.00);  // will set the price for both c1 and c2 (as they both point to the same object)
        System.out.println("Note price will be same in both c1 and c2.");
        System.out.println(c1);
        System.out.println(c2);

        Car c3 = new Car( c1 ); // clones c1 using copy constructor

        System.out.println(c3);
        c3.setPrice(15000.00);  // sets new price in c3, but will not change the price in the linkedlist car object
        System.out.println("\nNote that c1 and c3 have different prices, because the refer to different objects.");
        System.out.println(c1);
        System.out.println(c3);


        CarManager carMgr = new CarManager();   // make a car manager object to Encapsulate the storage of Cars

        // add cars to the carManager.
        // The addCar method will clone each object so that this App object will not be able to
        // access the objects directly by reference.

        carMgr.addCar( c1 );    // add an existing object
        // add objects directly to carMgr.
        carMgr.addCar(  new Car("Audi","A4","191MH220",3000.00));
        carMgr.addCar( new Car("Merc","E220","161Wx220",30000.00));


        Car car =  carMgr.getCar("191MH220");
        car.setPrice(500000.00);
        System.out.println(car);

        car = carMgr.getCar("171D209865");
        if( car != null  ) {  // null check MUST be done id c4 is going to be used
            System.out.println(car.getMake()); //
            // we don't throw an exception if car is null, because null is a valid value
            // indicating that a car with that registration was not found.
        }
        else
            System.out.println("Registration NOT found.");


    }
}
