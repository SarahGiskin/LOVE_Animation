//LOVE graphics program to draw LOVE statue and change colors
//last edited by Sarah Giskin 12/11/19

package LOVE_Proj;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        //create MyCanvas object
        MyCanvas canvasNew = new MyCanvas();


        //set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("LOVE");
        frame.setSize(450, 400);
        frame.setLocation(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //add the canvas to the frame as a content panel
        frame.getContentPane().add(canvasNew);
        frame.setVisible(true);

    }   //end main method

}   //end main class


class MyCanvas extends Canvas {
    public MyCanvas()
    {
    }  //end MyCanvas() constructor


    public void paint(Graphics graphics) {

        //define variables
        int i = 1;
        int i2 = 1;
        int next = 30;
        int red;
        int green;
        int blue;

        //create for loop to change colors 24 times
        for(i=1;  i<=25; i++)
        {
            //randomly generate and set a color for canvas background
            red = (int) (Math.random() * 256);
            green = (int) (Math.random() * 256);
            blue = (int) (Math.random() * 256);
            graphics.setColor(new Color(red, green, blue));
            graphics.fillRect(0, 0, 450, 450);

            //randomly generate and set a color for lines
            red = (int) (Math.random() * 256);
            green = (int) (Math.random() * 256);
            blue = (int) (Math.random() * 256);
            graphics.setColor(new Color(red, green, blue));


            //create if command to set colors for first and last iterations
            if ((i == 1) || (i == 25))
            {
                //set canvas background to black
                graphics.setColor(Color.BLACK);
                graphics.fillRect(0, 0, 450, 450);


                //set line color to red
                graphics.setColor(Color.red);
            }        //end if command


            //create Graphics2D object to use setStroke method to increase line width
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.setStroke(new BasicStroke(5));


            //draw lines for L with time delay
            graphics.drawLine(150, 60, 150, 160);
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }
            graphics.drawLine(150, 160, 210, 160);


            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }


            //draw oval for O with time delay
            graphics.drawOval(230, 60, 60, 100);


            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }


            //draw lines for V with time delay
            graphics.drawLine(150, 180, 180, 280);

            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }


            graphics.drawLine(180, 280, 210, 180);

            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }


            //draw lines for E with time delay
            graphics.drawLine(230, 180, 230, 280);


            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }


            graphics.drawLine(230, 180, 290, 180);

            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }


            graphics.drawLine(230, 230, 270, 230);

            try {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }


            graphics.drawLine(230, 280, 290, 280);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }

            i = i + 1;

        }   //end for loop for color changes


        //create for loop to draw diagonal slashes at end of program
        for (i2 = 1; i2 < 54; i2 = i2 + 1)
        {
            graphics.drawLine(0, next, next, 0);
            next =  next +30;

            try {
                TimeUnit.MILLISECONDS.sleep(80);
            }
            catch (Exception e) {
                System.out.println("Exception caught");
            }

            i2 = i2 + 1;

        }   //end for loop for slashes

    }   //end paint() method

}   //end MyCanvas class
