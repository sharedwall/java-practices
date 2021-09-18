package sprint3.exercise9;

import java.io.FileReader;
import java.io.IOException;

public class ExcepTest3 {
    public static void main(String args[]) {
        try (FileReader fr = new FileReader("E://file.txt")) {
            char[] a = new char[50];
            fr.read(a);   // reads the contentto the array
            for (char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Caught an exception");
        }
    }
}
