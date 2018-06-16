import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class mainGUI extends Application{
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button buttonE;
    String[] args;
    
    Stage window = new Stage();
    
    public static void boot(String[] args){
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception{
    	
        window = primaryStage;
    	window.setTitle("4.30");
        button1 = new Button("Make Me My Physics Lab");
        button1.setOnAction(e -> {
        	getPrem.getNume(window);
        });
        
        button2 = new Button("Final grade Calculater");
        button2.setOnAction(e -> {
        	sidProjs.display(true);
        	//window.hide();

        });
        
        button3 = new Button("Snowday Percent Calculater");
        button3.setOnAction(e -> {
        	sidProjs.display(false);
        	//window.hide();

        });
        
        button4 = new Button("Social Simulater");
        button4.setOnAction(e -> {
        	window.hide();
        	//RealChatter r = new RealChatter();
        });
        
        button5 = new Button("Credits");
        button5.setOnAction(e -> {
        	window.hide();
        	Creds.rollCreds();
        });
        
        buttonE = new Button("EXIT!!!");
        buttonE.setOnAction(e -> {
        	System.exit(0);
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
        
        Scene scene = new Scene(grid,600,90);	
        scene.getStylesheets().add("Viper.css");
        window.setScene(scene);
        window.show();
        window.setResizable(false);
    }
}