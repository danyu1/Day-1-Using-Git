import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//file reader class uses buffered reader to read a passed in string that has the name of a text file within your workspace
//the buffered readre then is stored in a "val" variable that is casted into a char which is concatnated to a local string variable
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