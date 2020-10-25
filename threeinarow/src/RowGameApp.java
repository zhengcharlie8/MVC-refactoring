import controller.ThreeInARowGame;
import controller.TicTacToe;


public class RowGameApp 
{
    /**                                                                             
     * Starts a new game in the GUI.
     */
    public static void main(String[] args) {
    if (args.length < 1)
    	return;
    else if (args[0].equals("1")) {
	TicTacToe game = new TicTacToe();
	game.startUp();
    }
    else if (args[0].equals("2")) {
    ThreeInARowGame game = new ThreeInARowGame();
    game.startUp();	
    }
    }
}
