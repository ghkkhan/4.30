import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HypoFrame {
	
    public static DataBank[] parts;
    public static int cPart;
    public static int numLab;
    public static Button done;
    
    public static TextField relationShip;
    public static Label l1;
    public static Label l3;
	
	public HypoFrame() {
		//empty constructor
	}
			
	public static void writeHypo(DataBank[] s, int numberoflabs, int currentpart){
        parts = s;
        cPart = currentpart;
        numLab = numberoflabs;
        
        relationShip = new TextField(parts[cPart].getRelation());
        
        l1 = new Label("Enter the values mentioned on the right of this Text!");
        l3 = new Label("Enter Relationship betwixt DV and IV (\"Positive\" or \"Negative\"):");
        done = new Button("Done!");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(12);
        int size = 400;
        grid.setConstraints(l1, 0, 0);
        grid.setConstraints(l3, 0, 1);
        grid.setConstraints(relationShip, 0, 2);
        grid.setConstraints(done,0,3);
        
        grid.getChildren().addAll(l1,l3,relationShip,done);
        l1.setMinWidth(size);
        l3.setMinWidth(size);
        relationShip.setMinWidth(size);
        
        Stage window = new Stage();
        Scene cene = new Scene(grid,500,155);
        window.setScene(cene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Stage: Hypnothesis");
        window.show();
        
        done.setOnAction(e -> {
        	window.hide();
            parts[cPart].setRelation((relationShip.getText()));
            relationShip.setText("");
        });
	}
}