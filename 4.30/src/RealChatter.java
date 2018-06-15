//import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.lang.Math;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class RealChatter extends Application
{
    Panel p = new Panel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    public static ListenerClass listener;
    
    ArrayList<String> outputs = new ArrayList<String>();
    
    Label l0 = new Label("<html><MARQUEE><FONT COLOR=RED>Social</FONT> <FONT COLOR=BLUE>Simulator:</FONT></MARQUEE></HTML>");
    Label l1 = new Label(" ");
    Label l2 = new Label(" ");
    Label l3 = new Label(" ");
    Label l4 = new Label(" ");
    Label l5 = new Label(" ");
    Label l6 = new Label(" ");
    Label l7 = new Label(" ");
    Label l8 = new Label(" ");
    TextArea ta = new TextArea("input",1,30);
    Button b = new Button("Enter");
    Button b2 = new Button("Safe Mode");
    Label l9 = new Label("<html>Safe Mode: On<html>");
    //JLabel l9 = new JLabel("<html><FONT COLOR=RED>Red</FONT> and <FONT COLOR=BLUE>Blue</FONT> Text</html>");
    
    private String asmr = "Did you try turning it off and on again?^Kick it as hard as you can^Mash all the buttons^Have you tried tasting it?^Have you tried drinking your "
    +"troubles away?^See a psychiatrist^Maybe if you had more money then it would work…^Santa doesn’t visit poor people for Christmas, you know^Don’t be a dangle^I just blinked and thought that "
    +"the lights flickered^Who's your daddy now?^Do you know who the Father is?^Get rid of the evidence! Huryy!^Is he the father?^Did you try apologizing?^Don’t be insecure.^Don’t even worry "
    +"about it.^Well, you’re kinda screwed.^lol ur done for kid^Dang they sound like a crap. U should stop being friends with them.^They were never your friends to begin with^It will get better… "
    +"probably. Well, at least it won’t get worse.^Don’t worry, in the end, it doesn’t even matteeeerrrrrrrrrrr.^At least you know what it feels like to get fucked in the ass -- “EN”^Did you "
    +"try giving them copious amounts of money?^Did you try cpr?^You have done well to come to me for support^Don’t be a negativity^When "
    +"Miley Cyrus gets naket and licks a hammer it's 'art' and 'music.' When I do it, I'm 'wasted' and 'have to leave Home Depot.'^I was peelin’ an orange while watchin’ this and it squirted and "
    +"I almost crapped my pants^I played this song at my hamsters funeral^How tf do people do this sht, I tried to draw a tree yesterday and got so angry I had to lay down and count to ten^"
    +"This song is good but I need a man^That's exactly how I look after I take a dump and there's "
    +"not toilet paper and have to get up and go find some^RONALD WEASLY! HOW DARE YOU STAR IN A MUGGLE VIDEO! I AM ABSOLUTELY DISGUSTED! YOUR FATHER IS FACING AN INQUIRY AT WORK, AND IT IS "
    +"ENTIRELY YOUR FAULT! IF YOU STOP ANOTHER TOE OUT OF LINE, WE WILL BRING YOU STRAIGHT HOME! Oh and Ed dear, congratulations on the good song,  your fans and I are so proud.^His dentist is "
    +"someone he used to know^'It's like we opened a dead chicken' what? Do you eat your chickens alive or something?^I have no memory of this^I was going to leave a comment judging you about " 
    +"sitting in one spot for 4 hours, but I watched the entire thing and now I'm kind of judging myself^The should’ve deleted the whole movie^"
    +"Why does he have oreos in his ears^Awesome song, but was this filmed with a calculator?^I used to be a fan, but now I'm an air conditioner^Looks like Cory isn't the only one in "
    +"the house^Instructions unclear. Burnt down my house and married a goat.^WHY IS THERE AN EGG WITH SUNGLASSES STARING AT ME???^She looks like the kind of girl who acts all sweet, then when"
    +"gets criticism goes home and microwaves her hamster.^What the fuk am i doing with my life^Why are they laughing in english?^I am a real housecat. After I take a bong-hit I SWEAR I can type "
    +"in English for about 60 sec meow meow meow meow meow meow^Contrary to popular belief that wave was not caused by wind. It's the ocean trying to reclaim the void left by the weight from "
    +"that surfer's enormous balls.^God made him gay because if he was straight no other man would have a chance with any girl^Is there a way to make this without nuts for those who are "
    +"allergic? Yeah, just don't add the nuts dipshit.^Instructions unclear; scrote stuck in microwave. Someone help me turn that thing off^"
    +"Why is this piece of beef jerky talking?^This is sensational, I've never seen a talking mushroom.^This guy had sex with my girlfriend. I'm jealous of "
    +"her.^They should really play this in museums^I feel like I've already lived too long.^";
    private ArrayList<String> asmrList = new ArrayList<String>();
    
    int safeMode = 1; // 1 is on, 0 is off
    
    soundTrial sound = new soundTrial();
    
    public RealChatter()
    {
        super();
        
        makeAsmrList();
        
        setSize(1500,800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        listener = new ListenerClass();
        
        c.gridx = 0;c.gridy = 0;c.insets = new Insets(0,0,0,50);
        l0.setFont(new Font("Serif", Font.PLAIN, 30));
        p.add(l0,c);
        c.gridx = 0;c.gridy = 1;
        p.add(l1,c);
        c.gridx = 0;c.gridy = 2;
        p.add(l2,c);
        c.gridx = 0;c.gridy = 3;
        p.add(l3,c);
        c.gridx = 0;c.gridy = 4;
        p.add(l4,c);
        c.gridx = 0;c.gridy = 5;
        p.add(l5,c);
        c.gridx = 0;c.gridy = 6;
        p.add(l6,c);
        c.gridx = 0;c.gridy = 7;
        p.add(l7,c);
        c.gridx = 0;c.gridy = 8;
        p.add(l8,c);
        
        c.gridx = 0;c.gridy = 9;c.insets = new Insets(30,0,0,0);
        p.add(ta,c);
        c.gridx = 0;c.gridy = 10;c.insets = new Insets(0,0,0,0);
        p.add(b,c);
        c.gridx = 0;c.gridy = 11;
        p.add(b2,c);
        
        c.gridx = 0;c.gridy = 12;c.insets = new Insets(100,0,0,0);
        p.add(l9,c);
        
        b.addActionListener(listener);
        b2.addActionListener(listener);
        
        add(p);
        setVisible(true);
    }
    
    private void makeAsmrList()
    {
        while(asmr.length() > 1)
        {
            int nextCarrot = asmr.indexOf("^");
            String tempString = asmr.substring(0,nextCarrot);
            asmrList.add(tempString);
            String newAsmrString = asmr.substring(nextCarrot+1);
            asmr = newAsmrString;
        }
        for(int i =0; i<asmrList.size();i++)
        {
            //System.out.println((i+4) + ": " + asmrList.get(i));
        }
    }
    
    class ListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //IAN ADD THIS
            if(BackGroundMusic.getSound().audio != null)
            {
                BackGroundMusic.getSound().stopBackgroundMusic();
            }
            //
            if(e.getActionCommand() == "Enter"){
                if(!ta.getText().equals(""))
                {
                    l1.setText(l3.getText());
                    l2.setText(l4.getText());
                    l3.setText(l5.getText());
                    l4.setText(l6.getText());
                    l5.setText(l7.getText());
                    l6.setText(l8.getText());
                    l7.setText(ta.getText());
                    if(safeMode == 1)
                    {
                        boolean safeIntFound = false;
                        int randomInt = 0;
                        while(safeIntFound == false)
                        {
                            randomInt = (int) (asmrList.size() * Math.random());
                            if(randomInt != 23 ||randomInt != 29||randomInt != 31||randomInt != 47||randomInt != 50||randomInt != 53||randomInt != 56)
                            {
                                safeIntFound = true;
                            }
                        }
                        l8.setText(asmrList.get( randomInt ));
                        sound.playSong(randomInt);
                    }
                    else
                    {
                        int randomInt = (int) (asmrList.size() * Math.random());
                        l8.setText(asmrList.get(randomInt));
                        sound.playSong(randomInt);
                    }
                    
                    
                    ta.setText("");
                }
                //System.out.println("Asdf");
            }
            if(e.getActionCommand() == "Safe Mode"){
                int input = JOptionPane.showConfirmDialog(null, "Would you like safe mode to be on?");
                if(input == 0)
                {
                    safeMode = 1;
                    //System.out.println("2");
                    l9.setText("Safe Mode: On");
                }
                else if(input == 1)
                {
                    safeMode = 0;
                    //System.out.println("1");
                    l9.setText("Safe Mode: Off");
                }
                //System.out.println(safeMode);
            }
            
        }
    }
    
}
