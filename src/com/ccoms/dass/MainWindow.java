package com.ccoms.dass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Color;

public class MainWindow {

    private JFrame frame;
    private JTextField txtProvideSourceCode;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MainWindow() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("Cloud Comp devops-as-a-service");
        frame.getContentPane().setBackground(new Color(0, 206, 209));
        frame.setBounds(100, 100, 604, 404);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        txtProvideSourceCode = new JTextField();
        txtProvideSourceCode.setText("Provide source code repository url here");
        txtProvideSourceCode.setBounds(24, 49, 470, 30);
        frame.getContentPane().add(txtProvideSourceCode);
        txtProvideSourceCode.setColumns(10);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Build Infrastructure on Cloud");
        rdbtnNewRadioButton.setBounds(24, 134, 225, 23);
        frame.getContentPane().add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Build on-premise Infrastructure ");
        rdbtnNewRadioButton_1.setBounds(24, 160, 225, 23);
        frame.getContentPane().add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Smart Check ");
        rdbtnNewRadioButton_2.setBounds(24, 186, 209, 23);
        frame.getContentPane().add(rdbtnNewRadioButton_2);
    }
}
