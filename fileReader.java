import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        System.out.println(readText("282^2I7%74.txt"));
    }

    public static String readText(String fileName) throws IOException {
        String textRead = "";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready()) {
            int val = br.read();
            textRead += (char) val;
        }
        br.close();
        return textRead;
    }
}