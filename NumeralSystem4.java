package oopproject1;
//Hexadecimal to Octal

import javax.swing.JOptionPane;

public class NumeralSystem4
{
    public static int hex2decimal(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    {
        String hexdecnum;
        int decnum, i=1, j;
        int octnum[] = new int[100];


        hexdecnum = JOptionPane.showInputDialog(null, "Input HexaDecimal Number: ", "Numeral System Hex To Oct",JOptionPane.QUESTION_MESSAGE);

        decnum = hex2decimal(hexdecnum);



        while(decnum != 0)
        {
            octnum[i++] = decnum%8;
            decnum = decnum/8;
        }


        for(j=i-1; j>0; j--)
        {
            JOptionPane.showMessageDialog(null,"Equivalent Octal number: "+octnum[j]);
        }
    }
}