import java.io.PrintWriter;
import java.io.FileNotFoundException;

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
            fileName += (((int) (Math.random() * 9) + 1) + ((char) ((int) (Math.random() * 126) + 10)));
        }
        return fileName;
    }
}