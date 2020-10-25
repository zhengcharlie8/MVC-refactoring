package controller;

import model.RowGameModel;


/**
 * Java implementation of the 3 in a row game, using the Swing framework.
 *
 * This quick-and-dirty implementation violates a number of software engineering
 * principles and needs a thorough overhaul to improve readability,
 * extensibility, and testability.
 */
public abstract class RowGameController implements RowGameRulesStrategy{
    public static final String GAME_END_NOWINNER = "Game ends in a draw";

    public RowGameModel gameModel;
    /**
     * Creates a new game initializing the GUI.
     */
    public RowGameController() {
	gameModel = new RowGameModel(this);	
	reset();
    }

    public RowGameModel getModel() {
	return this.gameModel;
    }
    public void startUp() {
	gameModel.gameView.gui.setVisible(true);
    }
    
    
    //V3 no longer valid.
    /**
     * Moves the current player into the given block.
     *
     * @param block The block to be moved to by the current player
     */
    public void move(int row, int column) {
	int player = gameModel.getPlayer();
	int movesLeft = gameModel.getMovesLeft();
	if(player == 1) {
	    // Check whether player 1 won
	    if(row == 0 && column == 0) {
		gameModel.setBlock(0,0,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	else if(row == 0 && column == 1) {
		gameModel.setBlock(0,1,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	    else if(row == 0 && column == 2) {
		gameModel.setBlock(0,2,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	     else if(row == 1 && column == 0) {
		gameModel.setBlock(1,0,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	     else if(row == 1 && column == 1) {
			gameModel.setBlock(1,1,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		
	    } else if(row == 1 && column == 2) {
			gameModel.setBlock(1,2,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		
	    } else if(row == 2 && column == 0) {
			gameModel.setBlock(2,0,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		
	    } else if(row == 2 && column == 1) {
			gameModel.setBlock(2,1,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	    else if(row == 2 && column == 2) {
			gameModel.setBlock(2,2,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 1 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	}
	else {
		player = 2;
	    // Check whether player 2 won
	    if(row == 0 && column == 0) {
			gameModel.setBlock(0,0,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie()) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    else if(row == 0 && column == 1) {
			gameModel.setBlock(0,1,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie()) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    else if(row == 0 && column == 2) {
			gameModel.setBlock(0,2,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie()) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}else if(row == 1 && column == 0) {
			gameModel.setBlock(1,0,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie()) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}else if(row == 1 && column == 1) {
			gameModel.setBlock(1,1,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie()) 
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	    else if(row == 1 && column == 2) {
			gameModel.setBlock(1,2,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	    else if(row == 2 && column == 0) {
			gameModel.setBlock(2,0,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	     else if(row == 2 && column == 1) {
			gameModel.setBlock(2,1,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}else if(row == 2 && column == 2) {
			gameModel.setBlock(2,2,player);
		if(movesLeft<7) {
			if(isWin()) {
				gameModel.setFinalResult("Player 2 wins!");
				endGame();
			}
		    } else if(isTie())
			gameModel.setFinalResult(GAME_END_NOWINNER);
		}
	}
	if (player == 1)
		gameModel.setPlayer(2);
	else
		gameModel.setPlayer(1);
    }

public boolean isWin() {
	return gameModel.checkIsOver(gameModel.getPlayer());
}

public boolean isTie() {
	return gameModel.getMovesLeft()==0;
}

    /**
     * Ends the game disallowing further player turns.
     */
    public void endGame() {
	for(int row = 0;row<3;row++) {
	    for(int column = 0;column<3;column++) {
		this.gameModel.setLegality(row,column,false);
	    }
	}
    }

    /**
     * Resets the game to be able to start playing again.
     */
    public abstract void reset();
}
