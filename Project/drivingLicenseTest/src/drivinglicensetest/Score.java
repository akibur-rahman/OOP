package drivinglicensetest;

import static drivinglicensetest.Login.nid;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Score extends JFrame implements ActionListener {

    Score(String nid, int score) {
        setBounds(400, 150, 750, 550);
        setLayout(null);
        
        
        JLabel heading = new JLabel("Test Completed");
        heading.setBounds(300, 80, 700, 30);
        heading.setFont(new Font("Impact", Font.PLAIN, 26));
        add(heading);
        
        
        if(score>=80)
        {
        JLabel lblscore = new JLabel("You've Pass with: " + score+" numbers");
        lblscore.setBounds(230, 200, 400, 30);
        lblscore.setFont(new Font("Ariel", Font.PLAIN, 26));
        add(lblscore);
        writeFile();
        }
        else
        {
        JLabel lblscore = new JLabel("You've Failed! Try Again!");
        lblscore.setBounds(250, 200, 300, 30);
        lblscore.setFont(new Font("Ariel", Font.PLAIN, 26));
        add(lblscore);
        }
        
        JButton exit = new JButton("Exit");
        exit.setBounds(340, 270, 80, 30);
        exit.addActionListener(this);
        add(exit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
     public void writeFile()
    {
        try {
            FileWriter file=new FileWriter("nid.text", true);
            BufferedWriter writer =new BufferedWriter(file);
            writer.write(nid);
            writer.newLine();
            writer.close();
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public static void main(String[] args) {
        new Score("User", 0);
    }
}