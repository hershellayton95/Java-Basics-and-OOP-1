package javabasics._7;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
     *
     *    print out your string in upper case, and in lower case
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        //Write your code here
        String someText = "Some text";
        System.out.println(someText.toLowerCase());
        System.out.println(someText.toUpperCase());
    }

    /**
     * 2: Edit the code below so it prints out the first name and last name in uppercase, and the middle name in lower case
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Change these
        String firstName = "Filippo";
        String middleName = "Hershel";
        String lastName = "Di Marco";

        System.out.println(firstName.toUpperCase() + " " + middleName.toLowerCase() + " " + lastName.toUpperCase()); // <--- Edit this line
    }


     /**
     * 3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
     *
     * Use the '+' operator
     *
     * choose from these primitives: double, int, char, boolean
     * use primitive literals like: 1.5, 67, 'b', true
     *
     * +
     *
     * Experiment with these different types, how do an int and a double behave when added?
     *
     * What about a boolean and an int?
      *
      * "" + 1.5
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String textFrom2Primitives = "" + 1 + true + 5.0 + 'f'; // <--- Edit this line
        System.out.println(textFrom2Primitives);
    }


     /**
     * 4: Without editing the Strings below make the print statement print
     *
     *    1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
     *
     *    You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        System.out.println(earlyNumbers.trim() + " " +  middleNumbers.trim() + " " + earlyNumbers.trim() ); // <--- Write your code here
    }


}