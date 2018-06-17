import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

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
    String s = "aewfwaegrea";
    MarqueePanel mp = new MarqueePanel (s,num);
    public static GridBagConstraints c;
    public static Font font = new Font("Comic Sans MS",Font.PLAIN,30);
    public static int num = 20;
    public static soundTrial backgroundMusic = new soundTrial();
    public BackGroundMusic(int index) {
        super();
        p.setLayout(new GridBagLayout());
        p.setBackground(Color.BLACK);

        
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.insets = new Insets(10,5,5,5);  //top padding
        c.gridy = 0;
        p.add(startSong,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        p.add(stopSong,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        p.add(nextSong,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        p.add(previousSong,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.ipady = 40;
        c.weighty = 1;
        c.gridheight =2;
        c.gridwidth = 3;   //2 columns wide
        p.add(mp, c);
        
        setSize(245,204);
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
        previousSong.addActionListener((ActionListener) listener);
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
                s = "Current Song: -- "+ soundTrial.names[soundTrial.backgroundSongIndex];
                mp = new MarqueePanel (s,num);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 1;
                c.weightx = 1;
                c.ipady = 40;
                c.weighty = 1;
                c.gridheight =2;
                c.gridwidth = 3;   //2 columns wide
                p.add(mp, c);
                mp.start();
                //System.out.println("StartMusic");
            }
            if(e.getActionCommand() == "Stop Music"){
                backgroundMusic.stopBackgroundMusic();
                mp.stop();

            }
            if(e.getActionCommand() == "Next Song"){
                backgroundMusic.nextBackgroundSong();
                backgroundMusic.playBackgroundMusic();
                mp.stop();
                s = "Current Song: -- "+ soundTrial.names[soundTrial.backgroundSongIndex];
                mp = new MarqueePanel (s,num);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 1;
                c.weightx = 1;
                c.ipady = 40;
                c.weighty = 1;
                c.gridheight =2;
                c.gridwidth = 3;   //2 columns wide
                p.add(mp, c);
                mp.start();

                //System.out.println("next");
            }
            if(e.getActionCommand() == "Previous Song"){
                backgroundMusic.previousBackgroundSong();
                mp.stop();
                s = "Current Song: -- "+ soundTrial.names[soundTrial.backgroundSongIndex];
                mp = new MarqueePanel (s,num);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 1;
                c.weightx = 1;
                c.ipady = 40;
                c.weighty = 1;
                c.gridheight =2;
                c.gridwidth = 3;   //2 columns wide
                p.add(mp, c);
                mp.start();

                backgroundMusic.playBackgroundMusic();
            }
        }
    }
}

/** Side-scroll n characters of s. */
class MarqueePanel extends JPanel implements ActionListener {

    private static final int RATE = 6;
    private final Timer timer = new Timer(1000 / RATE, this);
    private final JLabel label = new JLabel();
    private final String s;
    private final int n;
    private int index;

    public MarqueePanel(String s, int n) {
        if (s == null || n < 1) {
            throw new IllegalArgumentException("Null string or n < 1");
        }
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        this.s = sb + s + sb;
        this.n = n;
        label.setFont(BackGroundMusic.font);
        setBackground(Color.black);
        label.setForeground(Color.CYAN);
        label.setText(sb.toString());
        this.add(label);
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        index++;
        if (index > s.length() - n) {	
            index = 0;
        }
        label.setText(s.substring(index, index + n));
    }
}