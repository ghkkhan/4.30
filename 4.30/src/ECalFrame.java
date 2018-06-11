import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ECalFrame {
	
    public static DataBank[] parts;
    public static int cPart;
    public static int numLab;
    public static Button done;
    
    public static TextField accSlopeSig;
    public static TextField accSlopeValue;
    public static TextField accYintSig;
    public static TextField accYintValue;
    
    public static CheckBox slopeError;
    public static CheckBox yIntError;
    
    public static Label l1;
    public static Label l2;
    public static Label l3;
    public static Label l4;
    public static Label l5;
    public static Label l6;
    
	public ECalFrame() {
		//empty constructor
	}
			
	public static void makeErrorCalculationFramePlease(DataBank[] s, int numberoflabs, int currentpart){
        parts = s;
        cPart = currentpart;
        numLab = numberoflabs;

        slopeError = new CheckBox("Do You want error calcs for the Slope?");
        slopeError.setSelected(parts[cPart].getSlopeError());
        yIntError = new CheckBox("Do you want error calcs for the Y-Intercept");
        yIntError.setSelected(parts[cPart].getYIntError());
        
        l1 = new Label("Enter the values mentioned beside the text bars.\nLeave the bar empty if its not necessary!");
        l2 = new Label("Make sure not to type words where numbers ought to be. Vice versa!");
        l3 = new Label("Enter the Significance of the Slope:");
        l4 = new Label("Enter the Accpeted Slope Value:");
        l5 = new Label("Enter the Significance of the Y-Intercept:");
        l6 = new Label("Enter the Accpeted Y-Intercept Value:");
        
        accSlopeSig = new TextField(parts[cPart].getAccSlopeSig());
        accSlopeValue = new TextField("" + parts[cPart].getAccSlopeValue());
        accYintSig = new TextField(parts[cPart].getAccYintSig());
        accYintValue = new TextField("" + parts[cPart].getAccYintValue());
        
        done = new Button("Done!");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(12);
        int size = 400;
        grid.setConstraints(l1, 0, 0);
        grid.setConstraints(l2, 1,0);
        grid.setConstraints(slopeError, 0,1);
        grid.setConstraints(l3, 0, 2);
        grid.setConstraints(accSlopeSig, 1,2);
        grid.setConstraints(l4, 0,3);
        grid.setConstraints(accSlopeValue, 1,3);
        grid.setConstraints(yIntError, 0, 4);
        grid.setConstraints(l5, 0,5);
        grid.setConstraints(accYintSig, 1, 5);
        grid.setConstraints(l6, 0,6);
        grid.setConstraints(accYintValue, 1, 6);
        grid.setConstraints(done,0,7);
        
        l1.setMinWidth(size);
        l2.setMinWidth(size);
        l3.setMinWidth(size);
        l4.setMinWidth(size);
        l5.setMinWidth(size);
        l6.setMinWidth(size);
        l1.setWrapText(true);
        l2.setWrapText(true);
        
        grid.getChildren().addAll(l1,l2,l3,l4,l5,l6,slopeError,accSlopeSig,accSlopeValue,yIntError,accYintSig,accYintValue, done);

        Stage window = new Stage();
        Scene cene = new Scene(grid,900,330);
        window.setScene(cene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Errors: A Synonym of Life");
        window.show();
        
        done.setOnAction(e -> {
        	window.hide();
        	parts[cPart].setSlopeError((slopeError.isSelected()));
            slopeError.setSelected(false);
            parts[cPart].setYIntError((yIntError.isSelected()));
            yIntError.setSelected(false);
            parts[cPart].setAccSlopeSig((accSlopeSig.getText()));
            accSlopeSig.setText("");
            parts[cPart].setAccSlopeValue(Double.parseDouble(accSlopeValue.getText()));
            accSlopeValue.setText("");
            parts[cPart].setAccYintSig((accYintSig.getText()));
            accYintSig.setText("");
            parts[cPart].setAccYintValue(Double.parseDouble(accYintValue.getText()));
            accYintValue.setText("");
            //TONG WAS HERE
        });
	}
}