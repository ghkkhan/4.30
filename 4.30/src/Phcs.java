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

/*
public class Phcs extends JFrame{
    
    public static Phcs Pframe;
    public static DataBank[] parts = new DataBank[10];
    private static int subNum;
    private static String[] partName = new String[10];
    private static int cPart;
    private static JComboBox jBox;
    
    private static String title;
    private static String Author;
    private static String Date;
    private static String LabPartner;
    public static JCheckBox check;
    public static JButton next;
    public static sidProjs s;
    public static ListenerClass listener;
    public static JPanel pan;
    
    //private static;
    public Phcs() {
        listener = new ListenerClass();
        pan = new JPanel();
        pan.setLayout(new GridLayout(7,2,5,5));
        jBox = new JComboBox(partName);
        pan.add(new JLabel("Choose the part of the lab: Part " + (cPart+1)));
        pan.add(jBox);
        
        JButton go = new JButton("Go");
        pan.add(new JLabel("Go through each of the sections"));
        pan.add(go);
        go.addActionListener(listener);
        
        JButton intro = new JButton("Introduction");
        pan.add(intro);
        intro.addActionListener(listener);
        
        JButton hypo = new JButton("Hypothesis");
        pan.add(hypo);
        hypo.addActionListener(listener);
        
        JButton equip = new JButton("Equipment");
        pan.add(equip);
        equip.addActionListener(listener);
        
        JButton pros = new JButton("Procedure");
        pan.add(pros);
        pros.addActionListener(listener);
        
        JButton meth = new JButton("Math Analysis");
        pan.add(meth);
        meth.addActionListener(listener);
        
        JButton Ercal = new JButton("Error Calculations");
        pan.add(Ercal);
        Ercal.addActionListener(listener);
        
        pan.add(new JLabel(""));
        
        JButton Conc = new JButton("Done? Click to finish the Report!");
        pan.add(Conc);
        Conc.addActionListener(listener);
        add(pan);
    }
    public static void OperationMakePhysicsLab(){
        
        String temp= JOptionPane.showInputDialog("Enter here the number of parts this lab has\n(only 1 through 10, because we know you don't need that many):");
        subNum = Integer.parseInt(temp);
        title = JOptionPane.showInputDialog("Enter a Name for this lab:");
        Author = JOptionPane.showInputDialog("Enter the name of the Author of this lab report:");
        Date = JOptionPane.showInputDialog("Enter the date at which this Lab took place:");
        LabPartner = JOptionPane.showInputDialog("Enter the name of the lab partner:");

        for(int i =0; i<subNum; i++){
            parts[i] = new DataBank();
            partName[i] = "part "+ (i+1);
            //System.out.println("fefef");
        }
        Pframe = new Phcs();
        Pframe.setTitle("Physics Perfect Lab Maker. v4.30");
        Pframe.setSize(800, 250);
        Pframe.setLocationRelativeTo(null);
        Pframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pframe.setVisible(true);
    }
    class ListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand() == "Introduction"){
                Pframe.setVisible(false);
                introFrame.writeIntro(parts, subNum, cPart, Pframe);
            }
            if(e.getActionCommand() == "Hypothesis"){
                Pframe.setVisible(false);
                HypoFrame.writeHypo(parts, subNum, cPart, Pframe);
            }
            if(e.getActionCommand() == "Procedure"){
                Pframe.setVisible(false);
                ProcFrame.writeProcedure(parts, subNum, cPart, Pframe);
            }
            if(e.getActionCommand() == "Math Analysis"){
                Pframe.setVisible(false);
                MethFrame.makeMeth(parts, subNum, cPart, Pframe);
            }
            if(e.getActionCommand()== "Equipment"){
                Pframe.setVisible(false);
                EquipFrame.equipt(parts, subNum, cPart, Pframe);
            }
            
            if(e.getActionCommand() == "Error Analysis"){
                Pframe.setVisible(false);
                ErAnFrame.makeErrorAnalysis(parts, subNum, cPart, Pframe);
            }
            
            if(e.getActionCommand() == "Error Calculations"){
                Pframe.setVisible(false);
                ECalFrame.makeErrorCalculationFramePlease(parts, subNum, cPart, Pframe);
            }
            if(e.getActionCommand() == "Done? Click to finish the Report!"){
                Pframe.setVisible(false);
                s = new sidProjs();
                s.setLayout(new FlowLayout());
                check = new JCheckBox("Did the results support your Hypothesis?(No check means no.)",parts[cPart].getsupportHyp());
                s.add(check);
                next = new JButton("Let's go Hounds!");
                next.addActionListener(listener);
                s.add(next);
                s.setTitle("Physics Perfect Lab Maker. v4.30");
                s.setSize(800, 250);
                s.setLocationRelativeTo(null);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setVisible(true);
            }
            if(e.getActionCommand() == "Go"){
                cPart = jBox.getSelectedIndex();
                Pframe.setVisible(false);
                Pframe = new Phcs();
                Pframe.setTitle("Physics Perfect Lab Maker. v4.30");
                Pframe.setSize(800, 250);
                Pframe.setLocationRelativeTo(null);
                Pframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Pframe.setVisible(true);
            }
            if(e.getActionCommand() == "Let's go Hounds!"){
                s.setVisible(false);
                s.dispose();
                parts[cPart].setYIntError((check.isSelected()));
                check.setSelected(false);
                LabMaker tempLab=new LabMaker(parts, title, Author, Date, LabPartner,subNum);
                System.out.println(tempLab.getPrint());
                LabWriter.writeString(tempLab.getPrint());
                LabWriter.saveAndClose();
            }
        }
    }
    public static int getCPart(){
        return cPart;
    }
}
*/

