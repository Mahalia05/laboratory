import java.util.Scanner;

public class CylinderMain {
    // main method to run the program
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: "); // prompt the user to enter the radius
        double radius = input.nextDouble(); // read the radius value from the user
        System.out.print("Enter Height: "); // prompt the user to enter the height
        double height = input.nextDouble(); // read the height value from the user
        // create a new Cylinder object with the entered radius and height
        Cylinder cylinder = new Cylinder(radius, height);
        // call the printDetails method to display the cylinder's details
        cylinder.printDetails();
        // close the Scanner object to free up resources
        input.close();
    }
}

class Cylinder {
    // instance variables to store the cylinder's radius and height
    protected double radius;
    protected double height;
    // constant variable for pi (approximately 3.14)
    protected double pi = 3.14;

    // constructor to initialize the cylinder's radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // method to print the cylinder's details (area and volume)
    public void printDetails() {
        System.out.println("Area of Cylinder: " + (2 * pi * radius * radius + 2 * radius * height)); // calculate and print the area of the cylinder
        System.out.println("Volume of Cylinder: " + (pi * radius * radius * height)); // calculate and print the volume of the cylinder
    }
}