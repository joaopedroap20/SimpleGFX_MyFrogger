package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StartScreen {

    public StartScreen() {
       // Picture startScreen = new Picture();
        Rectangle startButton = new Rectangle(10,10,60,30);
        startButton.draw();
        Text start  = new Text(15, 15, "START");
        start.draw();


    }


}
