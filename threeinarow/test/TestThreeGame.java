import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.RowGameController;
import controller.ThreeInARowGame;

import static org.junit.Assert.*;

import model.RowBlockModel;
import model.RowGameModel;

public class TestThreeGame {
	ThreeInARowGame controller;
    @Before
    public void setUp() {
    ThreeInARowGame controller = new ThreeInARowGame();
    this.controller = controller;
    }

    @Test
    public void testReset() {
        controller.gameModel.setBlock(2, 0, 1);
    	controller.reset();
        assertEquals (-1, controller.gameModel.getBlock(0, 0));
    }
    @Test
    public void testLegalMove() {
        controller.gameModel.setBlock(2, 0, 1);
        assertEquals(1, controller.gameModel.getBlock(2, 0));
    }
    @Test
    public void testisWin() {
        controller.gameModel.setBlock(2, 0, 1);
        controller.gameModel.setBlock(2, 1, 1);
        controller.gameModel.setBlock(2, 2, 1);
        assertEquals(true, controller.isWin());
    }
    @Test
    public void testisTie() {
        controller.gameModel.setBlock(2, 0, 1);
        controller.gameModel.setBlock(1, 0, 2);
        controller.gameModel.setBlock(0, 0, 1);
        controller.gameModel.setBlock(2, 2, 2);
        controller.gameModel.setBlock(2, 1, 1);
        controller.gameModel.setBlock(1, 1, 2);
        controller.gameModel.setBlock(1, 2, 1);
        controller.gameModel.setBlock(0, 1, 2);
        controller.gameModel.setBlock(0, 2, 1);
        assertEquals(false, controller.isWin());
        assertEquals(true, controller.isTie());
    }
    @Test
    public void testIllegalMove() {
        controller.gameModel.setBlock(2, 0, 1);
        controller.gameModel.setBlock(2, 0, 2);
        assertEquals(1, controller.gameModel.getBlock(2, 0));
    }
    @Test
    public void testGUI() {
    	assertEquals(3,controller.gameModel.gameView.gameBoardView.blocks.length);
    	assertEquals(3,controller.gameModel.gameView.gameBoardView.blocks[0].length);
    }
}