package oopproject1;
import javax.swing.*;

public class WeightConverter {

    {

        String[] option = {"Kilogram to Pound", "Kilogram to Gram", "Gram to Kilogram", "Gram to Pound","Pound to Kilogram", "Pound to Gram"};

        int x = JOptionPane.showOptionDialog(null, "Your choice", "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);

        if (x == 0){
            //Kilogram to Pound
            String Kilogram1 = JOptionPane.showInputDialog(null, "Enter the Kilogram: ", "Kilogram to Pound", JOptionPane.PLAIN_MESSAGE);
            double Kilogram = Double.parseDouble(Kilogram1);

            double Pound = Kilogram * 2.205;
            Kilogram1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + Kilogram1);
        }

        if (x == 1){
            //Kilogram to Gram
            String Kilogram1 = JOptionPane.showInputDialog(null, "Enter the Kilogram: ", "Kilogram to Gram", JOptionPane.PLAIN_MESSAGE);
            double Kilogram = Double.parseDouble(Kilogram1);

            double Gram = Kilogram * 1000;
            Kilogram1 = Double.toString(Gram);

            JOptionPane.showMessageDialog(null, "The Gram is: " + Kilogram1);
        }

        if (x == 2){
            //Gram to Kilogram
            String Gram1 = JOptionPane.showInputDialog(null, "Enter the Gram: ", "Gram to Kilogram", JOptionPane.PLAIN_MESSAGE);
            double Gram = Double.parseDouble(Gram1);

            double Kilogram = Gram / 1000;
            Gram1 = Double.toString(Kilogram);

            JOptionPane.showMessageDialog(null, "The Kilogram is: " + Gram1);
        }

        if (x == 3){
            //Gram to Pound
            String Gram1 = JOptionPane.showInputDialog(null, "Enter the Gram: ", "Gram to Pound", JOptionPane.PLAIN_MESSAGE);
            double Gram = Double.parseDouble(Gram1);

            double Pound = Gram / 453.592;
            Gram1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + Gram1);
        }

        if (x == 4){
            //Pound to Kilogram
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the Pound: ", "Pound to Kilogram", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double Kilogram = Pound / 2.205;
            Pound1 = Double.toString(Kilogram);

            JOptionPane.showMessageDialog(null, "The Kilogram is: " + Pound1);
        }

        if (x == 5){
            //Pound to Gram
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the Pound: ", "Pound to Gram", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double Gram = Pound * 453.592;
            Pound1 = Double.toString(Gram);

            JOptionPane.showMessageDialog(null, "The Gram is: " + Pound1);
        }
    }
}