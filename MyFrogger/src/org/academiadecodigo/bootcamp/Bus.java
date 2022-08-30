package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.GameLogic;
import org.academiadecodigo.simplegraphics.pictures.Picture;
public class Bus {
    private final Picture picture;

    public Bus(int x, int y, int size) {
        picture = new Picture(x, y, "bus.png");
        picture.draw();
    }

    //VELOCIDADE SÓ MEXER NO "SLEEP()" values. (- = mais rápido || + == mais lento
    Thread thread1 = new Thread() {

        public void run() {
            picture.translate(0, 10);
            while (true) {
                while (picture.getMaxX() < 560) {
                    try {
                        sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    picture.translate(1, 0);
                    checkCollision(picture.getX(), picture.getY());
                }
                picture.translate(-560, 0);
                picture.draw();
            }
        }
    };
    Thread thread2 = new Thread() {

        public void run() {
            picture.translate(0, 10);
            while (true) {
                while (picture.getMaxX() < 560) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    picture.translate(5, 0);
                    checkCollision(picture.getX(), picture.getY());
                }
                picture.translate(-560, 0);
                picture.draw();
            }
        }
    };
    Thread thread3 = new Thread() {

        public void run() {
            picture.translate(0, 10);
            while (true) {
                while (picture.getMaxX() < 560) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    picture.translate(1, 0);
                    checkCollision(picture.getX(), picture.getY());
                }
                picture.translate(-560, 0);
                picture.draw();
            }
        }
    };
// NEVER USED SO DO WHAT YOU WANT WITH IT (WITHOUT BREAKING EVERYTHING)
    Thread thread4 = new Thread() {

        public void run() {
            picture.translate(0, 10);
            while (true) {
                while (picture.getMaxX() < 560) {
                    try {
                        sleep(150);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    picture.translate(20, 0);

                    checkCollision(picture.getX(), picture.getY());


                }
                picture.translate(-560, 0);
                picture.draw();
            }
        }
    };

    //collision checker
    public static void checkCollision(int busX, int busY) {
        //System.out.println("checking collision");
        int frogX = GameLogic.xPlayer;//Estes xPlayer e yPlayer são sus
        int frogY = GameLogic.yPlayer;
        int frogWidth = 50 + frogX; //50 = cellSize
        int frogHeight = 50 + frogY;

        //check bus1 collision

        int bus1Width = 100 + busX;
        int bus1Height = 50 + busY;

        boolean xCollision = (frogX >= busX && frogX <= bus1Width) || (frogWidth >= busX && frogWidth <= bus1Width);

        boolean yCollision = (frogY >= busY && frogY <= bus1Height) || (frogHeight >= busY && frogHeight <= bus1Height);

        if (xCollision && yCollision) {
            GameLogic.ResetPlayer(false);

            System.out.println("Collision = " + (xCollision && yCollision));
        }
    }
}
