public class ClasseObject {
    public static void exo1() {
        // Create a class called MyClass.
        public class MyClass
    }
    
    public static void exo2() {
        // Create an object of MyClass called myObj.
        Myclass myObj = new Myclass();
    }
    
    public static void exo3() {
        // Use myObj to access and print the value of the x attribute of MyClass.
        public class MyClass {
            int x = 5;
        }
        public static void main (String[] args) {
            MyClass myObj = new MyClass()
            System.out.println(myObj.x);
        }
    }
    
    public static void exo4() {
        // Call myMethod on the object.
        public class MyClass {
            public void myMethod() {
                System.out.println("Hello World");
            }
        }
        public static void main (String[] args) {
            Myclass myObj = new MyClass;
            myObj.myMethod();
        }
    }
    
    public static void exo5() {
        // Create a MyClass class
        public class MyClass {
            // Create a class attribute x
            int x;
            // Create a class constructor for the MyClass class
            public MyClass() {
                // Set the initial value for the class attribute x to 5
                x = 5;
            }
            public static void main(String[] args) {
                // Create an myObj object of class MyClass (This will call the constructor)
                Myclass myObj = new MyClass();
                // Print the value of x
                System.out.println(myObj.x);
            }
        }
    }
    
    public static void exo6() {
        // The class below should not be inherited by other classes. Add the correct
        // modifier:
    final class MyClass
    }
    
    public static void exo7() {
        // Fill in the missing parts to import the java.util.Scanner class from the Java
        // API:
    import java.util.Scanner;
    }
    
    public static void exo8() {
        // The Car class should inherit the attributes and methods from the Vehicle
        // class. Add the correct keyword to make this possible.
    class Car extends Vehicle
    }

}
