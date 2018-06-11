import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;;

public class getPrem{
	//Static variables and nodes and such
	
	public static Stage window;
	private static Scene getNum, getTitle, getAuth, getDate, getPartner;
	
	private static String l0 = "Enter the number of parts this lab would have (no more than 7)";
	private static String l1 = "Enter a title for this Lab";
	private static String l2 = "Enter the name of the Author of this Lab Report";
	private static String l3 = "Enter the date on which this lab took place";
	private static String l4 = "Enter the name of the Lab Partner";
	private static TextField tField = new TextField();
	
	private static Button okB0 = new Button("OK!");
	private static Button okB1 = new Button("OK!");
	private static Button okB2 = new Button("OK!");
	private static Button okB3 = new Button("OK!");
	private static Button okB4 = new Button("OK!");
	private static Label text = new Label(l0);

	private static GridPane bird0 = new GridPane();
	private static GridPane bird1 = new GridPane();
	private static GridPane bird2 = new GridPane();
	private static GridPane bird3 = new GridPane();
	private static GridPane bird4 = new GridPane();
	
	
		public getPrem() {
		//Empty constructor
	}
	public static void getNume(Stage primaryStage) {
		bird0.setPadding(new Insets(10,10,10,10));
		bird1.setPadding(new Insets(10,10,10,10));
		bird2.setPadding(new Insets(10,10,10,10));
		bird3.setPadding(new Insets(10,10,10,10));
		bird4.setPadding(new Insets(10,10,10,10));
		
		int hGap = 10;
		int vGap = 10;
		bird0.setHgap(hGap);
		bird0.setVgap(vGap);
		bird1.setHgap(hGap);
		bird1.setVgap(vGap);
		bird2.setHgap(hGap);
		bird2.setVgap(vGap);
		bird3.setHgap(hGap);
		bird3.setVgap(vGap);
		bird4.setHgap(hGap);
		bird4.setVgap(vGap);

		
		window = primaryStage;
		tField.setPrefWidth(70);

		//Basic Layout
		
	    
	    bird0.setConstraints(text, 0, 0,3,1);
		bird0.setConstraints(tField,0,1);
		bird0.setConstraints(okB0,1,1); 
		bird0.getChildren().addAll(text,tField,okB0);
		
		getNum = new Scene(bird0,500, 90);
		window.setScene(getNum);
		window.setTitle("Preleminary Data Gatheration!");
		window.show();
		
		okB0.setOnAction(e ->{
			try {
				Phcs.subNum =Integer.parseInt(tField.getText());
				getTile(window);
				tField.setText("");
			}
			catch(Exception a){
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Incorrect Input");
				alert.setHeaderText(null);
				alert.setContentText("Error: What you have entered is not strictly a number. Check again!");
				alert.showAndWait();
			}
		});
	}
	public static void getTile(Stage window) {
		tField.setPrefWidth(300);
		text.setText(l1);
		
		bird1.setConstraints(text, 0, 0,3,1);
		bird1.setConstraints(tField,0,1);
		bird1.setConstraints(okB1,1,1); 
		bird1.getChildren().addAll(text,tField,okB1);
		
		getTitle = new Scene(bird1,600,100);
		window.setScene(getTitle);
		window.show();
		
		okB1.setOnAction(e -> {
			Phcs.title = tField.getText();
			getAuthor(window);
			tField.setText("");
		});
	}
	public static void getAuthor(Stage window) {
		text.setText(l2);
		
		bird2.setConstraints(text, 0, 0,3,1);
		bird2.setConstraints(tField,0,1);
		bird2.setConstraints(okB2,1,1); 
		
		bird2.getChildren().addAll(text,tField,okB2);
		getAuth = new Scene(bird2,600,100);
		window.setScene(getAuth);
		window.show();
		okB2.setOnAction(e ->{
			Phcs.Author =tField.getText();
			tField.setText("");
			getDate(window);
		});
	}

	public static void getDate(Stage window) {
		text.setText(l3);
		
		bird3.setConstraints(text, 0, 0,3,1);
		bird3.setConstraints(tField,0,1);
		bird3.setConstraints(okB3,1,1);
		
		bird3.getChildren().addAll(text,tField,okB3);
		getDate = new Scene(bird3,600,100);
		window.setScene(getDate);
		window.show();
		okB3.setOnAction(e ->{
			Phcs.Date =tField.getText();
			tField.setText("");
			getPartner(window);
		});
	}
	public static void getPartner(Stage window) {
		text.setText(l4);
		
		bird4.setConstraints(text, 0, 0,3,1);
		bird4.setConstraints(tField,0,1);
		bird4.setConstraints(okB4,1,1); 
		
		bird4.getChildren().addAll(text,tField,okB4);
		getPartner = new Scene(bird4,600,100);
		window.setScene(getPartner);
		window.show();
		okB4.setOnAction(e ->{
			Phcs.LabPartner =tField.getText();
			tField.setText("");
			Phcs.OperationMakePhysicsLab(window);
		});
	}
}