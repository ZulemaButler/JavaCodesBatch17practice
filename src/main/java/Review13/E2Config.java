package Review13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args) throws IOException {
        String path = "/Users/porschabuttercup/IdeaProjects/JavaBasics";
        try (FileInputStream fis = new FileInputStream(path);
        ){
            Properties properties = new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("browser"));

        } catch (IOException io) {
            System.out.println("Please  check the file that you are trying to read");
            // Send an email/ report to the team.
            //having a backup code like create new file if the one from above path is not found.
        }

        }
    }
