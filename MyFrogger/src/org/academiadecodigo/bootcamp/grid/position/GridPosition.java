package org.academiadecodigo.bootcamp.grid.position;

public interface GridPosition {

    public int getCol();//pos col grid

    public int getRow();//pos row grid

    public void setPos(int col, int row);//update Pos grid

    public void show();//display pos grid

    public void hide();//hides pos grid

    public void moveInDirection(GridPosition direction, int distance);

    public boolean equals(GridPosition position);
}
