package dkit.oop;

public class Car {
    private String make;
    private String model;
    private String registrationNumber;  // key
    private double price;

    // Copy constructor  (a constructor that 'clones' the Car object i.e. makes a copy)
    public Car( Car otherCar ) {
        this.make = otherCar.make;
        this.model = otherCar.model;
        this.registrationNumber = otherCar.registrationNumber;
        this.price = otherCar.price;
    }

    public Car(String make, String model, String registrationNumber, double price) {
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", price=" + price +
                '}';
    }


}
