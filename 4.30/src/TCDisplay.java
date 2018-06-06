import javax.swing.*;



import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Dialog;

public class TCDisplay {
	public static Stage window;

	
	public static void main(String[] args) {
		TCDisplay.display();
	}

	private static void display() {
		Button b = new Button("OK!");
		
		BorderPane bird = new BorderPane();
		bird.setCenter(b);
		bird.setBottom(b);
		window.setScene(new Scene(bird, 200, 300));
		window.show();
		
		b.setOnAction(e -> {
			
		});
	}
}