// UC2 - Display Hello with user's name using command line argument

public class DisplayName {

    public static void main(String[] args) {

        // Check if name is provided
        if (args.length > 0) {

            String name = args[0];

            System.out.println("Hello " + name);

        } else {

            System.out.println("Please provide a name as command line argument.");

        }

    }
}