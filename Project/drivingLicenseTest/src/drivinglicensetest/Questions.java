package drivinglicensetest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questions extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit;
    
    public static int timer = 20;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String nid;
    
    Questions(String nid) {
        this.nid = nid;
        setBounds(50, 0, 1000, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        qno = new JLabel();
        qno.setBounds(80, 80, 50, 30);
        qno.setFont(new Font("Ariel", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(120, 80, 1900, 30);
        question.setFont(new Font("Ariel", Font.PLAIN, 24));
        add(question);
        
                questions[0][0] = "If you're going 65 mph, and you're approaching a residential area you must:";
        questions[0][1] = "You accelerate";
        questions[0][2] = "You keep your speed, if you do not pass other vehicles";
        questions[0][3] = "You slow down";
        questions[0][4] = "You keep your speed";

        questions[1][0] = "If you're turning right at a traffic light, but see a pedestrian crossing what do you do:";
        questions[1][1] = "You pass the pedestrian";
        questions[1][2] = "You check that there is no other vehicles around";
        questions[1][3] = "You wait until the pedestrian has crossed";
        questions[1][4] = "You shoot the pedestrian and continue to drive";

        questions[2][0] = "Without any prior indication, the speed in a residential area is: __ Km";
        questions[2][1] = "30";
        questions[2][2] = "35";
        questions[2][3] = "40";
        questions[2][4] = "45";

        questions[3][0] = "Before every lane change you must:";
        questions[3][1] = "Check your mirrors";
        questions[3][2] = "Check your blind spots";
        questions[3][3] = "Signal your intentions";
        questions[3][4] = "All of the above";

        questions[4][0] = "What blood alcohol level is classified as driving while intoxicated?";
        questions[4][1] = "0.05%";
        questions[4][2] = "0.18%";
        questions[4][3] = "0.08%";
        questions[4][4] = "0.06%";

        questions[5][0] = "When can you continue to drive at a traffic light?";
        questions[5][1] = "When it is green";
        questions[5][2] = "When there is nobody in the intersection";
        questions[5][3] = "You are in a school zone";
        questions[5][4] = "When it is green and / or red and you're turning right";

        questions[6][0] = "A pedestrian has a do not cross signal, what do you do?";
        questions[6][1] = "You let them pass";
        questions[6][2] = "You observe before continuing";
        questions[6][3] = "You wave to tell them to cross";
        questions[6][4] = "You continue because your traffic light is green";

        questions[7][0] = "What is allowed when passing another vehicle";
        questions[7][1] = "You follow it closely to pass it faster";
        questions[7][2] = "You pass it without leaving the roadway";
        questions[7][3] = "You drive on the opposite side of the road to pass";
        questions[7][4] = "You exceed the speed limit to pass them";

        questions[8][0] = "You are driving on a highway which indicates a maximum speed of 70 mph. Most traffic drives at 75 mph, so you should not drive faster than:";
        questions[8][1] = "50 mph";
        questions[8][2] = "25 mph";
        questions[8][3] = "30 mph";
        questions[8][4] = "70 mph";

        questions[9][0] = "When you are overtaken by another vehicle it is important NOT to:";
        questions[9][1] = "Slow Down";
        questions[9][2] = "Check your mirrors";
        questions[9][3] = "Watch other drivers";
        questions[9][4] = "Increase your speed";
        
        answers[0][1] = "You slow down";
        answers[1][1] = "You wait until the pedestrian has crossed";
        answers[2][1] = "40";
        answers[3][1] = "All of the above";
        answers[4][1] = "0.08%";
        answers[5][1] = "When it is green and / or red and you're turning right";
        answers[6][1] = "You continue because your traffic light is green";
        answers[7][1] = "You drive on the opposite side of the road to pass";
        answers[8][1] = "70 mph";
        answers[9][1] = "Increase your speed";
        
        opt1 = new JRadioButton();
        opt1.setBounds(100, 180, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Ariel", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(100, 220, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Ariel", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(100, 260, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Ariel", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(100, 300, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Ariel", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(800, 350, 120, 35);
        next.setFont(new Font("Ariel", Font.PLAIN, 22));
        next.addActionListener(this);
        add(next);
        
        submit = new JButton("Submit");
        submit.setBounds(800, 400, 120, 35);
        submit.setFont(new Font("Ariel", Font.PLAIN, 22));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }   
        else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(nid, score);
        }
    }
    
     
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Questions("User");
    }
}