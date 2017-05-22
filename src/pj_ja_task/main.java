package pj_ja_task;

import java.util.Scanner;

public class Main {

	public char[][] board;
	public char currentPlayer;
	public boolean finish = false;

	public Main() {
		board = new char[3][3];
		currentPlayer = 'x';
		finish = false;
	}
	
	public void checkBoard() {
		if (board[0].equals('x') || board[1].equals('x') || board[2].equals('x')) {
			System.out.println("x has won");
		finish = true;}
		if (board[3].equals('x') || board[4].equals('x') || board[5].equals('x')) {
			System.out.println("x has won");
		finish = true;}
		if (board[6].equals('x') || board[7].equals('x') || board[8].equals('x')) {
			System.out.println("x has won");
		finish = true;}
		if (board[0].equals('x') || board[3].equals('x') || board[6].equals('x')) {
			System.out.println("x has won");
		finish = true;}
		if (board[1].equals('x') || board[4].equals('x') || board[7].equals('x')) {
			System.out.println("x has won");
		finish = true;}
		if (board[2].equals('x') || board[5].equals('x') || board[8].equals('x')) {
			System.out.println("x has won");
		finish = true;}
		if (board[0].equals('x') || board[4].equals('x') || board[8].equals('x')) {
			System.out.println("x has won");
		finish = true;}
		if (board[2].equals('x') || board[4].equals('x') || board[6].equals('x')) {
			System.out.println("x has won");
		finish = true;}
			
		
		if (board[0].equals('o') || board[1].equals('o') || board[2].equals('o')) {
			System.out.println("o has won");
			finish = true;}
		if (board[3].equals('o') || board[4].equals('o') || board[5].equals('o')) {
			System.out.println("o has won");
			finish = true;}
		if (board[6].equals('o') || board[7].equals('o') || board[8].equals('o')) {
			System.out.println("o has won");
			finish = true;}
		if (board[0].equals('o') || board[3].equals('o') || board[6].equals('o')) {
			System.out.println("o has won");
			finish = true;}
		if (board[1].equals('o') || board[4].equals('o') || board[7].equals('o')) {
			System.out.println("o has won");
			finish = true;}
		if (board[2].equals('o') || board[5].equals('o') || board[8].equals('o')) {
			System.out.println("o has won");
			finish = true;}
		if (board[0].equals('o') || board[4].equals('o') || board[8].equals('o')) {
			System.out.println("o has won");
			finish = true;}
		if (board[2].equals('o') || board[4].equals('o') || board[6].equals('o')) {
			System.out.println("o has won");
			finish = true;}
	}
	
	public boolean ifFinish() {
		checkBoard();
		if (finish) {
			return true;
		}
		return false;
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write in an index of field. (First is 0)");
		
		while(finish=false) {
			int a = scanner.nextInt();
			board[a] = currentPlayer;
			change
		
	}
		
		public void changePlayer() {
			if (CurrentPlayer=='x') {
				currentPlayer='o'
			}
		}
	}
	
}







