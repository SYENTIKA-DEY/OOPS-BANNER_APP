public class GreetingAppJoin {
    public static void main(String[] args) {

        // Case 1: No arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Join names using String.join()
        String joinedNames = String.join(", ", args);

        System.out.println("Hello, " + joinedNames + "!");
    }
}