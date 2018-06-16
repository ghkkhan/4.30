import java.awt.Graphics;
import java.awt.image.*;
import java.awt.Image;
import java.lang.Object;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Write a description of class imageDisplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImageDisplayer extends JFrame
{
    JPanel p = new JPanel();
    JLabel l;
    
    ImageIcon imageIcon;
    Image image;
    Image newImage;
    
    public ImageDisplayer(String pathName, String titleName, int screenWidth, int screenHeight)
    {
        super(titleName);
        try
        {
            imageIcon = new ImageIcon(pathName);
            image = imageIcon.getImage();
            newImage = image.getScaledInstance(screenHeight,screenWidth,java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newImage);
            l = new JLabel();
            l.setIcon(imageIcon);
            p.add(l);
            add(p);
            setSize((int)(screenHeight*1.1),(int)(screenWidth * 1.1));
            setResizable(true);
            setVisible(true);
        }
        catch(NullPointerException e)
        {
            System.out.println("image file not found: "+pathName + e);
        }
    }
}