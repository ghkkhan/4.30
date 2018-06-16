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