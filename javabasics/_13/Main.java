package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here

        numbers.add(Integer.valueOf(String.valueOf(Math.round(Math.random()*10))));
        numbers.add(Integer.valueOf(String.valueOf(Math.round(Math.random()*10))));
        numbers.add(Integer.valueOf(String.valueOf(Math.round(Math.random()*10))));
        numbers.add(Integer.valueOf(String.valueOf(Math.round(Math.random()*10))));
        numbers.add(Integer.valueOf(String.valueOf(Math.round(Math.random()*10))));
        numbers.add(Integer.valueOf(String.valueOf(Math.round(Math.random()*10))));
        numbers.add(Integer.valueOf(String.valueOf(Math.round(Math.random()*10))));

        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");
        //Write your code here

        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();
        menuItems.add("Pizza");
        menuPrices.add(6.0);
        int index = 0;
        System.out.println(menuItems.get(index) + " = " + menuPrices.get(index));
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};
        int total = 0;
        for (int item : items) {
            total += item;
        }
        System.out.println(total);
        //Write your code here
    }
}
