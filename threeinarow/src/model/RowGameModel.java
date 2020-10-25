package model;


public class RowGameModel 
{
    public static final String GAME_END_NOWINNER = "Game ends in a draw";

    private RowBlockModel[][] blocksData = new RowBlockModel[3][3];

    /**
     * The current player taking their turn
     */
    private int player = 1;
    private int movesLeft = 9;
    
    
    public void setBlock(int x, int y, int player) {
    	blocksData[x][y].setContents(Integer.toString(player));
    	this.setLegality(x,y,false);
    	if(x-1 > -1 && blocksData[x-1][y].getContents().equals("")) {
    		this.setLegality(x-1, y, true);
    	}
    }
    public boolean getIsLegalMove(int x, int y) {
    	return blocksData[x][y].getIsLegalMove();
    }
    public void resetBlock(int x, int y) {
    	blocksData[x][y].reset();
    }
    public void setLegality(int x, int y,boolean val) {
    	blocksData[x][y].setIsLegalMove(val);
    }
    public int getBlock(int x, int y) {
    	if(blocksData[x][y].getContents().equals(""))
    		return -1;
    	return Integer.parseInt(blocksData[x][y].getContents());
    }
    public int getPlayer(){
    	return player;
    }
    
    public void setPlayer(int player) {
    	this.player = player;
    }    
    public void setMovesLeft(int moves) {
    	movesLeft = moves;
    }
    public int getMovesLeft() {
    	return movesLeft;
    }
    
    public boolean checkIsOver(int player){
    	for (int row = 0; row < 3; row++) {
    		int count = 0;
    	    for (int col = 0; col < 3; col++) {
    	    	if(getBlock(row,col) == player)
    	    		count++;
    	    	else
    	    		count--;
    	    }
    	    if (count == 3) return true;
    	    }
    	for (int row = 0; row < 3; row++) {
    		int count = 0;
    	    for (int col = 0; col < 3; col++) {
    	    	if(getBlock(col,row) == 1)
    	    		count++;
    	    	else
    	    		count--;
    	    }
    	    if (count == 3) return true;
    	    }
    	int posd = 0;
    	int negd = 0;
    	for (int val = 0; val < 3; val++) {
    	    	if(getBlock(val,val) == player)
    	    		posd++;
    	    	else
    	    		posd--;
    	    	if(getBlock(val,2-val) == player)
    	    		negd++;
    	    	else
    	    		negd--;
    	    if ((posd == 3) || (negd == 3)) return true;
    	    }
    	return false;
    }

    private String finalResult = null;


    public RowGameModel() {
	super();

	for (int row = 0; row < 3; row++) {
	    for (int col = 0; col < 3; col++) {
		blocksData[row][col] = new RowBlockModel(this);
	    } // end for col
	} // end for row
    }

    public String getFinalResult() {
	return this.finalResult;
    }

    public void setFinalResult(String finalResult) {
	this.finalResult = finalResult;
    }
}
