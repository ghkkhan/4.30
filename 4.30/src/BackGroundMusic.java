import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/**
 * Write a description of class BackGroundMusic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BackGroundMusic extends JFrame
{
    public static ListenerClass listener;
    JPanel p = new JPanel();
    JButton startSong = new JButton("Start Music");
    JButton previousSong = new JButton("Previous Song");
    JButton nextSong = new JButton("Next Song");
    JButton stopSong = new JButton("Stop Music");
    
    public static soundTrial backgroundMusic = new soundTrial();
    public BackGroundMusic()
    {
        super();
        
        p.add(startSong);
        p.add(stopSong);
        p.add(nextSong);
        p.add(previousSong);
        
        setSize(300,140);
        add(p);
        setVisible(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
            	if(soundTrial.audio!=null) {
            		backgroundMusic.stopBackgroundMusic();
            	}
            	setVisible(false);
            }
        });
        listener = new ListenerClass();
        
        startSong.addActionListener(listener);
        previousSong.addActionListener(listener);
        nextSong.addActionListener(listener);
        stopSong.addActionListener(listener);
    }
    
    private int runExit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static soundTrial getSound()
    {
        return backgroundMusic;
    }
    
    class ListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand() == "Start Music"){
                backgroundMusic.playBackgroundMusic();
                //System.out.println("StartMusic");
            }
            if(e.getActionCommand() == "Stop Music"){
                backgroundMusic.stopBackgroundMusic();
            }
            if(e.getActionCommand() == "Next Song"){
                backgroundMusic.nextBackgroundSong();
                backgroundMusic.playBackgroundMusic();
                //System.out.println("next");
            }
            if(e.getActionCommand() == "Previous Song"){
                backgroundMusic.previousBackgroundSong();
                backgroundMusic.playBackgroundMusic();
            }
        }
    }
}
