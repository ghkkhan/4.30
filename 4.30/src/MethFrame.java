import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MethFrame {
	
    public static DataBank[] parts;
    public static int cPart;
    public static int numLab;
    public static Button done;
    
    public static TextField slopeField;
    public static TextField yIntField;
    public static TextField yUnitField;
    public static TextField xUnitField;
    public static TextField yShortField;
    public static TextField xShortField;
    public static TextField yLongField;
    public static TextField xLongField;
    
    public static Label l1;
    public static Label l2;
    public static Label l3;
    public static Label l4;
    public static Label l5;
    public static Label l6;
    public static Label l7;
    public static Label l8;
    public static Label l9;
    public static Label l10;

    
	public MethFrame() {
		//empty constructor
	}
			
	public static void makeMeth(DataBank[] s, int numberoflabs, int currentpart){
        parts = s;
        cPart = currentpart;
        numLab = numberoflabs;
        
        slopeField = new TextField("" + parts[cPart].getSlope());
        yIntField = new TextField("" + parts[cPart].getYint());
        yUnitField = new TextField( parts[cPart].getyUnit());
        xUnitField = new TextField(parts[cPart].getxUnit());
        yLongField = new TextField(parts[cPart].getyLong());
        xLongField = new TextField(parts[cPart].getxLong());
        yShortField = new TextField(parts[cPart].getyShort());
        xShortField = new TextField( parts[cPart].getxShort());
        
        
        l1 = new Label("Enter the values mentioned to the right of this Text!");
        l2 = new Label("Make sure not to type words where numbers ought to be. Vice versa");
        l3 = new Label("Enter the slope of the graph");
        l4 = new Label("Enter the Y-intercept of the graph");
        l5 = new Label("Enter the units on the Y-Axis:");
        l6 = new Label("Enter the units on the X-Axis:");
        l7 = new Label("Enter the full name of the Y-Axis:");
        l8 = new Label("Enter the full name of the x-Axis:");
        l9 = new Label("Enter the short name(usually one lettered) of the Y-Axis:");
        l10 = new Label("Enter the short name(usually one lettered) of the X-Axis:");
        
        done = new Button("Done!");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(12);
        int size = 400;
        grid.setConstraints(l1, 0, 0);
        grid.setConstraints(l2, 1,0);
        grid.setConstraints(l3, 0,1);
        grid.setConstraints(slopeField, 1, 1);
        grid.setConstraints(l4, 0,2);
        grid.setConstraints(yIntField, 1, 2);
        grid.setConstraints(l5, 0,3);
        grid.setConstraints(yUnitField, 1, 3);
        grid.setConstraints(l6, 0,4);
        grid.setConstraints(xUnitField, 1, 4);
        grid.setConstraints(l7, 0,5);
        grid.setConstraints(yLongField, 1, 5);
        grid.setConstraints(l8, 0,6);
        grid.setConstraints(xLongField, 1, 6);
        grid.setConstraints(l9, 0,7);
        grid.setConstraints(yShortField, 1, 7);
        grid.setConstraints(l10, 0,8);
        grid.setConstraints(xShortField, 1, 8);
        grid.setConstraints(done,0,9);
        
        
        
        l1.setMinWidth(size);
        l2.setMinWidth(size);
        l3.setMinWidth(size);
        l4.setMinWidth(size);
        l5.setMinWidth(size);
        l6.setMinWidth(size);
        l7.setMinWidth(size);
        l8.setMinWidth(size);
        l9.setMinWidth(size);
        l10.setMinWidth(size);
        
        slopeField.setMinWidth(size);
        yIntField.setMinWidth(size);
        yUnitField.setMinWidth(size);
        xUnitField.setMinWidth(size);
        yLongField.setMinWidth(size);
        xLongField.setMinWidth(size);
        yShortField.setMinWidth(size);
        xShortField.setMinWidth(size);
        
        grid.getChildren().addAll(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,slopeField,yIntField,yUnitField,xUnitField,yLongField,xLongField,yShortField,xShortField, done);

        Stage window = new Stage();
        Scene cene = new Scene(grid,900,410);
        window.setScene(cene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Meth is bad, kids; Math is good, tho!");
        window.show();
        
        done.setOnAction(e -> {
        	window.hide();
        	parts[cPart].setSlope(Double.parseDouble(slopeField.getText()));
            slopeField.setText("");
            parts[cPart].setYint(Double.parseDouble(yIntField.getText()));
            yIntField.setText("");
            parts[cPart].setyUnit(yUnitField.getText());
            yUnitField.setText("");
            parts[cPart].setxUnit(xUnitField.getText());
            xUnitField.setText("");
            parts[cPart].setyShort(yShortField.getText());
            yShortField.setText("");
            parts[cPart].setxShort(xShortField.getText());
            xShortField.setText("");
            parts[cPart].setxLong(xLongField.getText());
            xLongField.setText("");
            parts[cPart].setyLong(yLongField.getText());
            yLongField.setText("");
        });
	}
}