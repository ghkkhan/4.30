import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EquipFrame {
	
    public static DataBank[] parts;
    public static int cPart;
    public static int numLab;
    public static Button done;
    
    public static TextField equipment;
    public static Label l1;
    public static Label l3;
	
	public EquipFrame() {
		//empty constructor
	}
			
	public static void equipt(DataBank[] s, int numberoflabs, int currentpart){
        parts = s;
        cPart = currentpart;
        numLab = numberoflabs;
        
        equipment = new TextField(parts[cPart].getEquipment());
        
        l1 = new Label("Enter the values mentioned to the right of this Text!");
        l3 = new Label("Write a list of the equipments used. Seperate, by, comma.");
        done = new Button("Done!");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(12);
        int size = 400;
        grid.setConstraints(l1, 0, 0);
        grid.setConstraints(l3, 1,0);
        grid.setConstraints(equipment, 0, 1,2,1);
        grid.setConstraints(done,0,2);
        
        grid.getChildren().addAll(l1,l3,equipment,done);
        l1.setMinWidth(size);
        l3.setMinWidth(size);
        equipment.setMinWidth(size*2);
        
        Stage window = new Stage();
        Scene cene = new Scene(grid,900,125);
        window.setScene(cene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Loading Equipments");
        window.show();
        
        done.setOnAction(e -> {
        	window.hide();
            parts[cPart].setEquipment(equipment.getText());
            equipment.setText("");
        });
	}
}