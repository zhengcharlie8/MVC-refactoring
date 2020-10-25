package controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

import model.RowGameModel;
import view.RowGameGUI;


/**
 * Java implementation of the 3 in a row game, using the Swing framework.
 *
 * This quick-and-dirty implementation violates a number of software engineering
 * principles and needs a thorough overhaul to improve readability,
 * extensibility, and testability.
 */
public class RowGameController {
    public static final String GAME_END_NOWINNER = "Game ends in a draw";

    public RowGameModel gameModel;
    public RowGameGUI gameView;


    /**
     * Creates a new game initializing the GUI.
     */
    public RowGameController() {
	gameModel = new RowGameModel();
	gameView = new RowGameGUI(this);
	
	resetGame();
    }

    public RowGameModel getModel() {
	return this.gameModel;
    }

    public RowGameGUI getView() {
	return this.gameView;
    }

    public void startUp() {
	gameView.gui.setVisible(true);
    }

    /**
     * Moves the current player into the given block.
     *
     * @param block The block to be moved to by the current player
     */
    public void move(JButton block) {
	gameModel.setMovesLeft(gameModel.getMovesLeft() - 1);

	int player = gameModel.getPlayer();
	int movesLeft = gameModel.getMovesLeft();
	if(player == 1) {
	    // Check whether player 1 won
	    if(block==gameView.gameBoardView.blocks[0][0]) {
		gameModel.setBlock(0,0,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[0][1]) {
		gameModel.setBlock(0,1,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[0][2]) {
		gameModel.setBlock(0,2,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[1][0]) {
		gameModel.setBlock(1,0,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[1][1]) {
			gameModel.setBlock(1,1,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[1][2]) {
			gameModel.setBlock(1,2,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[2][0]) {
			gameModel.setBlock(2,0,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
		       gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[2][1]) {
			gameModel.setBlock(2,1,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
		        gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[2][2]) {
			gameModel.setBlock(2,2,player);
		gameModel.setPlayer(2);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    }
	} else {
		player = 2;
	    // Check whether player 2 won
	    if(block==gameView.gameBoardView.blocks[0][0]) {
			gameModel.setBlock(0,0,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[0][1]) {
			gameModel.setBlock(0,1,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[0][2]) {
			gameModel.setBlock(0,2,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)){
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[1][0]) {
			gameModel.setBlock(1,0,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[1][1]) {
			gameModel.setBlock(1,1,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[1][2]) {
			gameModel.setBlock(1,2,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[2][0]) {
			gameModel.setBlock(2,0,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[2][1]) {
			gameModel.setBlock(2,1,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.gameBoardView.blocks[2][2]) {
			gameModel.setBlock(2,2,player);
		gameModel.setPlayer(1);
		if(movesLeft<7) {
		    if(gameModel.checkIsOver(player)) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(movesLeft==0) {
			gameModel.setFinalResult(GAME_END_NOWINNER);
		    }
		}
	    }
	}

	gameView.update(gameModel);
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

	gameView.update(gameModel);
    }

    /**
     * Resets the game to be able to start playing again.
     */
    public void resetGame() {
        for(int row = 0;row<3;row++) {
            for(int column = 0;column<3;column++) {
                gameModel.resetBlock(row,column);
		// Enable the bottom row
	        gameModel.setLegality(row,column,true);
            }
        }
	gameModel.setPlayer(1);	
	gameModel.setMovesLeft(9);
	gameModel.setFinalResult(null);

	gameView.update(gameModel);
    }
}
