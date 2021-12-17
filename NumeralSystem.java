package oopproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
//Octal to Decimal

public class NumeralSystem {{


    // public static void main(String[] args)
    {
        String[] options = {"Oc to D", "Oc to Hx", "Hx to D", "Hx to Oc", "D to OC", "D to Hx"};

//Get User Input By USing JOptionPane.showInputDialog ( java swing )

        int x = JOptionPane.showOptionDialog(null, "Choise Your Option",

                "Click a button",

                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (x==0){
            String input;
            long octalnum, decimalnum = 0;
            int i = 0;
            input = JOptionPane.showInputDialog(null, "Input Octal Number: ", "Numeral System Oct to Dec",JOptionPane.QUESTION_MESSAGE);
            octalnum = Long.parseLong(input);

            while(octalnum !=0)
            {
                decimalnum = (long)(decimalnum + (octalnum % 10)* Math.pow(8, i++));
                octalnum = octalnum / 10;
            }
            String dec = Long.toString(octalnum);
            JOptionPane.showMessageDialog(null,"Equivalent Decimal number: "+dec);
        }
        else if (x==1){
            String octnum, hexnum;
            int decnum;


            octnum = JOptionPane.showInputDialog(null, "Input Octal Number: ", "Numeral System Oct to Hex",JOptionPane.QUESTION_MESSAGE);
            decnum = Integer.parseInt(octnum, 8);
            hexnum = Integer.toHexString(decnum);


            JOptionPane.showMessageDialog(null,"Equivalent HexaDecimal number: "+hexnum);
        }
        else if (x==2){
            String num = JOptionPane.showInputDialog(null, "Input HexaDecimal Number: ", "Numeral System Hex To Dec",JOptionPane.QUESTION_MESSAGE);

            int num2 = Integer.parseInt(num,16);

            JOptionPane.showMessageDialog(null,"Equivalent HexaDecimal number: "+num2);
        }
        else if (x==3){
            NumeralSystem4 a = new NumeralSystem4();
        }

        else if (x==4){
            String dec = JOptionPane.showInputDialog(null,"Enter a Decimal Number","Numeral System dec to oct",JOptionPane.PLAIN_MESSAGE);
            int num = Integer.parseInt(dec);


            int rem;

            String str="";

            char dig[]={'0','1','2','3','4','5','6','7'};

            while(num>0)
            {
                rem=num%8;
                str=dig[rem]+str;
                num=num/8;
            }

            JOptionPane.showMessageDialog(null,"Octal Number : "+str);

        }

        else if(x==5){
            String dec = JOptionPane.showInputDialog(null,"Enter a Decimal Number: ","NUmeral System dec to hex", JOptionPane.PLAIN_MESSAGE);
            int num =Integer.parseInt(dec);

            int rem;

            String str2="";
            char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

            while(num>0)
            {
                rem=num%16;
                str2=hex[rem]+str2;
                num=num/16;
            }
            JOptionPane.showMessageDialog(null,"HexaDecimal Number: "+str2);

        }
    }}}

