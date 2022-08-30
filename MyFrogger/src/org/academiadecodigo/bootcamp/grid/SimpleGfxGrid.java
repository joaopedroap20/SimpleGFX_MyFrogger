package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.WinStage;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class SimpleGfxGrid implements Grid{

    public static  final int PADDING = 10;

    private int cellSize = 50;
    private int cols;
    private int rows;

    private Picture background;

    private Rectangle field;


    public SimpleGfxGrid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
    }
    @Override
    public void init() {
        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.draw();
        this.background = new Picture(10,10,"road3.png");
        this.background.draw();

        //WinStage win = new WinStage();

        //Button bt = new Button("test");
       // Canvas.getInstance().
    }

    public int getCellSize() {
        return cellSize;
    }

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public int getRows() {
        return this.rows;
    }

    public int getWidth(){
        return this.field.getWidth();
    }

    public int getHeight(){
        return this.field.getHeight();
    }

    public int getX(){
        return this.field.getX();
    }

    public int getY(){
        return this.field.getY();
    }

    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col,row,this);
    }

    public int rowToY(int row){
        return PADDING + cellSize * row;
    }

    public int columnToX(int col){
        return PADDING + cellSize * col;
    }

}
