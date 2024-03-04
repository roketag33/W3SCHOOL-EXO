public class ExceptionsExo {
    public static void exo1() {
        // Insert the missing parts to handle the error in the code below.
try {
    int[] myNumber = {1,2,3};
    System.out.println(myNumber[10]);
} catch (Exception e) {
    System.out.println("something went wrong");
}
    }
    
    public static void exo2() {
        // Insert the missing keyword to execute code, after try..catch, regardless of
        // the result.
try {
    int[] myNumber = {1,2,3};
    System.out.println(myNumber[10]);
} catch (Exception e) {
    System.out.println("something went wrong");
}
finally {
    System.out.println("the 'try catch is finished.");
}
    }


}
