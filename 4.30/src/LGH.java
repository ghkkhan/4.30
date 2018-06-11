import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LGH {
	
    public static DataBank[] parts;
    public static int cPart;
    public static int numLab;
    
    
    public static CheckBox goForth;
    public static Button oHYes;
    public static Button oHNo;
	
	public LGH() {
		//empty constructor
	}
			
	public static void letsGoHounds(DataBank[] s, int numberoflabs, int currentpart){
        parts = s;
        cPart = currentpart;
        numLab = numberoflabs;
        
        goForth = new CheckBox("Did the results of your lab support your Hypotheses?? (No Checks means a \"no\"!)");
        goForth.setSelected(false);
        oHYes = new Button("Let's Go Hounds!");
        oHNo = new Button("OH! NO, go back; I'm not Done!");
        
        VBox grid = new VBox(10);
        grid.getChildren().addAll(goForth, oHYes, oHNo);
        grid.setPadding(new Insets(10,10,10,10));
        
        Stage window = new Stage();
        Scene cene = new Scene(grid,600,130);
        window.setScene(cene);
        window.initModality(Modality.APPLICATION_MODAL);
        
        window.setTitle("The Final Window; The point of no return!");
        window.show();
        
        oHYes.setOnAction(e -> {
        	window.hide();
        	Phcs.window.hide();
        	parts[cPart].setYIntError(goForth.isSelected());
            goForth.setSelected(false);
            Phcs.goForIt();
        });
        oHNo.setOnAction(e -> {
        	window.hide();
        });
	}
}