import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class XmltoJson {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = XmltoJson.class.getResourceAsStream("");
        InputStream inputStream1 = new FileInputStream(new File(""));
    }
}
