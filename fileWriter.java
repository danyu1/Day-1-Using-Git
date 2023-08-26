import java.io.PrintWriter;
import java.io.FileNotFoundException;

//file writer class uses PrintWriter to create a new text file with a given fileName that is passed into the method writeText
//writeText prints a given message onto a text file
//generate random string uses math.random to generate a unique filename for the new file that is going to created using printwriter
public class fileWriter {
    public static void main(String[] args) throws FileNotFoundException {
        writeText(generateRandomString());
    }

    public static void writeText(String file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        pw.print("Printing this on given file.");
        pw.close();
    }

    public static String generateRandomString() {
        String fileName = "";
        for (int i = 0; i < 5; i++) {
            int ranNum = (int) (Math.random() * 9) + 1;
            char ranChar = (char) ((int) (Math.random() * 125) + 11);
            fileName += (ranNum + "" + ranChar);
        }
        return fileName + ".txt";
    }
}