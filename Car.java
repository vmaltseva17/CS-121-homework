//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum Color {
    BLACK, BLUE, GREEN, RED, WHITE, YELLOW
};

// enums are used to represent a set of predefined values for a specific type
// enumeration refers to the process of iterating through a collection of itmes, usually represented by constants
// they are a type of data structure that helps to represent a fixed set of named values

enum Model {
    PORSCHE, LAMBO, JESKO
}

public class Car {
    private int year;
    private static Model model;
    private static Color color;
    public Car(int yr, Model m, Color c) {
        year = yr;
        model = m;
        color = c;

        // constructor setting the values for the car class

    }

    public void display() {
        System.out.println("Car is a" + year + "" + color + "" + model);
        // display method to print out the details of the car
    }

    public class cardemo { 
        public static void main(String[] args) {
            Car firstCar = new Car(2014, Car.model.LAMBO, Car.color.RED);
            firstCar.display();
            // creating an instance of the car clas

    }
    }

}