package dkit.oop;

import java.util.ArrayList;

/*
    Demonstrates cloning objects to prevent 'leaking' of references to client objects.
    The CarManager encapsulates the storage of a list of cars by:
    1. data hiding
        - making the field data private
        - preventing access by references by cloning
    2. public interface
        - providing a list of methods that can be called  on a CarManager object
        ( this is known as the behaviour of the object)

 */
public class CarManager {

    private ArrayList<Car> carList;

    public CarManager() {
        carList = new ArrayList<>();    // instantiate the array list object
    }

    // Public Interface to this class is the list of methods that
    // can be called on an object of this class.  Here, it consists
    // of the two methods defined below.

    public void addCar( Car car ) {     // car could be null. so we need a null check
        if(car==null)
            throw new IllegalArgumentException();

        carList.add( new Car(car) ); // clone car and add the clone to list
    }

    public Car getCar( String registration ) {

        for(Car car : carList){
            if( car.getRegistrationNumber().equals(registration)) {
                return new Car(car); // returns a reference to a clone of the Car object found
            }
        }
        return null;    // return the value 'null' indicating not found
    }


    // public getAllCars()
}
