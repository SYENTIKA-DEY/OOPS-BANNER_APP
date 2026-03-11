// UC3 - Display Hello with command line argument or default value

public class DisplayNameDefault {

    public static void main(String[] args) {

        String name;

        // Check if user entered a name
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        // Display greeting
        System.out.println("Hello " + name);

    }
}