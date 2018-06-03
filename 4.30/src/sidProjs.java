import javax.swing.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.Random;


public class sidProjs{
	Stage window;
	private static boolean noBool = true;
	private static Grades g=new Grades();
	private static Scene FinalData,FinalAnswer,NoSnowDay, great;

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
            System.exit(0);
			
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
        
        
        //All the stuff between the two braces is for NoSnowDay {
        GridPane grid2 = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(12);
        
        Random rand = new Random();
        int  n = rand.nextInt(30) + 70;
        String ans = "HAHAHA! There is a " + n + "% chance of a snowday Tomorrow!!! HAHAHA!.......";
        Label s1 = new Label(ans);
        Label s2 = new Label("");
        Label s3 = new Label("");
        Label s4 = new Label("");
        Label s5 = new Label("");
        Label s6 = new Label("");
        Label s7 = new Label("");
        Button lie = new Button("ALRIGHT!!....(ignoranceisbliss)");
        Button truth = new Button("I can face the truth!!...(noyoucant)");
        
        GridPane.setConstraints(s1, 0, 0);
        GridPane.setConstraints(lie, 0, 1);
        GridPane.setConstraints(s2, 0, 2);
        GridPane.setConstraints(s3, 0, 3);
        GridPane.setConstraints(s4, 0, 4);
        GridPane.setConstraints(s5, 0, 5);
        GridPane.setConstraints(s6, 0, 6);
        GridPane.setConstraints(s7, 0, 7);
        GridPane.setConstraints(truth, 0, 8);
        grid2.getChildren().addAll(s1,lie,s2,s3,s4,s5,s6,s7, truth);
        NoSnowDay = new Scene(grid2,500,220);
        
        //great code
        VBox greatFrame = new VBox();
        Button ok = new Button("OK!");
	    ok.setOnAction(e -> {
	    	window.hide();
	      	System.exit(0);
	    });
        greatFrame.getChildren().addAll(new Label("Great!"), ok);
        great = new Scene(greatFrame,350,60);
                
        lie.setOnAction(e -> {
        	window.setTitle("GREAT!!!");
        	window.setScene(great);
        });
        
        
        truth.setOnAction(e -> {
        	window.hide();
        	JFrame s = new JFrame();
        	JOptionPane.showMessageDialog(s, ".");
            JOptionPane.showMessageDialog(s, "..");
            JOptionPane.showMessageDialog(s, "...");
            int input = JOptionPane.showConfirmDialog(null, "Are you Absolutely Sure??");
            if(input == 0){
                JOptionPane.showMessageDialog(s, "Seriusly????... huh...");
                JOptionPane.showMessageDialog(s, "0%");
                System.exit(0);
            }
            if(input == 1){
                window.setScene(great);
                window.show();
            }
            if(input == 2){
                System.exit(0);
            }
        });
        
        //NoSnowDay}
		
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