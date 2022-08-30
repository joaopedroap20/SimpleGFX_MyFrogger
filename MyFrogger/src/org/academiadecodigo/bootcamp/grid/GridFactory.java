package org.academiadecodigo.bootcamp.grid;

public class GridFactory {

    public static Grid makeGrid(int cols, int rows){

        return new SimpleGfxGrid(cols, rows);
    }
}
