package com.GuessgameCopy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

class Guess extends JFrame implements ActionListener {
    JLabel label;

    JTextField textField = new JTextField();

    JButton button;

    JButton Hint;

    JButton start;

    JButton restart;

    JPanel panel;

    JLabel output;

    JLabel labels;

    JLabel HintT;

    JLabel warn;

    JLabel Qe;

    ImageIcon icon;

    ImageIcon Qes;

    JPanel Background;

    JLabel label23;

    JLabel label24;

    ImageIcon backie;

    JLabel back;

    JLabel Corruption;

    Random random;

    int A;

    int counter;

    Guess() {
        this.random = new Random();
        this.A = this.random.nextInt(101);
        this.counter = 7;
        ActionActionListener();
        setDefaultCloseOperation(3);
        setLayout((LayoutManager)null);
        setLocationRelativeTo((Component)null);
        setBounds(0, 0, 1370, 768);
        getContentPane().setBackground(new Color(64, 207, 188));
        this.icon = new ImageIcon("MYME.png");
        this.labels = new JLabel();
        this.labels.setBounds(0, 0, 300, 850);
        this.labels.setVisible(true);
        this.labels.setBackground(Color.green);
        this.labels.setIcon(this.icon);
        this.Qes = new ImageIcon("Qe.png");
        this.Qe = new JLabel();
        this.Qe.setBounds(150, 110, 300, 200);
        this.Qe.setVisible(true);
        this.Qe.setBackground(Color.green);
        this.Qe.setIcon(this.Qes);
        this.label23 = new JLabel();
        this.label23.setBounds(350, 150, 620, 30);
        this.label23.setText("Guess a number between 0-100. GOOD LUCK!");
        this.label23.setBackground(Color.white);
        this.label23.setOpaque(true);
        this.label23.setFont(new Font("Algerian", 1, 26));
        this.label24 = new JLabel();
        this.label24.setBounds(350, 300, 300, 30);
        this.label24.setFont(new Font("Algerian", 1, 26));
        this.Background = new JPanel();
        this.Background.setLayout(new BorderLayout());
        this.Background.setBounds(0, 0, 1400, 800);
        this.backie = new ImageIcon("Background.jpg");
        this.back = new JLabel();
        this.back.setBounds(0, 0, 1366, 768);
        this.back.setIcon(this.backie);
        this.back.setVisible(true);
        this.Background.add(this.back);
        this.Background.setVisible(true);
        this.panel = new JPanel();
        this.panel.setLayout(new BorderLayout());
        this.label = new JLabel();
        this.label.setSize(200, 30);
        this.label.setText("Welcome to Justus guess Game ");
        this.label.setFont(new Font("Algerian", 1, 26));
        this.panel.setBounds(0, 0, 1400, 70);
        this.panel.setBackground(new Color(64, 202, 207));
        this.panel.setOpaque(true);
        this.panel.setVisible(true);
        this.panel.add(this.label, "West");
        this.output = new JLabel();
        this.output.setBounds(350, 250, 350, 30);
        this.output.setFont(new Font("poor richard", 0, 17));
        this.output.setForeground(Color.black);
        add(this.output);
        this.Corruption = new JLabel();
        this.Corruption.setBounds(15, 270, 50, 30);
        this.Corruption.setFont(new Font("calibri", 0, 17));
        this.Corruption.setForeground(new Color(1, 152, 1));
        add(this.Corruption);
        this.HintT = new JLabel();
        this.HintT.setBounds(700, 400, 250, 30);
        this.HintT.setFont(new Font("calibri", 0, 17));
        this.HintT.setForeground(new Color(128, 128, 128));
        add(this.HintT);
        this.warn = new JLabel();
        this.warn.setBounds(600, 450, 270, 30);
        this.warn.setFont(new Font("calibri", 0, 17));
        this.warn.setForeground(new Color(128, 128, 128));
        add(this.warn);
        this.start = new JButton("Start");
        this.start.setBounds(500, 75, 70, 30);
        this.start.setBackground(Color.green);
        this.start.setFocusable(false);
        this.start.addActionListener(this);
        this.restart = new JButton("Restart");
        this.restart.setBounds(500, 450, 77, 30);
        this.restart.setBackground(new Color(64, 202, 207));
        this.restart.setFocusable(false);
        this.restart.setVisible(false);
        this.restart.addActionListener(this);
        this.textField.setBounds(450, 200, 200, 30);
        this.textField.setEnabled(false);
        this.textField.setVisible(false);
        this.button = new JButton("Send");
        this.button.setBounds(500, 400, 80, 30);
        this.button.addActionListener(this);
        this.button.setEnabled(false);
        this.button.setVisible(false);
        this.Hint = new JButton("Hint");
        this.Hint.setBounds(600, 400, 70, 30);
        this.Hint.setBackground(Color.gray);
        this.Hint.addActionListener(this);
        this.Hint.setEnabled(true);
        this.Hint.setFocusable(true);
        this.Hint.setVisible(false);
        add(this.start);
        add(this.restart);
        add(this.labels);
        add(this.Qe);
        add(this.label23);
        add(this.label24);
        add(this.panel);
        add(this.button);
        add(this.Hint);
        add(this.textField);
        add(this.Background);
        setVisible(true);
    }

