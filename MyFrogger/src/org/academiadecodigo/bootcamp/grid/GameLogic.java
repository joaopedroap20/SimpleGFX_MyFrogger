package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.BusStation;
import org.academiadecodigo.bootcamp.KeyboardLogic;
import org.academiadecodigo.bootcamp.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameLogic {
    public static int xPlayer = 260;
    public static int yPlayer = 760;
    BusStation busStation = new BusStation();
    static Player player = new Player(260, 760, "andre_joao_50x50_bicubicreduction.png");

    public void movement() {
        KeyboardLogic keyboardLogic = new KeyboardLogic();
        keyboardLogic.init();
        keyboardLogic.setPlayer(player);
        busStation.Threads();
    }
//AQUI O PLAYER VOLTA PARA A POSIÇÃO INICIAL // O 2º IF FAZ CHECK/EXECUTA GAMEOVER
    public static void ResetPlayer(boolean isInit) {
        player.setPlayerPos(260, 760, isInit);
        System.out.println(player.health);
        if (player.health <= 0) {
            player.setPlayerPos(-342134, -12341234, false);
            Picture gameOver = new Picture(180, 210, "gameOverBanner.png");
            gameOver.draw();
        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}