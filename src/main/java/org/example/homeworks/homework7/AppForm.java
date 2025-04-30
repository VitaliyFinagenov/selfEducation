package org.example.homeworks.homework7;

import javax.swing.*;
import java.awt.*;

public class AppForm extends JFrame {
    public AppForm(){
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);

        JButton northButton = new JButton("Butter №1");
        add(northButton, BorderLayout.NORTH);
        JButton southButton = new JButton("Butter №2");
        add(southButton, BorderLayout.SOUTH);
        JButton westButton = new JButton("Butter №3");
        add(westButton, BorderLayout.WEST);
        JButton eastButton = new JButton("Butter №4");
        add(eastButton, BorderLayout.EAST);
        JButton centerButton = new JButton("Butter №5");
        add(centerButton, BorderLayout.CENTER);

        setVisible(true);
    }
}
