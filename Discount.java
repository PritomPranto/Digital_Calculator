package oopproject1;

import javax.swing.JOptionPane;

public class Discount {
    {
        double  amount,s;
        String Market = JOptionPane.showInputDialog(null,"Enter Market Price: ", "Discount Calculator", JOptionPane.PLAIN_MESSAGE);
        double markedprice = Double.parseDouble(Market);
        String M = JOptionPane.showInputDialog(null,"Enter discount percentage: ", "Discount Calculator", JOptionPane.PLAIN_MESSAGE);
        double dis = Double.parseDouble(M);
        s=100-dis;

        amount= (s*markedprice)/100;
        String PritheRani = Double.toString(amount);
        JOptionPane.showMessageDialog(null, "Amount after Discount= :" +PritheRani);

    }
}
