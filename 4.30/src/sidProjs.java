import javax.swing.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
	public static Scene FinalData,FinalAnswer,NoSnowDay;

	public static void display(boolean first) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		if(first) {
			window.setScene(FinalData);
			window.setTitle("Final Grade Calculater - Offline");
		}
		else {
			window.setTitle("Snow Day Percent Calculater!!!");
			window.setScene(NoSnowDay);
		}
		window.setMinWidth(250);
		window.show();
		
		
	}
}