import javax.swing.*;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/*
public class sidProjs extends JFrame{
    public static ListenerClass listener = new ListenerClass();
    
    private static JTextField gOne;
    private static JTextField gTwo;
    private static JTextField wOne;
    private static JTextField wTwo;
    private static JTextField goal;
    private static Grades g=new Grades();
    private static sidProjs s;
    
    
    public sidProjs(){
        setLayout(new GridLayout(6,2,5,5));
        ListenerClass listener = new ListenerClass();
        
    }
    public static void CalFinal(){
        
        s = new sidProjs();
        
        s.add(new JLabel("Enter your First Semester Grade: "));
        gOne = new JTextField("");
        s.add(gOne);
        s.add(new JLabel("Enter your First Semester Grade Weight: "));
        wOne = new JTextField(""); 
        s.add(wOne);
        s.add(new JLabel("Enter your Second Semester Grade: "));
        gTwo = new JTextField("");
        s.add(gTwo);
        s.add(new JLabel("Enter your Second Semester Grade Weight: "));
        wTwo = new JTextField("");
        s.add(wTwo);
        s.add(new JLabel("Enter your Target percentage: "));
        goal = new JTextField("");
        s.add(goal);
        JButton done = new JButton("Ready to Fail Miserably?");
        s.add(done);
        done.addActionListener(listener);
        //System.out.println("Call FInla is called atleast!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        s.setTitle("Final Grade Calculater Offline");
        s.setSize(650, 300);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setVisible(true);
        
    }
    public static void NoSnowDay(){
        s = new sidProjs();
        s.setLayout(new FlowLayout());
        Random rand = new Random();
        int  n = rand.nextInt(40) + 60;
        String ans = "HAHAHA! There is a " + n + "% chance of a snowday today!!!.......";
        s.add(new JLabel(ans));
        JButton lie = new JButton("ALRIGHT!!....(ignoranceisbliss)");
        JButton truth = new JButton("I can face the truth!!...(noyoucant)");
        lie.addActionListener(listener);
        truth.addActionListener(listener);
        s.add(lie);
        s.add(truth);
        
        s.setTitle("Snow Day Percent Predictor");
        s.setSize(400, 200);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setVisible(true);
    }
    public static void Jimotivation(){
        
    }
    public static void lifeAdvice(){
        
    }
    static class ListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s.setVisible(false);
            if(e.getActionCommand() == "Ready to Fail Miserably?"){
                g.setGrades(Double.parseDouble(gOne.getText()),Double.parseDouble(gTwo.getText()));
                g.setWeights(Double.parseDouble(wOne.getText()),Double.parseDouble(wTwo.getText()));
                g.setGoal(Double.parseDouble(goal.getText()));
                g.calculateFinal();
                String ans = "The Final grade you need to get is " + g.getFinalGrade() + "?";
                JOptionPane.showMessageDialog(s, ans);
                System.exit(0);
            }
            if(e.getActionCommand() == "ALRIGHT!!....(ignoranceisbliss)"){
                JOptionPane.showMessageDialog(s, "Great!");
                System.exit(0);
            }
            if(e.getActionCommand() == "I can face the truth!!...(noyoucant)"){
                JOptionPane.showMessageDialog(s, ".");
                JOptionPane.showMessageDialog(s, "..");
                JOptionPane.showMessageDialog(s, "...");
                int input = JOptionPane.showConfirmDialog(null, "Are you Absolutely Sure??");
                if(input == 0){
                    JOptionPane.showMessageDialog(s, "(a backstage sigh, four of them actually)");
                    JOptionPane.showMessageDialog(s, "0%");
                    System.exit(0);
                }
                if(input == 1){
                    JOptionPane.showMessageDialog(s, "Great!");
                    System.exit(0);
                }
                if(input == 2){
                    System.exit(0);
                }
            }
        }
    }
}
*/

public class sidProjs{
	Stage window;
	private static Grades g=new Grades();
	public static Scene FinalData,FinalAnswer,NoSnowDay;

	public static void display(boolean first) {
		Stage window = new Stage();
		
		//{ all the stuff between the two braces is for FinalGrade calculater.
		Label q1 = new Label("Enter your first Quarter Grade: ");
		Label w1 = new Label("Enter your First Quarter Grade Weight: ");
		Label q2 = new Label("Enter your Second Quarter Grade: ");
		Label w2 = new Label("Enter your Second Quarter Grade Weight: ");
		Label target = new Label("Enter your Target Percentage: ");
		
		TextField qt1 = new TextField();
		TextField qw1 = new TextField();
		TextField qt2 = new TextField();
		TextField qw2 = new TextField();
		TextField tTarget = new TextField();
		Button fail = new Button("Ready to Fail Miserably?");
		fail.setOnAction(e -> {
			g.setGrades(Double.parseDouble(qt1.getText()),Double.parseDouble(qt2.getText()));
            g.setWeights(Double.parseDouble(qw1.getText()),Double.parseDouble(qw2.getText()));
            g.setGoal(Double.parseDouble(tTarget.getText()));
            g.calculateFinal();
            String ans = "The Final grade you need to get is " + g.getFinalGrade() + "?";
            window.setScene(new Scene(new Label(ans)));
			
		});
		
		GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(12);
        
        GridPane.setConstraints(q1, 0, 0);
        GridPane.setConstraints(qt1, 1,0);
        GridPane.setConstraints(w1, 0,1);
        GridPane.setConstraints(qw1, 1, 1);
        GridPane.setConstraints(q2, 0, 2);
        GridPane.setConstraints(qt2,1, 2);
        GridPane.setConstraints(w2, 0, 3);
        GridPane.setConstraints(qw2, 1, 3);
        GridPane.setConstraints(target, 0, 4);
        GridPane.setConstraints(tTarget, 1, 4);
        GridPane.setConstraints(fail, 0, 5);
		
        grid.getChildren().addAll(q1,qt1,w1,qw1,q2,qt2,w2,qw2,target,tTarget,fail);
        FinalData = new Scene(grid,500,250);
        
		//FinalData}
        
		
		if(first) {
			window.setScene(FinalData);
			window.setTitle("Final Grade Calculater - Offline");
		}
		
		else {
			window.setTitle("Snow Day Percent Calculater!!!");
			window.setScene(NoSnowDay);
		}
		
		window.show();
	}
}