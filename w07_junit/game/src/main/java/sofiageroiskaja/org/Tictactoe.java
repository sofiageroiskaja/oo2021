package sofiageroiskaja.org;

public class Tictactoe{
	private String[][] game_board;
	private static final int rows = 3;
	private static final int cln = 3;
	private String regex = "\\s{3}";
	
	public Tictactoe(){
		game_board = new String[rows][cln];
		this.init_gameboard();
	}
	
	public void init_gameboard(){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cln; j++){
				game_board[i][j] = "   ";
			}
		}
	}

	public void setPlay(int i, int j, String player) {
		if(game_board[i][j].matches(regex))
			game_board[i][j] = " " + player + " ";
	}

	public boolean game_over() {
    	for(int i = 0; i < rows; i++) {
    		if(!game_board[i][0].matches(regex) && game_board[i][0].equals(game_board[i][1]) && game_board[i][1].equals(game_board[i][2])) {    			
    			return true; 
    		}   			 			
    	}
    	
    	for(int j = 0; j < cln; j++) {    		
    		if(!game_board[0][j].matches(regex) && game_board[0][j].equals(game_board[1][j]) && game_board[1][j].equals(game_board[2][j])) 
    			return true;  			
    	}

    	if(!game_board[0][0].matches(regex) && game_board[0][0].equals(game_board[1][1]) && game_board[1][1].equals(game_board[2][2])){
    		return true;
        } if(!game_board[0][2].matches(regex) && game_board[0][2].equals(game_board[1][1]) && game_board[1][1].equals(game_board[2][0])){
    		return true;
        }
        return false;
	}
	
	public String show_gameboard() {
		String board = "";
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cln; j++){
				if(j == cln-1){
					board += game_board[i][j];
                } else{
					board += game_board[i][j] + "|";
                }
			}
			if(i != rows-1){
				board += "\n---|---|---\n";
            }
		}
		return board;
	}
}
