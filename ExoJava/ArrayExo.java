public class ArrayExo {
    public static void exo1() {
        // Create an array of type String called cars.
        String[] cars = { "Volvo", "BMW", "Ford" };
        System.out.println(cars);
    }
    
    public static void exo2() {
        // Print the second item in the cars array.
        String[] cars = { "Volvo", "BMW", "Ford" };
        System.out.println(cars[1]);
    }
    
    public static void exo3() {
        // Change the value from "Volvo" to "Opel", in the cars array.
        String[] cars = { "Volvo", "BMW", "Ford" };
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }
    
    public static void exo4() {
        // Find out how many elements the cars array have.
        String[] cars = { "Volvo", "BMW", "Ford" };
System.out.println(cars.length);
    }
    
    public static void exo5() {
        // Loop through the items in the cars array.
        String[] cars = { "Volvo", "BMW", "Ford" };
for (String i : cars){
    System.out.println(i);
}
    }
    
    public static void exo6() {
        // Insert the missing parts to create a two-dimensional array.
        int[][] myNumber = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println(myNumber);
    }
}
