public class StringExo {
    public static void exo1() {
        // Fill in the missing part to create a greeting variable of type String and
        // assign it the value Hello.
        String greeting = "Hello";
    }
    
    public static void exo2() {
        // Use the correct method to print the length of the txt string.
        String txt = "Hello";
        System.out.println(txt.length());
    }
    
    public static void exo3() {
        //Convert the value of txt to upper case.
        String txt = "hello";
        System.out.println(txt.toUpperCase());
    }
    
    public static void exo4() {
        //Use the correct operator to concatenate two strings:
        String firstName = "john";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
    }
    
    public static void exo5() {
        //Use the correct method to concatenate two strings:
        String firstName = "john";
        String lastname = "Doe";
        System.out.println(firstName.concat(lastname));
    }
    
    public static void exo6() {

        //Return the index (position) of the first occurrence of "e" in the following string:
        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));

    }
}