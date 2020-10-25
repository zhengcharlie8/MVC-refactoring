package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import model.RowGameModel;
import controller.RowGameController;


public class RowGameGUI implements RowGameView,PropertyChangeListener
{
    public JFrame gui = new JFrame("Three in a Row");
    public RowGameBoardView gameBoardView;
    public JButton reset = new JButton("Reset");
    public RowGameStatusView gameStatusView;
    
    private RowGameController gameController;
    private RowGameModel model;


    /**
     * Creates a new game initializing the GUI.
     */
    public RowGameGUI(RowGameController gameController, RowGameModel model) {
	this.gameController = gameController;
	this.model = model;
	model.addPropertyChangeListener(this);
	
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(500, 350));
        gui.setResizable(true);

	gameBoardView = new RowGameBoardView(this.gameController);
        JPanel gamePanel = gameBoardView.gamePanel;

        JPanel options = new JPanel(new FlowLayout());
        options.add(reset);

	gameStatusView = new RowGameStatusView(this.gameController);
        JPanel messages = gameStatusView.messages;

        gui.add(gamePanel, BorderLayout.NORTH);
        gui.add(options, BorderLayout.CENTER);
        gui.add(messages, BorderLayout.SOUTH);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameController.reset();
            }
        });
    }

	/**
     * Updates the game view after the game model
     * changes state.
     *
     * @param gameModel The current game model
     */
    public void update(RowGameModel gameModel) {
	gameBoardView.update(gameModel);

	gameStatusView.update(gameModel);
    }

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		this.update(model);
	}
}
