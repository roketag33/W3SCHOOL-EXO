public class MethodExo {
    public static void exo1() {

        static void myMethod() {
        System.out.println("I just got executed!");
        }
        public static void main(String[] args) {
        myMethod();
        ;
        }
    }

    public static void exo2() {
        // Insert the missing part to call myMethod from main two times.
        static void myMethod(){
            System.out.println("I just got executed!");
        }
        public void main(String[] args) {
            myMethod();
            myMethod();
        }
    }
    
    public static void exo3() {
        // Add a fname parameter of type String to myMethod, and output "John Doe".
        static void myMethod( String fname){
            System.out.println(fname +"Doe");
        }

        public static void main(String[] args) {
            myMethod("john");
        }
    }

    public static void exo4() {
        // Insert the missing part to print the number 8 in main, by using a specific
        // keyword inside myMethod:
static int myMethod(int x) {
    return 5 + x;
}
public static void main(String[] args) {
  System.out.println(myMethod(3));
}
}
    public static void exo5() {
        // Create a checkAge() method with an integer variable called age
        static void myCheckAge(int age){
        // If age is less than 18, print "Access denied"
        if (age <18){
            System.out.println("Access denied");
        }
        // If age is greater than, or equal to, 18, print "Access granted"
        else {
            System.out.println("acces granted");
        }
    }
    public static void main(String[] args) {
          // Call the checkAge method and pass along an age of 20
    myCheckAge(20);
    }
}
}
