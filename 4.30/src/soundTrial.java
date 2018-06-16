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
    private static String[] backgroundSongs = {"/Movie/1.wav","/Movie/2.wav","/Movie/3.wav","/Movie/4.wav","/Movie/5.wav","/Movie/6.wav","/Movie/7.wav","/Movie/8.wav","/Movie/9.wav","/Movie/10.wav"};
    private int backgroundSongIndex = 0;

    private void createAudioList()
    {
        audioList = new String[60];
        String tempString;
        for(int i = 0; i <60; i++)
        {
        	
            tempString ="/Movie/Recording (" + (i+4) + ").wav";
            audioList[i] = tempString;
            //System.out.println(audioList[i]);
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
        System.out.println(urlForAudio.toString());
        audio = Applet.newAudioClip(urlForAudio);
        if(audio != null) audio.loop();
    }
    public void stopBackgroundMusic(){
    	if(audio!=null)
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