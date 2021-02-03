import components.*;

public class Vehicle {

//    type declaration
    private String make;
    private String model;
    private String colour;
    private double price;
    private Engine engine;
    private Tyre tyre;
    private Window window;


    //    constructor for a vehicle

    public Vehicle(String make, String model, String colour, double price, Engine engine, Tyre tyre, Window window) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyre = tyre;
        this.window = window;
    }

//    getters for a vehicle

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public Window getWindow() {
        return window;
    }

}
