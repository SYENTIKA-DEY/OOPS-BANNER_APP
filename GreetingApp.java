public class GreetingApp {
    public static void main(String[] args) {

        // If no arguments, print default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build greeting using enhanced for loop
        String message = "Hello, ";
        String allNames = "";

        for (String name : args) {
            allNames += name + ", "; // add delimiter
        }

        // Remove trailing comma and space
        allNames = allNames.substring(0, allNames.length() - 2);

        // Final greeting
        System.out.println(message + allNames + "!");
    }
}