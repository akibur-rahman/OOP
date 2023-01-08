package drivinglicensetest;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton Start, Exit;
    JTextField NID;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/cover.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("WELCOME");
        heading.setBounds(800, 100, 300, 45);
        heading.setFont(new Font("IMPACT", Font.BOLD, 40));
        heading.setForeground(new Color(0, 0, 0));
        add(heading);
        
        JLabel name = new JLabel("Enter your NID");
        name.setBounds(810, 170, 300, 20);
        name.setFont(new Font("Ariel", Font.BOLD, 18));
        name.setForeground(new Color(0, 0, 0));
        add(name);
        
        NID = new JTextField();
        NID.setBounds(735, 220, 300, 25);
        NID.setFont(new Font("Ariel", Font.BOLD, 20));
        add(NID);
        
        Start = new JButton("Start");
        Start.setBounds(735, 270, 120, 25);
        Start.addActionListener(this);
        add(Start);
        
        Exit = new JButton("Exit");
        Exit.setBounds(915, 270, 120, 25);
        Exit.addActionListener(this);
        add(Exit);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Start) {
            String nid = NID.getText();
            setVisible(false);
            new Questions(nid);
        } else if (ae.getSource() == Exit) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}