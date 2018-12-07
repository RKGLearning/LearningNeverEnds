package rakesh.practice.programs.All_Mine;

public class TicTacToe {
//	public static void main(String[] args)
int _row = 3;
char _board[] [] = new char [_row] [_row];
public void makeBoard() {
	for(int i = 0; i < _row; i++ ) {
		for (int j = 0; j < _row; j++) {
			_board [i] [j] = 'O';
		}
	}
}

boolean isValid(int r, int c) {
	return((r >=0&&r < _row) && (c>=0 && c < _row));
}

boolean isFill (int r, int c) {
	return(_board[r][c] != 'o');
}


}
