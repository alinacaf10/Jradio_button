package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JRadioButton r1=new JRadioButton("Woman",true);
        r1.setBounds(100,50,100,30);
        r1.setActionCommand(r1.getText());
        JRadioButton r2=new JRadioButton("Man");
        r2.setBounds(100,100,100,30);
        r2.setActionCommand(r2.getText());
        JRadioButton r3=new JRadioButton("Dont say");
        r3.setBounds(100,150,100,30);
        r3.setActionCommand(r3.getText());

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        JButton btn=new JButton("Submit");
        btn.setBounds(100,200,100,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(bg.getSelection().getActionCommand());
            }
        });
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(btn);
    }
}
