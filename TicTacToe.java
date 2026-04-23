import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // Players
        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;
        char currentSymbol;

        // Step 1: Random toss
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        // Step 2: Assign symbols and starting player
        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
            currentSymbol = player1Symbol;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
            currentSymbol = player2Symbol;
        }

        // Step 3: Display result
        System.out.println("Toss Result:");
        System.out.println(player1 + " is " + player1Symbol);
        System.out.println(player2 + " is " + player2Symbol);
        System.out.println(currentPlayer + " starts first with symbol " + currentSymbol);
    }
}