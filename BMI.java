package oopproject1;
import javax.swing.JOptionPane;
public class BMI {
    {

        String W = JOptionPane.showInputDialog(null,"Enter Your Weight(KG): ", "BMI",JOptionPane.PLAIN_MESSAGE);
        double w = Double.parseDouble(W);
        String H = JOptionPane.showInputDialog(null,"Enter Your Height(cm): ", "BMI",JOptionPane.PLAIN_MESSAGE);
        double h = Double.parseDouble(H);
        h = h / 100;

        double Pritherani = w / (h * h);
        String PritheRani = Double.toString(Pritherani);

        String b;

        if (Pritherani < 18.5) {

            JOptionPane.showMessageDialog(null, "Less than 18.5");
            b = "Underweight";
        } else if ((Pritherani) >= 18.5 || (Pritherani) <= 24.9) {

            JOptionPane.showMessageDialog(null, "Between 18.5 and 24.9");
            b = "Normal";
        } else if (Pritherani >= 25 || Pritherani <= 29.9) {

            JOptionPane.showMessageDialog(null, "Between 25 and 29.9");
            b = "Overweight";
        } else {

            JOptionPane.showMessageDialog(null, "Greater than 30");
            b = "Obese";
        }
        JOptionPane.showMessageDialog(null, "BMI: "+PritheRani + "("+b+")");


    }
}