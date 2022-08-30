package org.academiadecodigo.bootcamp;
import org.academiadecodigo.bootcamp.grid.GameLogic;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.io.File;

public class Game {

    public void init() {



        SimpleGfxGrid bg = new SimpleGfxGrid(6, 8);
        bg.init();
        GameLogic gameLogic = new GameLogic();
        gameLogic.movement();
        gameLogic.ResetPlayer(true);
        MusicStuff musicObj = new MusicStuff();
        musicObj.playMusic(musicObj.filePath);
        }

        private class MusicStuff{

            private String filePath = "MyFrogger/resources/themeSong.wav";

        void playMusic (String musicLocation){



            try{
                File musicPath = new File(musicLocation);

                if ( musicPath.exists()){
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    clip.loop(clip.LOOP_CONTINUOUSLY);

                    //JOptionPane.showMessageDialog(null, "Press OK to Stop");

                }
                else{
                    System.out.println("cant find file;");
                }

            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        }



}