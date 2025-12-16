package com.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewBooksForm extends JFrame {
    private JFrame parent;

    public ViewBooksForm(JFrame parent) {
        this.parent = parent;

        setTitle("All Books");
        setSize(650, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        //Header
        JLabel header  = new JLabel("All Books", SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        header.setBorder(new EmptyBorder(15, 10, 15, 10));
        add(header, BorderLayout.NORTH);


        //Table
        String[] columns = {"Title", "Author", "ISBN", "Quantity"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        table.setRowHeight(28);
        table.setFont(new Font("Arial", Font.BOLD, 18));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));

    }
}
