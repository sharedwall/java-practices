package sprint2.exercise1;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) throws InterruptedException {
        String [] planets = {"Mercury","Venus","Earth", "Mars","Jupiter","Uranus"};
        System.out.println(Arrays.toString(planets));

        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        Arrays.sort(planets, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(planets));
        Timer timer = new Timer(1000, event -> {
            System.out.println("Current time is: " + new Date());
            Toolkit.getDefaultToolkit().beep();

        });
        timer.start();
        Thread.sleep(1100);
    }
}
