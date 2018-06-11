import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ProcFrame {
	
    public static DataBank[] parts;
    public static int cPart;
    public static int numLab;
    public static Button done;
    
    public static TextArea procField;
    public static Label l1;
    public static Label l3;
	
	public ProcFrame() {
		//empty constructor
	}
			
	public static void writeProcedure(DataBank[] s, int numberoflabs, int currentpart){
        parts = s;
        cPart = currentpart;
        numLab = numberoflabs;
        
        procField = new TextArea(parts[cPart].getProcedure());
        l1 = new Label("Enter the values mentioned to the right of this Text!");
        l3 = new Label("Type out the Whole procedure for this part.");
        done = new Button("Done!");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(12);
        int size = 400;
        
        grid.setConstraints(l1, 0, 0);
        grid.setConstraints(l3, 1,0);
        grid.setConstraints(procField, 0, 1,2,1);
        grid.setConstraints(done,0,2);
        grid.getChildren().addAll(l1,l3,procField,done);
        
        l1.setMinWidth(size);
        l3.setMinWidth(size);
        procField.setMinWidth(size*2);
        procField.setMaxHeight(200);
        Stage window = new Stage();
        Scene cene = new Scene(grid,840,220);
        window.setScene(cene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Procedure: Hope you didn't expect us to Write this for you!");
        window.show();
        
        done.setOnAction(e -> {
        	window.hide();
            parts[cPart].setProcedure(procField.getText());
            procField.setText("");
        });
	}
}