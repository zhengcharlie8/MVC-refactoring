package controller;

public class TicTacToe extends RowGameController {
	
	@Override
    public void reset() {
        for(int row = 0;row<3;row++) {
            for(int column = 0;column<3;column++) {
                gameModel.resetBlock(row,column);
                gameModel.setLegality(row, column, true);
            }
        }
	gameModel.setPlayer(1);	
	gameModel.setMovesLeft(9);
	gameModel.setFinalResult(null);
    }
}
