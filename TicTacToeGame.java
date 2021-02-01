public class TicTacToeGame {
    // create 3x3 array that represet the board
    char[][] board = new char[4][4];

    public static void display(char board[][]){
        // its represent row
        for(int i = 1; i < 4; i++){
            System.out.println("-----------------");
            // its represent the column
            for(int j = 1; j < 4; j++){
                System.out.print(" - ");
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToeGame tk = new TicTacToeGame();
		  System.out.println("Welcome to my Tic Tac Toe Game");
		  System.out.println("------------------------------");
		  System.out.println();
        int count = 0;
        for(int i = 1; i < 4; i++){
            for(int j = 1; j< 4; j++){
                tk.board[i][j] = Character.forDigit(count++, 10);
            }
        }
        display(tk.board);
    }
}

