import javax.swing.*;

import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.*;
/*
public class introFrame extends JFrame{
	
    public static introFrame introframe;
    public static DataBank[] parts;
    public static int cPart;
    public static int numLab;
    public static JTextField indVar;
    public static JTextField depVar;
    public static JTextField explainSent;
    
    public introFrame(){
        indVar = new JTextField(parts[cPart].getiVariable());
        depVar = new JTextField(parts[cPart].getdVariable());
        explainSent= new JTextField(parts[cPart].getExplan());
        
        setLayout(new GridLayout(5,2,5,5));
        ListenerClass listener = new ListenerClass();
        add(new JLabel("Enter the values mentioned beside the text bars"));
        add(new JLabel("Make sure not to type words where numbers ought to be. Vice versa"));
        add(new JLabel("Enter the Independent Variable:"));
        add(indVar);
        add(new JLabel("Enter the Dependent Variable:"));
        add(depVar);
        add(new JLabel("Enter the description sentence:"));
        add(explainSent);
        JButton done = new JButton("Done?");
        add(done);
        done.addActionListener(listener);
    }
    public static void writeIntro(DataBank[] s, int numberoflabs, int currentpart){
        parts = s;
        cPart = currentpart;
        numLab = numberoflabs;
        
        introframe = new introFrame();
        introframe.setTitle("Physics Perfect Lab Maker. v4.30");
        introframe.setSize(1000, 300);
        introframe.setLocationRelativeTo(null);
        introframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        introframe.setVisible(true);
    }
    class ListenerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand() == "Done?"){
                introframe.setVisible(false);
                
                parts[cPart].setiVariable((indVar.getText()));
                indVar.setText("");
                parts[cPart].setdVariable((depVar.getText()));
                depVar.setText("");
                parts[cPart].setExplan((explainSent.getText()));
                explainSent.setText("");
                
            }
        }
    }
}
*/
public class introFrame extends JFrame{
		
	public static DataBank[] parts;
	public static int cPart;
	public static int numLab;
		
	public introFrame(){
	}
	public static void writeIntro(DataBank[] s, int numberoflabs, int currentpart){
	
		parts = s;
		cPart = currentpart;
		numLab = numberoflabs;
	
	}
}