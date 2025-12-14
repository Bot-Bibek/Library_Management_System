package com.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AddBookForm extends JFrame {
    private JFrame parent;

    public AddBookForm(JFrame parent) {
        this.parent = parent;
        setTitle("Add New Book");
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));


        //Header
        JLabel header =  new JLabel("Add New Book", SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 20));
        header.setBorder(new EmptyBorder(20, 10, 20,10));
        add(header, BorderLayout.NORTH);

        //Form
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(new EmptyBorder(10, 40, 10, 40));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField isbnField = new JTextField();
        JTextField quantityField = new JTextField();

        addFormRow(formPanel, gbc,0, "Title: ", titleField );

    }

    private void addFormRow(JPanel panel, GridBagConstraints gbc , int y, String labelText, JTextField textField) {

        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.weightx = 0.3;
        panel.add(new JLabel(labelText), gbc);

    }
}
