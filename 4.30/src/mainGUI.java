import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
/*
public class mainGUI extends JFrame{
    
    public static mainGUI frame;
    public mainGUI(){
        setLayout(new GridLayout(4,2,5,5));
        JLabel pick = new JLabel("Pick your Poison");
        pick.setForeground(Color.decode("#ffff4d"));
        add(pick);
        add(new JLabel(""));
        JButton physics = new JButton("Make Me My Physics Lab");
        physics.setBackground(Colonr.decode("#66ff99"));
        physics.setForeground(Color.decode("#ff0000"));
        add(physics);
        ListenerClass listener = new ListenerClass();
        physics.addActionListener(listener);
        
        JButton efinal = new JButton("Final grade Calculater");
        efinal.setBackground(Color.decode("#66ff99"));
        efinal.setForeground(Color.decode("#ff0000"));
        add(efinal);
        efinal.addActionListener(listener);
        
        JButton snow = new JButton("Snowday Percent Calculater");
        add(snow);
        snow.setBackground(Color.decode("#66ff99"));
        snow.setForeground(Color.decode("#ff0000"));
        snow.addActionListener(listener);
        
        JButton life = new JButton("Social Simulater");
        add(life);
        life.setBackground(Color.decode("#66ff99"));
        life.setForeground(Color.decode("#ff0000"));
        life.addActionListener(listener);
        
        JButton Creds = new JButton("Credits");
        add(Creds);
        Creds.setBackground(Color.decode("#66ff99"));
        Creds.setForeground(Color.decode("#ff0000"));
        Creds.addActionListener(listener);
    }
    public static void boot(){
        frame = new mainGUI();
        frame.setTitle("4.3 - A Free Pass Through High School");
        frame.setSize(600, 250);
        frame.getContentPane().setBackground(Color.RED);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        BackGroundMusic k = new BackGroundMusic();
    }
    class ListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand() == "Make Me My Physics Lab"){
                frame.setVisible(false);
                Phcs.OperationMakePhysicsLab();
            }
            if(e.getActionCommand() == "Final grade Calculater"){
                frame.setVisible(false);
                sidProjs.CalFinal();
            }
            if(e.getActionCommand() == "Snowday Percent Calculater"){
                frame.setVisible(false);
                sidProjs.NoSnowDay();
            }
            if(e.getActionCommand() == "Social Simulater"){
                frame.setVisible(false);
                RealChatter r = new RealChatter();
            }
            if(e.getActionCommand() == "Credits"){
                frame.setVisible(false);
                Creds.rollCreds();
            }
        }
    }
}
*/

public class mainGUI extends Application{
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button buttonE;
    String[] args;
    
    public static void boot(String[] args){
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("4.30 - A Free Pass Through High School");
        button1 = new Button("Make Me My Physics Lab");
        button1.setOnAction(e -> {
            //Phcs.OperationMakePhysicsLab();
        });
        button2 = new Button("Final grade Calculater");
        button2.setOnAction(e -> {
        	sidProjs.boot(args);
        	primaryStage.hide();
        	sidProjs.num = 0;

        });
        button3 = new Button("Snowday Percent Calculater");
        button3.setOnAction(e -> {
        	sidProjs.num = 1;
        	sidProjs.boot(args);
        	primaryStage.hide();
        });
        button4 = new Button("Social Simulater");
        button4.setOnAction(e -> {
        	primaryStage.hide();
        	//RealChatter r = new RealChatter();
        });
        button5 = new Button("Credits");
        button5.setOnAction(e -> {
        	primaryStage.hide();
        	//Creds.rollCreds();
        });
        buttonE = new Button("EXIT!!!");
        buttonE.setOnAction(e -> {
        	System.exit(0);
        	//Close Command
        });
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(12);
        
        GridPane.setConstraints(button1, 0, 0);
        GridPane.setConstraints(button2, 1, 0);
        GridPane.setConstraints(button3, 2, 0);
        GridPane.setConstraints(button4, 0, 1);
        GridPane.setConstraints(button5, 1, 1);
        GridPane.setConstraints(buttonE, 2, 1);
        
        grid.getChildren().addAll(button1,button2,button3,button4,button5,buttonE);
        
        //VBox layout = new VBox();
        //layout.getChildren().addAll(button1,button2,button3,button4,button5);
        
        Scene scene = new Scene(grid,600,120);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}