public class Phcs {
	//Variables and such
	
	public static DataBank[] parts = new DataBank[10];
    public static int subNum;
    private static String[] partName = new String[10];
    public static int cPart;
    
    public static String title;
    public static String Author;
    public static String Date;
    public static String LabPartner;
    private static GridPane grid;
    
    //below are the components of the Frame, buttons and combobox;
    private static Scene main;
    private static Button intro,equip,meth,hyp,proc,err, done;
    private static ComboBox<String> chosePart = new ComboBox<>();
    private static Label l1 = new Label("Chose the Part of the Lab ---->");
    private static Label l2 = new Label("Go through each section and Fill in your Data");
    
    public static Stage window;
	public static void OperationMakePhysicsLab(Stage primaryStage){
		
		window = primaryStage;
		
		window.hide();
		for(int i = 1; i<=subNum;i++){
			chosePart.getItems().add("Part " + i );
		}
		chosePart.setValue("Part 1");
		grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(12);
        
        intro = new Button("Introduction");
        equip = new Button("Equiptment");	
        meth = new Button("Math Analysis");
        hyp = new Button("Hypothesis");
        proc = new Button("Procedure");
        err = new Button("Error Calculations");
        done = new Button("Done?");
        
        int size = 200;
        
        chosePart.setMinWidth(size);
        l2.setMinWidth(400);
        intro.setMinWidth(size);
        equip.setMinWidth(size);
        meth.setMinWidth(size);
        hyp.setMinWidth(size);
        proc.setMinWidth(size);
        err.setMinWidth(size);
        done.setMinWidth(size);
        
               
        GridPane.setConstraints(l1, 0, 0);
        GridPane.setConstraints(chosePart, 1, 0);
        GridPane.setConstraints(l2, 0, 1, 2,1);
        GridPane.setConstraints(intro, 0, 2);
        GridPane.setConstraints(hyp, 1, 2);
        GridPane.setConstraints(equip, 0, 3);
        GridPane.setConstraints(proc, 1, 3);
        GridPane.setConstraints(meth, 0, 4);
        GridPane.setConstraints(err, 1, 4);
        GridPane.setConstraints(done, 0, 5);
        
        grid.getChildren().addAll(l1,chosePart,l2,intro,hyp,equip,proc,meth,err,done);
        main = new Scene(grid,450, 250);
        window.setScene(main);
        window.show();
		
	}
}



