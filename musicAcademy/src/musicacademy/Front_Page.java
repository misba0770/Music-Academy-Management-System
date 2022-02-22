/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicacademy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author misba zaidi
 */
public class Front_Page implements ActionListener {

    JFrame f;
    JLabel id,l1;
    JButton b;
    
    Front_Page(){
        f=new JFrame("Music Classes Registration");
        f.setBackground(Color.PINK);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("musicacademy/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,120,1300,500);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.WHITE);
        b.setForeground(Color.PINK);
        

        b.setBounds(480,500,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("MUSIC CLASSES REGISTRATION");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.PINK);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(0,0);

      

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }
         public static void main(String[] args) {
        Front_Page f = new Front_Page();
    }

    
    
}
    

