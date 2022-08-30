package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameOver {

    public GameOver() {
        Picture lose = new Picture(10, 10, "MyFrogger/resources/gameOverBanner.png");
        lose.draw();
    }
    public void loseDraw(){
        Picture lose = new Picture(10, 10, "MyFrogger/resources/gameOverBanner.png");
        lose.draw();
    }
}
