package oopproject1;
import javax.swing.JOptionPane;

/*
    @Owner: Md. Shazadur Rahman
    Id. No: 1932020013
*/

public class Temperature {
    {

        String[] options = {"C to F", "C to K", "F to C", "F to K", "K to C", "K to F"};

        int x = JOptionPane.showOptionDialog(null, "your choice", "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (x == 0) {
            //Celsius to Fahrenheit
            String Celsius = JOptionPane.showInputDialog(null, "Enter the Celsius temperature: ", "Celsius to Fahrenheit", JOptionPane.PLAIN_MESSAGE);
            double C = Double.parseDouble(Celsius);

            double F = ((C * 9) / 5) + 32;
            Celsius = Double.toString(F);

            JOptionPane.showMessageDialog(null, "The Fahrenheit temperature is: " + Celsius);
        }

        else if (x == 1) {

            //Celsius to Kelvin
            String Celsius1 = JOptionPane.showInputDialog(null, "Enter the Celsius temperature: ", "Celsius to Kelvin", JOptionPane.PLAIN_MESSAGE);
            double C = Double.parseDouble(Celsius1);

            double K = C + 273.15;
            Celsius1 = Double.toString(K);

            JOptionPane.showMessageDialog(null, "The Kelvin temperature is: " + Celsius1);
        }

        else if(x == 2) {
            //Fahrenheit to Celsius
            String Fahrenheit = JOptionPane.showInputDialog(null, "Enter the Fahrenheit temperature: ", "Fahrenheit to Celsius", JOptionPane.PLAIN_MESSAGE);
            double F = Double.parseDouble(Fahrenheit);

            double C = ((F - 32) * 5) / 9;
            Fahrenheit = Double.toString(C);

            JOptionPane.showMessageDialog(null, "The Celsius temperature is: " + Fahrenheit);
        }

        else if (x == 3){
            //Fahrenheit to Kelvin
            String Fahrenheit1 = JOptionPane.showInputDialog(null, "Enter the Fahrenheit temperature: ", "Fahrenheit to Kelvin", JOptionPane.PLAIN_MESSAGE);
            double F = Double.parseDouble(Fahrenheit1);

            double K = (F - 32) * 5 / 9 + 273.15;
            Fahrenheit1 = Double.toString(K);

            JOptionPane.showMessageDialog(null, "The Kelvin temperature is: " + Fahrenheit1);
        }

        else if (x == 4) {
            //Kelvin to Celsius
            String Kelvin = JOptionPane.showInputDialog(null, "Enter the Kelvin temperature: ", "Kelvin to Celsius", JOptionPane.PLAIN_MESSAGE);
            double K = Double.parseDouble(Kelvin);

            double C = K - 273.15;
            Kelvin = Double.toString(C);

            JOptionPane.showMessageDialog(null, "The Celsius temperature is: " + Kelvin);
        }

        else {
            //Kelvin to Fahrenheit
            String Kelvin1 = JOptionPane.showInputDialog(null, "Enter the Kelvin temperature: ", "Kelvin to Fahrenheit", JOptionPane.PLAIN_MESSAGE);
            double K = Double.parseDouble(Kelvin1);

            double F = (K - 273.15) * 9 / 5 + 32;
            Kelvin1 = Double.toString(F);

            JOptionPane.showMessageDialog(null, "The Fahrenheit temperature is: " + Kelvin1);
        }
    }
}