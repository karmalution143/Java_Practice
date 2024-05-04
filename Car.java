
import java.util.Random;
import java.util.Scanner;

public class Car {
    public static Random randNum = new Random(); // class variables - shared across all instances
    public static Scanner input = new Scanner(System.in); // class variables - shared across all instances
    public static boolean raceOn = true; // class variables - shared across all instances
    
    // instance variables - independant for each object
    private int carNumber;
    private int fuelAmount;

    // constructor
    public Car() {
        // do nothing
    }

    //=============>
    // GETTERS
    public int getCarNumber() {
        return this.carNumber;
    }

    public int getFuelAmount() {
        return this.fuelAmount;
    }

    // SETTERS
    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}