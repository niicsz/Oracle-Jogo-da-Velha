import java.util.ArrayList;
class TicTacToe {
    private char[][] board;
    private ArrayList<Player> players;
    private int movesCount;

    public TicTacToe(Player player1, Player player2) {
        board = new char[3][3];
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        movesCount = 0;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col, Player player) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        board[row][col] = player.getSymbol();
        movesCount++;
        return true;
    }

    public boolean checkWin(Player player) {
        char symbol = player.getSymbol();
        
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public boolean isDraw() {
        return movesCount == 9;
    }
}
