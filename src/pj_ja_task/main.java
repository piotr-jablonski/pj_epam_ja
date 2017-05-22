package pj_ja_task;
import java.util.Scanner;

public class Main {

	public char[][] board;
	public char currentPlayer = 'x';
	public boolean finish = false;

	public Main() {
		board = new char[3][3];
		currentPlayer = 'x';
		finish = false;
	}
	
	public void checkBoard() {
		if (board[0][0]=='x' || board[0][1]=='x' || board[0][2]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		if (board[1][0]=='x' || board[1][1]=='x' || board[1][2]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		if (board[2][0]=='x' || board[2][1]=='x' || board[2][2]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		if (board[0][0]=='x' || board[1][0]=='x' || board[2][0]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		if (board[0][1]=='x' || board[1][1]=='x' || board[2][1]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		if (board[0][2]=='x' || board[1][2]=='x' || board[2][2]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		if (board[0][0]=='x' || board[1][1]=='x' || board[2][2]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		if (board[0][2]=='x' || board[1][1]=='x' || board[2][0]=='x') {
			System.out.println("x has won");
			finish = true;
		}
		
		
		
		
		if (board[0][0]=='o' || board[0][1]=='o' || board[0][2]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		if (board[1][0]=='o' || board[1][1]=='o' || board[1][2]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		if (board[2][0]=='o' || board[2][1]=='o' || board[2][2]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		if (board[0][0]=='o' || board[1][0]=='o' || board[2][0]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		if (board[0][1]=='o' || board[1][1]=='o' || board[2][1]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		if (board[0][2]=='o' || board[1][2]=='o' || board[2][2]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		if (board[0][0]=='o' || board[1][1]=='o' || board[2][2]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		if (board[0][2]=='o' || board[1][1]=='o' || board[2][0]=='o') {
			System.out.println("o has won");
			finish = true;
		}
		
		
		
	}

	
	public boolean ifFinish() {
		checkBoard();
		if (finish) {
			System.out.println("THE END");
			return true;
		}
		return false;
	}

	public void changePlayer() {
		if (currentPlayer == 'x') {
			currentPlayer = 'o';
		} else {
			currentPlayer = 'x';
		}
	}
	
	public void start() {
		Main main = new Main();
		System.out.println("Please write in an coordinates");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		board[a][b] = currentPlayer;
		main.checkBoard();
		main.ifFinish();
		main.changePlayer();
		scanner.close();
	}	
}


