package Test;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
//        File file = new File("changelog.xml");
//        System.out.println(file.isFile());

        URL file = Test.class.getResource("/liquibase.properties");


        File file2 = new File(ClassLoader.getSystemResource("liquibase.properties").getFile());


        try {
            InputStream inputStream=new FileInputStream(file2);

            Properties properties=new Properties();
            properties.load(inputStream);
            System.out.println(properties.getProperty("driver"));
            System.out.println(properties.getProperty("url"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("username"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
