import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // -------- UC2: Create & Display Board --------
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println("Initial Game Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // -------- UC3: Toss Logic --------
        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;
        char currentSymbol;

        Random rand = new Random();
        int toss = rand.nextInt(2);

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

        System.out.println("\nToss Result:");
        System.out.println(player1 + " is " + player1Symbol);
        System.out.println(player2 + " is " + player2Symbol);
        System.out.println(currentPlayer + " starts first with symbol " + currentSymbol);
    }
}