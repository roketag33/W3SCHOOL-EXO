public class ifelse {
    public static void exo1() {
        // Print "Hello World" if x is greater than y.
        int x = 50;
        int y = 10;
        if (x > y) {
            System.out.println("Hello World");
        }
    }

    public static void exo2() {

        // Print "Hello World" if x is equal to y.
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Hello World");
        }
    }

    public static void exo3() {
        // Print "Yes" if x is equal to y, otherwise print "No".
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    public static void exo4() {
        // Print "1" if x is equal to y, print "2" if x is greater than y, otherwise
        // print "3".
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("1");
        } else if (x > y) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
    public static void exo5() {
        // Insert the missing parts to complete the following "short hand if...else
        // statement" (ternary operator):
        int time = 20;
        System result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }
}
