package com.uib.leapmotion.darts;

import com.leapmotion.leap.Controller;

import java.io.IOException;

/**
 * Created by spixy on 9.6.2017.
 */
public class Main {
    public static void main(String[] args) {
        // Create a sample listener and controller
        HandOutput listener = new HandOutput();
        Controller controller = new Controller();

        // Have the sample listener receive events from the controller
        controller.addListener(listener);

        // Keep this process running until Enter is pressed
        System.out.println("Press Enter to quit...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Remove the sample listener when done
        controller.removeListener(listener);
    }
}