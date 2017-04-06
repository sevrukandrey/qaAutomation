package utils;

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.io.InputStream;

        import java.util.Properties;

/**
 * Created by User on 06.04.2017.
 */
public class PropertiesReader {

    public String getProperty(String path,String properties) throws IOException {
        Properties prop = new Properties();
        InputStream is = new FileInputStream(path);
        prop.load(is);
        return prop.getProperty(properties);
    }
}
