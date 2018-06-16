import javax.swing.*;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import java.util.Random;


public class sidProjs{
	Stage window;
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
        GridPane greatFrame = new GridPane();
        Label gret = new Label("Great!");
        gret.setFont(new Font("Arial", 50));
        Button ok = new Button("OK!");
        greatFrame.setConstraints(gret, 1, 0,3,1);
        greatFrame.setConstraints(ok, 2, 1);
        greatFrame.getColumnConstraints().add(new ColumnConstraints(110));
        greatFrame.getColumnConstraints().add(new ColumnConstraints(50));
        ok.setOnAction(e -> {
	    	window.hide();
	      	System.exit(0);
	    });
        greatFrame.getChildren().addAll(gret, ok);
        great = new Scene(greatFrame,350,95);
                
        lie.setOnAction(e -> {
        	window.setTitle("GREAT!!!");
        	window.setResizable(false);
        	window.setScene(great);
        });
        
        
        truth.setOnAction(e -> {
        	window.hide();
        	JFrame s = new JFrame();
        	
        	Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Snowday Calculater... ERROR");
			alert.setHeaderText("WARNING!");
			alert.setContentText(".");
			alert.showAndWait();
			
			alert.setContentText("..");
			alert.showAndWait();
			
			alert.setContentText("...");
			alert.showAndWait();
			
			alert = new Alert(AlertType.CONFIRMATION);
			alert.setContentText("Are you Absolutely Sure??");
			alert.setHeaderText("Confirmation Window 2.3.1");
			alert.showAndWait().ifPresent(response ->{
				if(response == ButtonType.OK) {
					whatever();
				}
				else {
					window.setScene(great);
					window.show();
				}
			});
        });
        
        //NoSnowDay}
		
		if(first) {
			window.setScene(FinalData);
			window.setResizable(false);
			window.setTitle("Final Grade Calculater - Offline");
		}
		else {
			window.setTitle("Snow Day Percent Calculater!!!");
			window.setResizable(false);
			window.setScene(NoSnowDay);
		}
		window.show();
	}
	public static void whatever() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERRORERRORERRORERRORERRORERRORERRORERROR");
		alert.setHeaderText("WARNING!WARNING!WARNING!WARNING!WARNING!");
		alert.setContentText("Seriusly????... huh...");
		alert.showAndWait();
		alert.setTitle("");
		alert.setHeaderText("");
		alert.setContentText("");
		alert.showAndWait();
		alert.setContentText("0%");
		alert.showAndWait();
		System.exit(0);
	}
}