package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.grid.position.GridPosition;

public interface Grid {

    public void init(); //init grid

    public int getCols();//num cols grid

    public int getRows();//num rows grid

    public GridPosition makeGridPosition();//random grid position

    public GridPosition makeGridPosition(int col, int row);//specific grid position
}
