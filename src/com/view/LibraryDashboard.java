package com.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LibraryDashboard extends JFrame {
    public LibraryDashboard() {
        setTitle("Library Management System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        //Header
        JLabel titleLabel = new JLabel("Library Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        titleLabel.setBorder(new EmptyBorder(20, 10, 20, 10));
        add(titleLabel, BorderLayout.NORTH);

        //Buttons
        JPanel buttonPanel = new JPanel(new GridLayout(3,2,15,15));
        buttonPanel.setBorder(new EmptyBorder(20, 40, 20, 40));

        JButton addBookButton = new JButton("Add Book");
        JButton viewBookButton = new JButton("View Book");
        JButton addMemberButton = new JButton("Register Member");
        JButton viewMemberButton = new JButton("View Member");
        JButton issueBookButton = new JButton("Issue Book");
        JButton returnBookButton = new JButton("Return Book");

        Font bottonFont = new Font("Times New Roman", Font.BOLD, 16);
        JButton[] buttons = {addBookButton, viewBookButton, addMemberButton, viewMemberButton, issueBookButton, returnBookButton};


        for(JButton button : buttons){
            button.setFont(bottonFont);
            button.setBackground(new Color(255, 255, 255));
            button.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(180, 200, 230, 1)),
                    new EmptyBorder(10, 15,10,15)
            ));
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}

