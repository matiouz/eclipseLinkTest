package com.mgy;

import javax.persistence.EntityManagerFactory;
import javax.swing.*;

/**
 *
 */
public class SwingApp
{

    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Eclipselink Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        QueryTesterPanel queryTesterPanel = new QueryTesterPanel();
        frame.getContentPane().add(queryTesterPanel);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
