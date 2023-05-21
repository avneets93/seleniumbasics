package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static void main(String[] args) throws IOException {
        FileReader newFileReader = new FileReader("C:\\Users\\Avneet\\IdeaProjects\\selenium-automation-framework\\src\\test\\resources\\configfiles\\config.properties");
        Properties prop = new Properties();
        prop.load(newFileReader);

    }
}
