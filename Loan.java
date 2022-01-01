package oopproject1;

/**
 * Name    : Pritom Mitra Pranto
 * Address : Sylhet
 * Email   : pritommitra45@gmail.com
 */


import java.util.Scanner;

import javax.swing.JOptionPane;

public class Loan {



    {
        Scanner a = new Scanner(System.in);

        //Get User Input By USing JOptionPane.showInputDialog ( java swing )

        double total, percentage, time, kisty;

        String Total = JOptionPane.showInputDialog(null, "Enter Total Ammount:", "Loan", JOptionPane.PLAIN_MESSAGE);

        total  = Double.parseDouble(Total);

        String Percentage = JOptionPane.showInputDialog(null, "Enter Your Percentage:", "Loan", JOptionPane.PLAIN_MESSAGE);

        percentage = Double.parseDouble(Percentage);

        String  Time = JOptionPane.showInputDialog(null, "Enter Time in Year:", "Loan", JOptionPane.PLAIN_MESSAGE);

        time = Double.parseDouble(Time);

        percentage=percentage/(12*100);

        time=time*12;


        kisty= (total*percentage*Math.pow(1+percentage,time))/(Math.pow(1+percentage,time)-1);

        String Kisty = Double.toString(kisty);
        JOptionPane.showMessageDialog(null, "Your Monthly EMI :" +Kisty);

    }

}