    public void ActionActionListener() {}

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.start) {
            this.A = this.random.nextInt(101);
            this.Corruption.setText(" " + this.A);
            this.counter = 7;
            this.Hint.setVisible(false);
            this.HintT.setVisible(false);
            this.output.setVisible(false);
            this.label24.setVisible(false);
            this.label24.setForeground(Color.black);
            this.button.setVisible(true);
            this.button.setEnabled(true);
            this.restart.setVisible(true);
            this.textField.setVisible(true);
            this.textField.setEnabled(true);
            this.textField.setBackground(Color.white);
            this.textField.setText("");
            this.textField.setCaretPosition(1);
            this.output.setForeground(Color.BLACK);
            this.output.setText(" ");
            this.output.setBorder((Border)null);
            this.label24.setText(" ");
            this.HintT.setText(" ");
            this.warn.setText(" ");
            this.warn.setVisible(false);
            this.Hint.setOpaque(false);
            this.Hint.setEnabled(false);
        }
        if (actionEvent.getSource() == this.restart) {
            this.A = this.random.nextInt(101);
            this.Corruption.setText(" " + this.A);
            this.counter = 7;
            this.Hint.setVisible(false);
            this.HintT.setVisible(false);
            this.warn.setVisible(false);
            this.output.setVisible(false);
            this.label24.setVisible(false);
            this.label24.setForeground(Color.black);
            this.button.setVisible(true);
            this.button.setEnabled(true);
            this.textField.setVisible(true);
            this.textField.setEnabled(true);
            this.textField.setBackground(Color.white);
            this.textField.setText("");
            this.textField.setCaretPosition(1);
            this.output.setForeground(Color.BLACK);
            this.output.setText(" ");
            this.output.setBorder((Border)null);
            this.label24.setText(" ");
            this.HintT.setText(" ");
            this.Hint.setOpaque(false);
            this.Hint.setEnabled(false);
        }
        if (this.textField.getText().matches("[a-zA-Z]+"))
            JOptionPane.showMessageDialog(null, "Invalid Input! please enter numbers only!");
        if (this.textField.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Enter your guess on the space provided");
        int guess = Integer.parseInt(this.textField.getText());
        if (actionEvent.getSource() == this.button) {
            if (this.counter < 5) {
                this.warn.setVisible(true);
                this.warn.setText("Hint is for the mathematician only :)");
                this.warn.setForeground(Color.red);
                this.warn.setBackground(Color.white);
                this.warn.setOpaque(true);
                this.Hint.setEnabled(true);
                this.Hint.setBackground(Color.gray);
                this.Hint.setOpaque(true);
                this.Hint.setVisible(true);
            }
            if (this.counter > 0) {
                System.out.println(" " + this.A);
                System.out.println("Answer is 10 + " + (this.A - 10));
                if (this.A != guess && guess < 101 && guess > 0) {
                    Border border = BorderFactory.createLineBorder(Color.red, 3);
                    if (guess > this.A) {
                        this.output.setText("HIGHER than the right guess, TRY AGAIN!");
                        this.output.setBorder(border);
                        this.output.setForeground(Color.black);
                        this.output.setBackground(Color.white);
                        this.output.setOpaque(true);
                        this.output.setVisible(true);
                        this.label24.setText("Turns remaining: " + this.counter);
                        this.label24.setBackground(Color.white);
                        this.label24.setOpaque(true);
                        this.label24.setVisible(true);
                        this.counter--;
                    }
                    if (guess < this.A) {
                        this.output.setText("LOWER than the right guess, TRY AGAIN!");
                        this.output.setBorder(border);
                        this.output.setForeground(Color.black);
                        this.output.setBackground(Color.white);
                        this.output.setOpaque(true);
                        this.output.setVisible(true);
                        this.label24.setText("Turns remaining: " + this.counter);
                        this.label24.setBackground(Color.white);
                        this.label24.setOpaque(true);
                        this.label24.setVisible(true);
                        this.counter--;
                    }
                } else if (this.A == guess) {
                    this.label24.setVisible(false);
                    if (this.counter > 3) {
                        this.Corruption.setText(" ");
                        this.label24.setVisible(false);
                        Border border = BorderFactory.createLineBorder(Color.red, 3);
                        this.output.setText("Exellent!! " + (8 - this.counter) + " Turn(s) Used");
                        this.output.setBorder(border);
                        this.output.setFont(new Font("calibri", 1, 17));
                        this.output.setForeground(new Color(204, 34, 238));
                        this.output.setBackground(Color.white);
                        this.output.setOpaque(true);
                        this.HintT.setOpaque(false);
                        this.label24.setText(" ");
                        this.button.setEnabled(false);
                        this.Hint.setVisible(false);
                    } else {
                        this.label24.setVisible(false);
                        this.Corruption.setText(" ");
                        Border border = BorderFactory.createLineBorder(Color.red, 3);
                        this.output.setText("CONGRATULATIONS!! YOU GOT IT: " + (7 - this.counter) + " Turns Used");
                        this.output.setBorder(border);
                        this.output.setFont(new Font("calibri", 0, 17));
                        this.output.setForeground(Color.blue);
                        this.output.setBackground(Color.white);
                        this.output.setOpaque(true);
                        this.HintT.setOpaque(false);
                        this.button.setEnabled(false);
                        this.HintT.setText(" ");
                        this.Hint.setVisible(false);
                    }
                }
                if (guess > 101 || guess <= 0)
                    JOptionPane.showMessageDialog(null, "Invalid Option! please put number between 1-100");
            } else if (this.counter < 1 && guess != this.A) {
                this.Corruption.setText(" ");
                this.label24.setForeground(Color.red);
                this.label24.setBackground(Color.white);
                this.label24.setOpaque(true);
                this.output.setText("OOPS--->  RESTART AGAIN");
                this.output.setForeground(Color.blue);
                this.output.setOpaque(true);
                this.button.setEnabled(false);
                this.Hint.setEnabled(false);
                this.label24.setVisible(false);
                this.HintT.setVisible(false);
                this.warn.setVisible(false);
                JOptionPane.showMessageDialog(null, "GAME OVER. The correct answer was " + this.A);
                this.counter = 7;
            } else {
                this.Corruption.setText(" ");
                this.label24.setVisible(false);
                Border border = BorderFactory.createLineBorder(Color.red, 3);
                this.output.setText("CONGRATULATIONS!! YOU GOT IT: " + (7 - this.counter) + " Turns Used");
                this.output.setBorder(border);
                this.output.setFont(new Font("calibri", 0, 17));
                this.output.setForeground(Color.blue);
                this.label24.setText(" ");
                this.button.setEnabled(false);
            }
        }
        if (actionEvent.getSource() == this.Hint) {
            this.warn.setVisible(false);
            this.HintT.setText("Answer is  " + (this.A * 41.0D) + " /(2.5*4+33-2)");
            this.HintT.setOpaque(true);
            this.HintT.setBackground(Color.white);
            this.HintT.setVisible(true);
            System.out.println("Hey you clicked me");
            if (this.A > 94) {
                this.HintT.setText("Answer is  " + (this.A * 41.0D) + " /(2.5*4+33-2)");
                this.HintT.setOpaque(true);
                this.HintT.setBackground(Color.white);
                this.HintT.setVisible(true);
            }
            if (this.A < 5) {
                this.HintT.setText("Answer is  " + (this.A * 41.0D) + " /(2.5*4+33-2)");
                this.HintT.setOpaque(true);
                this.HintT.setBackground(Color.white);
                this.HintT.setVisible(true);
            }
        }
    }
}
