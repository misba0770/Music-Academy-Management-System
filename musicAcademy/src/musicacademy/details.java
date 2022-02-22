/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicacademy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details implements ActionListener {

    JFrame f;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;

    details(){
        f=new JFrame("Student Details");
        f.setBackground(Color.RED);
        f.setLayout(null);
        l3=new JLabel();
        l3.setBounds(0,0,700,500);
        l3.setLayout(null);
        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("musicacademy/icons/background.jpg"));
        l3.setIcon(i2);
        f.add(l3);
        
        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("musicacademy/icons/details.jpg"));
        l1.setIcon(i1);
        l3.add(l1);
        f.add(l3);
        

        l2 = new JLabel("Student Details");
        l2.setBounds(430,20,200,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.PINK);
        b1.setBounds(420,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("View");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.PINK);
        b2.setBounds(530,80,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.PINK);
        b3.setBounds(420,140,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.PINK);
        b4.setBounds(530,140,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        l1.add(b4);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(300,100);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Student();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Student();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Student();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Student();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
    
}
