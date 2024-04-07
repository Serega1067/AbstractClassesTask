package edu.javacourse.ui;

import javax.swing.JFrame;

public class ShapeApplication
{
    public static void main(String[] args)
    {
        System.out.println("Start");

        ShapeFrame of = new ShapeFrame();
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        of.setVisible(true);

        System.out.println("End");
    }
}
