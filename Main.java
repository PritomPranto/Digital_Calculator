package oopproject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener
{
    private ImageIcon icon,l;
    private Container c;

    private JButton but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but14;

    Main()

    {
        PDJ();
    }

    public void PDJ ()

    {
        icon = new ImageIcon(getClass().getResource("calculator.png"));
        l = new ImageIcon(getClass().getResource("Length.jpeg"));

        this.setIconImage(icon.getImage());
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        but1 = new JButton("Calculator");
        but1.setBounds(100,50,200,50);
        but1.setBackground(Color.PINK);
        c.add(but1);

        but2 = new JButton("Length");
        but2.setBounds(100,150,200,50);
        but2.setBackground(Color.GRAY);
        c.add(but2);

        but3 = new JButton("Loan");
        but3.setBounds(100,250,200,50);
        but3.setBackground(Color.RED);
        c.add(but3);

        but4 = new JButton("GPA");
        but4.setBounds(100,350,200,50);
        but4.setBackground(Color.orange);
        c.add(but4);

        but5 = new JButton("BMI");
        but5.setBounds(100,450,200,50);
        but5.setBackground(Color.darkGray);
        c.add(but5);


        but6 = new JButton("Currency");
        but6.setBounds(350,50,200,50);
        but6.setBackground(Color.MAGENTA);
        c.add(but6);

        but7 = new JButton("Data Converter");
        but7.setBounds(350,150,200,50);
        but7.setBackground(Color.GREEN);
        c.add(but7);

        but8 = new JButton("Weight Converter");
        but8.setBounds(350,250,200,50);
        but8.setBackground(Color.cyan);
        c.add(but8);

        but9 = new JButton("Speed Converter");
        but9.setBounds(350,350,200,50);
        but9.setBackground(Color.RED);
        c.add(but9);


        but11 = new JButton("Numeral System");
        but11.setBounds(600,50,200,50);
        but11.setBackground(Color.LIGHT_GRAY);
        c.add(but11);

        but12 = new JButton("Discount");
        but12.setBounds(600,150,200,50);
        but12.setBackground(Color.PINK);
        c.add(but12);



        but14 = new JButton("Temperature");
        but14.setBounds(600,250,200,50);
        but14.setBackground(Color.ORANGE);
        c.add(but14);


        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        but11.addActionListener(this);
        but12.addActionListener(this);
        but14.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==but4){
            GPA p = new GPA();
        }
        else if(e.getSource()==but2){
            Length a = new Length();
        }
        else if(e.getSource()==but3){
            Loan a = new Loan();
        }
        else if(e.getSource()==but7){
            DataConverter a = new DataConverter();
        }
        else if(e.getSource()==but14){
            Temperature a = new Temperature();
        }
        else if(e.getSource()==but6){
            CurrencyConverter a = new CurrencyConverter();
        }
        else if(e.getSource()==but8){
            WeightConverter a = new WeightConverter();
        }
        else if(e.getSource()==but1){
            Calculator a = new Calculator();
        }
        else if(e.getSource()==but11){

            NumeralSystem a = new NumeralSystem();
        }
        else if(e.getSource()==but5){
            BMI a = new BMI();
        }
        else if(e.getSource()==but12){
            Discount a = new Discount();
        }

        else if(e.getSource()==but1){
            Calculator  a = new Calculator();



        }

    }

    public static void main(String[] args)

    {

        Main frame = new Main();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,40,900,600);
        frame.setTitle("Digital Calculator");




    }

}