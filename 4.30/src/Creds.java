import java.awt.Desktop;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;


/*
public class Creds extends JFrame {
    public static String[] colors = {"#000000","#010101","#020202","#030303","#040404","#050505","#060606","#070707","#080808","#090909","#0A0A0A","#0B0B0B","#0C0C0C","#0D0D0D","#0E0E0E","#0F0F0F","#101010","#111111","#121212","#131313","#141414","#151515","#161616","#171717","#181818","#191919","#1A1A1A","#1B1B1B","#1C1C1C","#1D1D1D","#1E1E1E","#1F1F1F","#202020","#212121","#222222","#232323","#242424","#252525","#262626","#272727","#282828","#292929","#2A2A2A","#2B2B2B","#2C2C2C","#2D2D2D","#2E2E2E","#2F2F2F","#303030","#313131","#323232","#333333","#343434","#353535","#363636","#373737","#383838","#393939","#3A3A3A","#3B3B3B","#3C3C3C","#3D3D3D","#3E3E3E","#3F3F3F","#404040","#414141","#424242","#434343","#444444","#454545","#464646","#474747","#484848","#494949","#4A4A4A","#4B4B4B","#4C4C4C","#4D4D4D","#4E4E4E","#4F4F4F","#505050","#515151","#525252","#535353","#545454","#555555","#565656","#575757","#585858","#595959","#5A5A5A","#5B5B5B","#5C5C5C","#5D5D5D","#5E5E5E","#5F5F5F","#606060","#616161","#626262","#636363","#646464","#656565","#666666","#676767","#686868","#696969","#6A6A6A","#6B6B6B","#6C6C6C","#6D6D6D","#6E6E6E","#6F6F6F","#707070","#717171","#727272","#737373","#747474","#757575","#767676","#777777","#787878","#797979","#7A7A7A","#7B7B7B","#7C7C7C","#7D7D7D","#7E7E7E","#7F7F7F","#808080","#818181","#828282","#838383","#848484","#858585","#868686","#878787","#888888","#898989","#8A8A8A","#8B8B8B","#8C8C8C","#8D8D8D","#8E8E8E","#8F8F8F","#909090","#919191","#929292","#939393","#949494","#959595","#969696","#979797","#989898","#999999","#9A9A9A","#9B9B9B","#9C9C9C","#9D9D9D","#9E9E9E","#9F9F9F","#A0A0A0","#A1A1A1","#A2A2A2","#A3A3A3","#A4A4A4","#A5A5A5","#A6A6A6","#A7A7A7","#A8A8A8","#A9A9A9","#AAAAAA","#ABABAB","#ACACAC","#ADADAD","#AEAEAE","#AFAFAF","#B0B0B0","#B1B1B1","#B2B2B2","#B3B3B3","#B4B4B4","#B5B5B5","#B6B6B6","#B7B7B7","#B8B8B8","#B9B9B9","#BABABA","#BBBBBB","#BCBCBC","#BDBDBD","#BEBEBE","#BFBFBF","#C0C0C0","#C1C1C1","#C2C2C2","#C3C3C3","#C4C4C4","#C5C5C5","#C6C6C6","#C7C7C7","#C8C8C8","#C9C9C9","#CACACA","#CBCBCB","#CCCCCC","#CDCDCD","#CECECE","#CFCFCF","#D0D0D0","#D1D1D1","#D2D2D2","#D3D3D3","#D4D4D4","#D5D5D5","#D6D6D6","#D7D7D7","#D8D8D8","#D9D9D9","#DADADA","#DBDBDB","#DCDCDC","#DDDDDD","#DEDEDE","#DFDFDF","#E0E0E0","#E1E1E1","#E2E2E2","#E3E3E3","#E4E4E4","#E5E5E5","#E6E6E6","#E7E7E7","#E8E8E8","#E9E9E9","#EAEAEA","#EBEBEB","#ECECEC","#EDEDED","#EEEEEE","#EFEFEF","#F0F0F0","#F1F1F1","#F2F2F2","#F3F3F3","#F4F4F4","#F5F5F5","#F6F6F6","#F7F7F7","#F8F8F8","#F9F9F9","#FAFAFA","#FBFBFB","#FCFCFC","#FDFDFD","#FEFEFE","#FFFFFF"};
    public static Creds frame;
    public static int i = 0;
    public static boolean increase = true;
    public static int turn = 0;
    public static Graphics g;
    public static String lone = "HUZAIFA";
    public static String ltwo = "IAN";
    public static String lthree = "TONG";
    public static String lfour = "JIM";
    public static Dimension screenSize;
    
    public Creds() {
        add(new chagingBackPanel());
    }
    public static void rollCreds(){
        frame = new Creds();
        frame.setTitle("AnimationDemo");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public class chagingBackPanel extends JPanel{
        public chagingBackPanel(){
            Timer timer = new Timer(10200,new TimerListener());
            timer.start();  
        }
        protected void paintComponent(Graphics g){
        
            super.paintComponent(g);
            g.drawString(lone, 200,200);
            g.drawString(ltwo, 200,220);
            g.drawString(lthree, 200,240);
            g.drawString(lfour, 200,260);
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException e){
                System.out.println();
            }
            if(i == 0){
                increase = true;
            }
            if(i == 255){
                increase = false;
            }
            if(increase){
                setBackground(Color.decode(colors[i]));
                i++;
            }
            else{
                setBackground(Color.decode(colors[i]));
                i--;
            }
        }
        class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent e){
                if(turn == 0){
                    lone = "Special thanks to:";
                    ltwo = "Mr. Kohmetscher";
                    lthree = "DOC Schuster";
                    lfour ="";
                    turn++;
                }
                else if(turn == 1){
                    lone = "Completed on:";
                    ltwo = "May 26, 2018";
                    lthree = "On Starbux, Wydown, Clayt!";
                    lfour = "Thank You for using US.";
                    turn++;
                }else if(turn == 2){
                    lone = "Prepare your Bodies.";
                    ltwo = "";
                    lthree = "";
                    lfour = "";
                    turn++;
                }
                else if(turn == 3){
                    screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    int height = (int) (screenSize.getHeight()*0.9);
                    int width = (int) screenSize.getWidth();
                    frame.setVisible(false);
                    ImageDisplayer i = new ImageDisplayer("Images/extrawide.jpg","The Creators",height,width);
                    lone = "";
                    ltwo = "";
                    lthree = "";
                    lfour = "";
                    turn++;
                }
                repaint();
            }
        }
    }
}
*/

public class Creds{
	
	public Creds() {
	}
	
	public static void rollCreds() {
		try {
			String filePath = System.getProperty("user.dir")+"/4.30/src/Movie/bandicam 2018-06-15 13-34-03-536.mp4";
			filePath = filePath.replace("\\", "/");
			Desktop.getDesktop().open(new File(filePath));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(65000);
			Dimension screenSize = new Dimension();
			screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        int height = (int) (screenSize.getHeight()*0.9);
	        int width = (int) screenSize.getWidth();
	        String filePath = System.getProperty("user.dir") + "/4.30/src/Movie/extrawide.jpg";
	        filePath = filePath.replace("\\", "/");
	        ImageDisplayer i = new ImageDisplayer(filePath,"The Creators",height,width);
		}
		catch(Exception e) {
			//ewiof
		}

		
	}
}