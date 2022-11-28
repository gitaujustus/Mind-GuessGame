package com.GuessgameCopy;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Welcome extends JFrame {
    ImageIcon image;

    ImageIcon icon;

    JLabel label;

    JLabel labeled;

    JProgressBar progressBar;

    Welcome() {
        setDefaultCloseOperation(3);
        setLocationRelativeTo((Component)null);
        setLayout((LayoutManager)null);
        setBounds(250, 120, 700, 520);
        setResizable(false);
        this.icon = new ImageIcon("Backies.png");
        this.labeled = new JLabel();
        this.labeled.setBounds(0, 0, 700, 520);
        this.labeled.setBackground(Color.green);
        this.labeled.setOpaque(true);
        this.labeled.setIcon(this.icon);
        this.labeled.setVisible(true);
        this.image = new ImageIcon("project.png");
        this.label = new JLabel();
        this.label.setForeground(Color.yellow);
        this.label.setHorizontalTextPosition(0);
        this.label.setVerticalTextPosition(1);
        this.label.setIconTextGap(-150);
        this.label.setFont(new Font("Algerian", 1, 20));
        this.label.setBounds(0, 50, 650, 450);
        this.label.setVisible(true);
        this.label.setBackground(Color.green);
        this.label.setIcon(this.image);
        JLabel lab = new JLabel();
        lab.setText("Powered by @J_gitau");
        lab.setFont(new Font("Poor richard", 2, 20));
        lab.setForeground(Color.blue);
        lab.setOpaque(true);
        lab.setBounds(500, 450, 180, 30);
        add(lab);
        JLabel labs = new JLabel();
        labs.setText("Welcome to J_gitau's Guess game");
        labs.setFont(new Font("Algerian", 1, 20));
        labs.setForeground(Color.black);
        labs.setOpaque(true);
        labs.setBackground(Color.white);
        labs.setBounds(70, 50, 400, 30);
        add(labs);
        this.progressBar = new JProgressBar();
        this.progressBar.setValue(0);
        this.progressBar.setBounds(0, 0, 720, 30);
        this.progressBar.setStringPainted(true);
        this.progressBar.setBackground(Color.GREEN);
        this.progressBar.setForeground(Color.blue);
        add(this.progressBar);
        add(this.label);
        add(this.labeled);
        setVisible(true);
        fill();
    }

    public void fill() {
        int counter = 0;
        while (counter < 100) {
            this.progressBar.setString("Loading...");
            this.progressBar.setValue(counter);
            try {
                Thread.sleep(30L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
        }
        this.progressBar.setString("Done!");
        new Guess();
        dispose();
    }
}
