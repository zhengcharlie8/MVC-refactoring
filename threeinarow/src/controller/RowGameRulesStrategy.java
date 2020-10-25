package controller;

import model.RowGameModel;


public interface RowGameRulesStrategy
{
    public void reset();

    public void move(int row, int col);

    public boolean isWin();

    public boolean isTie();
}
