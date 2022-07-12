package ua.ithillel.java;

/**
 * Filling content in the constructor and displaying an assortment of pizzas.
 */

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("\nWelcome to the pizzeria, our pizzas that we offer:\n");

        Pizza pepperoni = new Pizza("Pepperoni", "sausage pepperoni, mozzarella, " +
                "freshly ground pepper", 20, 150);

        Pizza margherita = new Pizza("Margherita", "tomato sauce, mozzarella and oregano",
                25, 180);

        Pizza marinara = new Pizza("Marinara", "tomato sauce, garlic and basil",
                27.5, 184.50);

        Pizza carbonara = new Pizza("Carbonara", "tomato sauce, mozzarella, parmesan, eggs, bacon",
                22.5, 140);

        System.out.println(pepperoni);
        System.out.println(margherita);
        System.out.println(marinara);
        System.out.println(carbonara);

    }
}
