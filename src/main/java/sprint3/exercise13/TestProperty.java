package sprint3.exercise13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperty {
    public static void main(String[] args) throws IOException {
        Properties settings = new Properties();
        settings.setProperty("width", "600.0");
        settings.setProperty("filename", "/home/mohammad/Desktop/raven.html");
        FileOutputStream out = new FileOutputStream("/home/mohammad/Desktop/raven.txt");
        settings.store(out, "Program Properties");

        FileInputStream in = new FileInputStream("/home/mohammad/Desktop/raven.txt");
        settings.load(in);
        System.out.println(settings.getProperty("filename"));
    }
}
