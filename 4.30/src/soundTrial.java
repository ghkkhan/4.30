/**
 * Write a description of class soundTrial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.net.URL;
import java.applet.*;
import java.math.*;

public class soundTrial extends JApplet{
    public static AudioClip audio;
    private String[] audioList;
    /* PUT BACKGROUND MUSIC HERE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    private static String[] backgroundSongs = {"/SoundFiles/1.wav","/SoundFiles/2.wav","/SoundFiles/3.wav","/SoundFiles/4.wav","/SoundFiles/5.wav","/SoundFiles/6.wav","/SoundFiles/7.wav","/SoundFiles/8.wav","/SoundFiles/9.wav","/SoundFiles/10.wav","/SoundFiles/11.wav","/SoundFiles/12.wav"};
    private int backgroundSongIndex = 0;
    //private static String vicSong = "/Songs/MOZART 12 Variations on Ah vous dirai-je Maman K265 Alberto Lodoletti piano.aiff";
    //int i = (int)(Math.random()*2);
    private void createAudioList()
    {
        audioList = new String[60];
        String tempString;
        for(int i = 0; i <60; i++)
        {
            tempString = "/Songs/Recording (" + (i+4) + ").wav";
            audioList[i] = tempString;
        }
    }
    public void nextBackgroundSong()
    {
        // System.out.println("length"+backgroundSongs.length);
        // System.out.println("index"+backgroundSongIndex);
        if(backgroundSongIndex == backgroundSongs.length-1)
        {
            backgroundSongIndex=0;
        }
        else
        {
            backgroundSongIndex++;
        }
    }
    public void previousBackgroundSong()
    {
        if(backgroundSongIndex == 0)
        {
            backgroundSongIndex=backgroundSongs.length;
        }
        else
        {
            backgroundSongIndex--;
        }
    }
    public soundTrial(){
        createAudioList();
        /*URL urlForAudio = getClass().getResource(audioList[i]);    
        audio = Applet.newAudioClip(urlForAudio);
        audio.loop();*/
    }
    public void playSong(int index)
    {
        if(audio!=null)audio.stop();
        //audioList[10]="/Songs/Richard-Wagner-Ride-Of-The-Valkyries.wav";
        URL urlForAudio = getClass().getResource(audioList[index]);
        audio = Applet.newAudioClip(urlForAudio);
        //if(audio != null) audio.loop();
        audio.play();
        //stop();
        //System.out.println(audioList[index]);
    }
    public void playBackgroundMusic(){
        if(audio!=null)audio.stop();
        URL urlForAudio = getClass().getResource(backgroundSongs[backgroundSongIndex]);
        audio = Applet.newAudioClip(urlForAudio);
        if(audio != null) audio.loop();
    }
    public void stopBackgroundMusic(){
        audio.stop();
    }
    
    /*public void nextBackgroundMusic(){
        backgroundSongIndex++;
        stop();
        URL urlForAudio = getClass().getResource(audioList[backgroundSongIndex]);
        audio = Applet.newAudioClip(urlForAudio);
        if(audio != null) audio.loop();
    }*/
    
    /*public void loSong(){
        stop();
        URL urlForAudio = getClass().getResource(vicSong);
        audio = Applet.newAudioClip(urlForAudio);
        if(audio != null) audio.loop();
    }
    public void vicSong(){
        stop();
        URL urlForAudio = getClass().getResource(loseSong);
        audio = Applet.newAudioClip(urlForAudio);
        if(audio != null) audio.loop();
    }
    public void stop(){
        if (audio !=null) audio.stop();
    }
    public void nextSong(){
        stop();
        if(i<2){
            i++;
        }
        else i = 0;
        System.out.println(i);
        start();
    }
    public void prevSong(){
        stop();
        if(i!=0){
            i--;
        }
        else i = 2;
        start();
    }*/
}