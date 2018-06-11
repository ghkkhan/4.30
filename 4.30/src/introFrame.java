
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class introFrame{
		
	public static DataBank[] parts;;
	public static int cPart;
	public static int numLab;
	public static TextField indVar;
	public static TextField depVar;
	public static TextField explainSent ;
	public static Label l1;
	public static Label l2;
	public static Label l3;
	public static Label l4;
	public static Button done;

	public introFrame(){
	}
	public static void writeIntro(DataBank[] s, int numberoflabs, int currentpart){
		//just some variable assignations
		
		parts = s;
		cPart = currentpart;
		numLab = numberoflabs;
		
		indVar = new TextField(parts[cPart].getiVariable());
        depVar = new TextField(parts[cPart].getdVariable());
        explainSent = new TextField(parts[cPart].getExplan());
        
        l1 = new Label("Enter the values mentioned beside the Textfields!");
        l2 = new Label("Enter the Independent Variable:");
        l3 = new Label("Enter the Dependent Variable:");
        l4 = new Label("Enter the Description Sentence:");
        done = new Button("Done!");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(12);
        int size = 400;
        grid.setConstraints(l1, 0, 0,2,1);
        grid.setConstraints(l2, 0, 1);
        grid.setConstraints(indVar, 1, 1);
        grid.setConstraints(l3, 0, 2);
        grid.setConstraints(depVar, 1, 2);
        grid.setConstraints(l4, 0, 3);
        grid.setConstraints(explainSent, 1, 3);
        grid.setConstraints(done, 0, 4);
        grid.getChildren().setAll(l1,l2,l3,l4,indVar,depVar,explainSent,done);
        indVar.setMinWidth(size);
        depVar.setMinWidth(size);
        explainSent.setMinWidth(size);
        
        Scene intro = new Scene(grid,650, 205);
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setScene(intro);
        window.setTitle("Introduction Sequencing");
        window.show();
        
        //done button click
        done.setOnAction(e ->{
        	
        	window.hide();
            parts[cPart].setiVariable((indVar.getText()));
            indVar.setText("");
            parts[cPart].setdVariable((depVar.getText()));
            depVar.setText("");
            parts[cPart].setExplan((explainSent.getText()));
            explainSent.setText("");
        });
	}
}