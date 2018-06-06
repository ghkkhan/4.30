import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
/*
 *  use: LabWriter.writeString("the text that you want written");
 *  on next line put: LabWriter.saveAndClose();
 */

public class LabWriter  
{
    private static final String DATA_FILE = "labOutput.txt"; //name of file that is outputed

    private static Scanner in;
    private static BufferedWriter out;

    /**
     * Opens a file to be used for input (if not already open),
     * reads a line from the file, and returns the entire line of data.
     * 
     * @return a line of text from the input file
     */
    public static String readString() {
        if (in == null) {
            try {
                in = new Scanner(new File(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot open file for input!");
                e.printStackTrace();
            }
        }
        try {
            if (in.hasNext()) {
                String s = in.nextLine();
                return s;
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            System.err.println("Cannot read  file!");
            e.printStackTrace();
        }
        return null;

    }

    /**
     * Oens a file to be used for output (if not already open),
     * writes a string to the file and wrties a newline.
     * 
     * @param s The string text to be written. Follwing the string, a newline is added to the file.
     */

    public static void writeString(String s) {
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot create file for output!");
                e.printStackTrace();
            }
        }

        try {
            for(int i = 0; i < s.length(); i++)
            {
                String output = s.substring(i,i+1);
                if(output.equals("^"))
                {
                    out.newLine();
                }
                else
                {
                    out.write(output);
                }
            }
        }
        catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }

    }

    /**
     * Saves and closes the file (when opened for either input or output). 
     * 
     * Note: If the program terminates before the file is closed,
     * no data will be saved or written to the file.
     */
    public static void saveAndClose() {
        if (in != null) {
            try {
                in.close();
                in = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }      
        if (out != null) {
            try {
                out.close();
                out = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
}
