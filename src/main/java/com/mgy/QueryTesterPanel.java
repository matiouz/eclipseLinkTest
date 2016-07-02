package com.mgy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Panel that allows to input a JPQL query and run it
 */
public class QueryTesterPanel extends JPanel {

    private final static String defaultQuery = "select t from Todo t";

    public QueryTesterPanel(){
        setLayout(new FlowLayout());

        JLabel label = new JLabel("JPQL query");
        JTextField txtQuery = new JTextField(defaultQuery);
        txtQuery.setColumns(30);
        JButton btnRunQuery = new JButton("run");

        add(label);
        add(txtQuery);
        add(btnRunQuery);

        final QueryRunner queryRunner = new QueryRunner();

        btnRunQuery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queryRunner.run(txtQuery.getText());
            }
        });
    }

}


