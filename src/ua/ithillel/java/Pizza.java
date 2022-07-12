package ua.ithillel.java;

/**
 * The name of the pizza name fields, its composition, price. A constructor that takes as parameters the name,
 * composition, price, and diameter of the pizza. Inside the constructor is an object of class Circle that
 * takes a diameter and is also output.
 */

public class Pizza {

    private String name; //название пиццы.
    private String composition; // состав пиццы.
    private double cost; // цена.

    public Pizza(String name, String composition, double diameter, double cost) {
        Circle circlePizza = new Circle();
        circlePizza.setDiameter(diameter);
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        System.out.println("\nPizza name: " + name);
        System.out.println("Composition: " + composition);
        System.out.println("Diameter: " + diameter);
        System.out.println("Cost: " + cost + "\n");
    }
}
