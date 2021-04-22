package sofiageroiskaja.org;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        //Minu TicTacToe mäng
		Scanner move = new Scanner(System.in);
		Tictactoe game = new Tictactoe();
		String player = "x";
		
		do {
			System.out.println(game.show_gameboard());
			System.out.println("Enter row for " + player + ": (NB! first row is 0)");
			int row = move.nextInt();
			System.out.println("enter column for " + player + ": (NB! first column is 0)");
			int column = move.nextInt();
			game.setPlay(row, column, player);
			if(game.game_over()){
				System.out.println(player + " won!");
				break;
			}
			if(player == "x"){
				player = "o";				
			} else{
				player = "x";
			}
		} while(true);
		System.out.println("Thank you for playing! It was a good game");
        move.close();
	}

}