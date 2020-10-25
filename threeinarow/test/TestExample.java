import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.RowGameController;

import static org.junit.Assert.*;

import model.RowBlockModel;
import model.RowGameModel;


/**
 * An example test class, which merely shows how to write JUnit tests.
 */
public class TestExample {
    private RowGameModel gameModel;

    @Before
    public void setUp() {
    RowGameController controller = new RowGameController();
	gameModel = new RowGameModel(controller);
    }

    @After
    public void tearDown() {
	gameModel = null;
    }

    @Test
    public void testNewGame() {
        assertEquals (1, gameModel.getPlayer());
        assertEquals (9, gameModel.getMovesLeft());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewBlockViolatesPrecondition() {
	RowBlockModel block = new RowBlockModel(null);
    }
}
