package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.GameLogic;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {
    public int health = 3;
    private final Picture picture;
    public Player(int x, int y, String png) {

        picture = new Picture(260, 760, "andre_joao_50x50_bicubicreduction.png");
        picture.draw();
        System.out.println(picture.getX() - 10);
    }
    public int getPlayerY() {
        return picture.getY();
    }

    public int getPlayerX() {
        return picture.getX();
    }


    public void moveRight() {
        if (picture.getMaxX() < 550) {
            picture.translate(50, 0);
        }
    }

    public void moveLeft() {
        if (picture.getX() > 10) {
            picture.translate(-50, 0);
            //System.out.println("X "+ (picture.getX() - 10) + " Max X " + (picture.getMaxX()-10));
        }
    }

    //O MOVE UP FAZ CHECK DE SE A POSIÇÃO DO PLAYER É IGUAL AO PARÂMETRO QUE DEFINIMOS COMO WIN LOGO AQUI TEMOS UM WIN CONDITION
    public void moveUp() {
        if (picture.getY() > 10) {
            picture.translate(0, -50);
            if (picture.getY() == 10) {
                Picture winnerBanner = new Picture(140, 210, "tileWinnerBanner.png");
                winnerBanner.draw();
                picture.translate(-238443512, -21342134);
                System.out.println("You win!");
            }
        }
    }

    public void moveDown() {
        if (picture.getMaxY() < 790) {
            picture.translate(0, 50);
        }
    }

    //VVVVVVVVVV Bebé do Joao P. VVVVVVVVVV
    public void setPlayerPos(int xPos, int yPos, boolean isInit) {
        System.out.println("here");
        picture.translate(-picture.getX() + xPos, -picture.getY() + yPos);
        GameLogic.xPlayer = this.getPlayerX();
        GameLogic.yPlayer = this.getPlayerY();
        if (!isInit) {
            health--;
        }
    }
}



