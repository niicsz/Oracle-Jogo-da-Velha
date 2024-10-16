import java.util.Scanner;
public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.print("Enter the name of Player 1: ");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name, 'X');

        System.out.print("Enter the name of Player 2: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name, 'O');

        TicTacToe game = new TicTacToe(player1, player2);
        Player currentPlayer = player1;

        while (true) {
            game.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
            System.out.print("Enter row (0, 1, or 2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0, 1, or 2): ");
            int col = scanner.nextInt();

            if (game.makeMove(row, col, currentPlayer)) {
                if (game.checkWin(currentPlayer)) {
                    game.printBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                } else if (game.isDraw()) {
                    game.printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }

        scanner.close();
    }
}
