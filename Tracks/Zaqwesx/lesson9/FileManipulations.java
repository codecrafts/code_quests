import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileManipulations {
    static List<String> getFileStrings(String path, Charset encoding) {
        List<String> text = new ArrayList<>();

        try {
            text = FileOperations.parseHtmlFile(path, encoding);
            System.out.println("File converted to strings.");
        } catch (IOException exc) {
            System.out.println("IOException is thrown " + exc.toString());
        } catch (FileNotHtmlException exc) {
            System.out.println("File is not Html. Exception called.");
        }


        return text;
    }

    static void writeStringsToFile(String path, List<String> strings) {
        try {
            FileOperations.writeStringsToFile(path, strings);
            System.out.println("File written.");
        } catch (IOException exc) {
            System.out.println("IOException is thrown " + exc.toString());
        }
    }
}
