package oopproject1;

/**
 * Name    : Pritom Mitra Pranto
 * Address : Sylhet
 * Email   : pritommitra45@gmail.com
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Length //extends JFrame implements ActionListener

{
    /*private JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25;
    private Container c;

   Length(){

        JPD();
    }
    private void JPD (){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);

        a1 = new JButton("M to cm");
        a1.setBounds(10,10,50,80);
        a1.setBackground(Color.PINK);
        c.add(a1);

        a2 = new JButton("M to Km");
        a2.setBounds(10,20,50,80);
        a2.setBackground(Color.RED);
        c.add(a2);

        a3 = new JButton("F to Inch");
        a3.setBounds(10,30,50,80);
        a3.setBackground(Color.darkGray);
        c.add(a3);

        a4 = new JButton("Inch to F");
        a4.setBounds(10,40,50,80);
        a4.setBackground(Color.GRAY);
        c.add(a4);




    }*/

    {

//Add  Options By Using JOptionPane.showOptionDialog ( java swing )

        String[] options = {"M to Cm", "M to Km", "F to In", "In to F","Km to M","Cm to M", "Km to Cm", "F to M",

                "M to F", "In to Cm", "Cm to In", "Cm to F", "F to Cm", "Mm to Cm", "Cm to Mm", "Km to Mi",

                "Mi to Km","Dm to Mm","Mm to Dm", "M to Yr","Yr to M", "Km to Yr","Yr to Km","F to Yr", "Yr to F",

                "Mm to Yr","Yr to Mm","In to Yr","Yr to In","Cm to Yr","Yr to Cm","Dm to Yr","Yr to Dm","Dm to M","M to Dm",

                "Cm to Dm", "Dm to Cm", "Dm to In", "In to In","Dm to F", "F to Dm","Km to Dm", "Dm to Km", "F to Km", "Km to F",

                "Yr to Mi", "Mi to Yr"};

//Get User Input By USing JOptionPane.showInputDialog ( java swing )

        int x = JOptionPane.showOptionDialog(null, "Choise Your Option",

                "Click a button",

                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);


        if(x==0)

        {

//Meter to Centimeter

            double a,b;

            String  meter = JOptionPane.showInputDialog(null, "Enter meter:", "Meter to Centimeter", JOptionPane.PLAIN_MESSAGE);

//Convert Value String to Double

            b = Double.parseDouble(meter);
            a = b*100; //Formula : multiply the length value by 100

//Convert Value Double to String

            String p = Double.toString(a);

//Show Output By USing JOptionPane.showMessegeDialog( java swing )

            JOptionPane.showMessageDialog(null,"Centimeter:"+p);

        }

        else if(x==1)

        {

//Meter to Kilometer

            double c,d;

            String  Meter = JOptionPane.showInputDialog(null, "Enter meter:", "Meter to Kilometer", JOptionPane.PLAIN_MESSAGE);

            d= Double.parseDouble(Meter);
            c = d/1000; //Formula : divide the length value by 1000
            String P = Double.toString(c);
            JOptionPane.showMessageDialog(null,"Kilometer :"+P);

        }

        else if(x==2)

        {

//Feet to inch

            double e,f;

            String  M = JOptionPane.showInputDialog(null, "Enter Feet:", "Feet to Inch", JOptionPane.PLAIN_MESSAGE);
            f= Double.parseDouble(M);
            e = f*12; //Formula : multiply the length value by 12
            String Q = Double.toString(e);
            JOptionPane.showMessageDialog(null,"Inch :"+Q);

        }

        else if(x==3)

        {

//Inch to feet

            double g,h;

            String  N = JOptionPane.showInputDialog(null, "Enter Inch:", "Inch to Feet", JOptionPane.PLAIN_MESSAGE);
            h= Double.parseDouble(N);
            g = h/12; // Formula : divide the length value by 12
            String R = Double.toString(g);
            JOptionPane.showMessageDialog(null,"Feet :"+R);

        }

        else if(x==4)

        {

//Kilometer to Meter

            int i,j;

            String O = JOptionPane.showInputDialog(null, "Enter  Kilomeater", "Kilomeater  to  Meter", JOptionPane.PLAIN_MESSAGE);
            j = Integer.parseInt(O);
            i = j*1000; // Formula : Multiply the length value by 1000.
            String S = Integer.toString(i);
            JOptionPane.showMessageDialog(null, "Meter :"+S);

        }

        else if (x==5)

        {

// Centimeter to  Meter

            double  k,l;

            String W = JOptionPane.showInputDialog(null, "Enter  Centimeter", "Centimeter to Meter", JOptionPane.PLAIN_MESSAGE);
            l = Double.parseDouble(W);
            k = l/100; // Formula : Divide the length value by  100.
            String U = Double.toHexString(k);
            JOptionPane.showMessageDialog(null, "Meter :" +U);

        }

        else if(x==6)

        {

//Kilometer to Centimeter

            double m,n;

            String X = JOptionPane.showInputDialog(null, "Enter  Kilometer", "Kilometer to Centimeter", JOptionPane.PLAIN_MESSAGE);
            n = Double.parseDouble(X);
            m = n*100000; // Formula : Multiply the length value by 100000.
            String V = Double.toString(m);
            JOptionPane.showMessageDialog(null, "Centimeter :" +V);

        }

        else if(x==7)

        {

//Feet to Meter

            double o,p;

            String  Feet = JOptionPane.showInputDialog(null, "Enter Feet:", "Feet to Meter", JOptionPane.PLAIN_MESSAGE);
            p = Double.parseDouble(Feet);
            o = p/3.28; // Formula : Divide the length  value by 3.28
            String W =Double.toString(o);
            JOptionPane.showMessageDialog(null, "Meter :" +W);

        }

        else if(x==8)

        {

//Meter to Feet

            double q,r;

            String  Meter = JOptionPane.showInputDialog(null, "Enter Meter:", "Meter to Feet", JOptionPane.PLAIN_MESSAGE);
            r = Double.parseDouble(Meter);
            q = r*3.28; // Formula : Multiply the length value by 3.28
            String W =Double.toString(q);
            JOptionPane.showMessageDialog(null, "Feet :" +W);

        }

        else if(x==9)

        {

//Inch  to Centimetres

            double s,t;

            String  Inch = JOptionPane.showInputDialog(null, "Enter Inch:", "Inch to Centimeter", JOptionPane.PLAIN_MESSAGE);
            t = Double.parseDouble(Inch);
            s = t*2.54; // Formula : Multiply the length value by 2.54
            String W =Double.toString(s);
            JOptionPane.showMessageDialog(null, "Centimeter :" +W);

        }

        else if(x==10)

        {

//Centimetres to Inch

            double u,v;

            String  Centimeter = JOptionPane.showInputDialog(null, "Enter Centimeter:", "Centimeter to Inch", JOptionPane.PLAIN_MESSAGE);
            v = Double.parseDouble(Centimeter);
            u = v/2.54; // Formula : Divide the length value by 2.54
            String W =Double.toString(u);
            JOptionPane.showMessageDialog(null, "Inch :" +W);

        }

        else if(x==11)

        {

//Centimetres to Feet

            double w,y;

            String  Feet = JOptionPane.showInputDialog(null, "Enter Centimeter:", "Centimeter to Feet", JOptionPane.PLAIN_MESSAGE);
            y = Double.parseDouble(Feet);
            w = y/30.48; // Formula : Divide the length value by 30.48
            String W =Double.toString(w);
            JOptionPane.showMessageDialog(null, "Feet :" +W);

        }

        else if(x==12)

        {

//Feet  to Centimetres

            double s,t;

            String  Feet = JOptionPane.showInputDialog(null, "Enter Feet:", "Feet to Centimeter", JOptionPane.PLAIN_MESSAGE);
            t = Double.parseDouble(Feet);
            s = t*30.48; // Formula : Multiply the length value by 30.48
            String Z =Double.toString(s);
            JOptionPane.showMessageDialog(null, "Centimeter :" +Z);

        }

        else if(x==13)

        {

//Milimeter to Centimetres

            double a,c;

            String  Milimeter = JOptionPane.showInputDialog(null, "Enter Milimeter:", "Milimeter to Centimeter", JOptionPane.PLAIN_MESSAGE);
            c = Double.parseDouble(Milimeter);
            a = c/10; // Formula : Divide thr length value by 10.
            String Q =Double.toString(a);
            JOptionPane.showMessageDialog(null, "Centimeter :" +Q);

        }

        else if(x==14)

        {

//Centimetres to Milimeter

            double b,d;

            String  Centimeter = JOptionPane.showInputDialog(null, "Enter Centimeter:", "Centimeter to Milimeter", JOptionPane.PLAIN_MESSAGE);
            d = Double.parseDouble(Centimeter);
            b = d*10; // Formula : Multiply the length value by 10.
            String I =Double.toString(b);
            JOptionPane.showMessageDialog(null, "Milimeter :" +I);

        }

        else if(x==15)

        {

//Kilometer to  Miles

            double d,e;

            String  Kilometer = JOptionPane.showInputDialog(null, "Enter Kilometer:", "Kilometer to Miles", JOptionPane.PLAIN_MESSAGE);
            e = Double.parseDouble(Kilometer);
            d = e/1.609; // Formula : Divide the length value by 1.609
            String I =Double.toString(d);
            JOptionPane.showMessageDialog(null, "Miles :" +I);

        }

        else if(x==16)

        {

//Miles to kilometer

            double d,g;

            String  Miles = JOptionPane.showInputDialog(null, "Enter Miles:", "Miles to Kilometer", JOptionPane.PLAIN_MESSAGE);
            g = Double.parseDouble(Miles);
            d = g*1.609; // Formula : Multiply  the length value by  1.609
            String J =Double.toString(d);
            JOptionPane.showMessageDialog(null, "Kilometer :" +J);

        }

        else if(x==17)

        {

//Decimete to Milimeter

            double e,h;

            String  Decimeter = JOptionPane.showInputDialog(null, "Enter Decimeter:", "Decimetrer to Milimeter", JOptionPane.PLAIN_MESSAGE);
            h = Double.parseDouble(Decimeter);
            e = h*100; // Formula : multiply the length value by 100
            String L =Double.toString(e);
            JOptionPane.showMessageDialog(null, "Milimeter :" +L);

        }

        else if(x==18)

        {

//Milimeter to Decimeter

            double h,i;

            String  Milimeter = JOptionPane.showInputDialog(null, "Enter Milimeter:", "Milimeter to Decimeter", JOptionPane.PLAIN_MESSAGE);
            i = Double.parseDouble(Milimeter);
            h = i/100; // Formula: devide the  length value by 100
            String A =Double.toString(h);
            JOptionPane.showMessageDialog(null, "Decimeter :" +A);

        }

        else if(x==19)

        {

//Meter to Yard

            double h,i;

            String  Meter = JOptionPane.showInputDialog(null, "Enter Meter:", "Meter to Yard", JOptionPane.PLAIN_MESSAGE);
            i = Double.parseDouble(Meter);
            h = i*1.094; // Formula : multiply the length value by 1.094
            String K =Double.toString(h);
            JOptionPane.showMessageDialog(null, "Yard :" +K);

        }

        else if(x==20)

        {

//Yard  to Meter

            double j,k;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Meter", JOptionPane.PLAIN_MESSAGE);
            k = Double.parseDouble(Yard);
            j = k/1.609; // Formula : devide the length  value by 1.609
            String U =Double.toString(j);
            JOptionPane.showMessageDialog(null, "Meter :" +U);

        }

        else if(x==21)

        {

//Kilometer to Yard

            double j,l;

            String  Kilometer= JOptionPane.showInputDialog(null, "Enter Kilometer:", "kilometer to Yard", JOptionPane.PLAIN_MESSAGE);
            l = Double.parseDouble(Kilometer);
            j = l*1094; // Formula : multiply the length value by 1094
            String U =Double.toString(j);
            JOptionPane.showMessageDialog(null, "Yard :" +U);

        }

        else if(x==22)

        {

//Yard  to Kilometer

            double k, m;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Kilometer", JOptionPane.PLAIN_MESSAGE);
            m = Double.parseDouble(Yard);
            k = m/1094; // Formula: devide the length value by 1094
            String V =Double.toString(k);
            JOptionPane.showMessageDialog(null, "Kilometer :" +V);

        }

        else if(x==23)

        {

//Yard  to Feet

            double p, m;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Feed", JOptionPane.PLAIN_MESSAGE);
            m = Double.parseDouble(Yard);
            p = m*3; // Formula: Multiply the length value by 3
            String M =Double.toString(p);
            JOptionPane.showMessageDialog(null, "Feet :" +M);

        }

        else if(x==24)

        {

//Feet to Yard

            double u, m;

            String  Feet= JOptionPane.showInputDialog(null, "Enter Feet:", "Feed to Yard", JOptionPane.PLAIN_MESSAGE);
            m = Double.parseDouble(Feet);
            u = m/3; // Formula: Divide the length value by 3
            String N =Double.toString(u);
            JOptionPane.showMessageDialog(null, "Yard :" +N);

        }

        else if(x==25)

        {

//Milimeter to Yard

            double n, o;

            String  Milimeter= JOptionPane.showInputDialog(null, "Enter Milimeter:", "Milimeter to Yard", JOptionPane.PLAIN_MESSAGE);
            o = Double.parseDouble(Milimeter);
            n = o/914; // Formula: Divide the length value by 914
            String P =Double.toString(n);
            JOptionPane.showMessageDialog(null, "Yard :" +P);

        }

        else if(x==26)

        {

//Yard to Milimeter

            double w, r;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Milimeter", JOptionPane.PLAIN_MESSAGE);
            r = Double.parseDouble(Yard);
            w = r*914; // Formula: Multiply the length value by 914
            String I =Double.toString(w);
            JOptionPane.showMessageDialog(null, "Milimeter :" +I);

        }

        else if(x==27)

        {

//Inch to Yard

            double u, m;

            String  Inch= JOptionPane.showInputDialog(null, "Enter Inch:", "Inch to Yard", JOptionPane.PLAIN_MESSAGE);
            m = Double.parseDouble(Inch);
            u = m/36; // Formula: Divide the length value by 36
            String N =Double.toString(u);
            JOptionPane.showMessageDialog(null, "Yard :" +N);

        }

        else if(x==28)

        {

//Yard to Inch

            double u, m;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Inch", JOptionPane.PLAIN_MESSAGE);
            m = Double.parseDouble(Yard);
            u = m*36; // Formula: Multiply the length value by 36
            String N =Double.toString(u);
            JOptionPane.showMessageDialog(null, "Inch :" +N);

        }

        else if(x==29)

        {

//Centimeter to Yard

            double u, p;

            String  Centimeter= JOptionPane.showInputDialog(null, "Enter Centimeter:", "Centimeter to Yard", JOptionPane.PLAIN_MESSAGE);
            p = Double.parseDouble(Centimeter);
            u = p/91.44; // Formula: Divide the length value by 91.44
            String Q =Double.toString(u);
            JOptionPane.showMessageDialog(null, "Yard :" +Q);

        }

        else if(x==30)

        {

// Yard to Centimeter

            double k, m;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Centimeter", JOptionPane.PLAIN_MESSAGE);
            m = Double.parseDouble(Yard);
            k = m*91.44; // Formula: Multiply the length value by 91.44
            String T =Double.toString(k);
            JOptionPane.showMessageDialog(null, "Centimeter :" +T);

        }

        else if(x==31)

        {

//Deciimeter to Yard

            double l, p;

            String  Decimeter= JOptionPane.showInputDialog(null, "Enter Decimeter:", "Decimeter to Yard", JOptionPane.PLAIN_MESSAGE);
            p = Double.parseDouble(Decimeter);
            l = p/9.144; // Formula: Divide the length value by 9.144
            String S =Double.toString(l);
            JOptionPane.showMessageDialog(null, "Yard :" +S);

        }

        else if(x==32)

        {

// Yard to Decimeter

            double k, y;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Decimeter", JOptionPane.PLAIN_MESSAGE);
            y = Double.parseDouble(Yard);
            k = y*9.144; // Formula: Multiply the length value by 9.144
            String T =Double.toString(k);
            JOptionPane.showMessageDialog(null, "Deciimeter :" +T);

        }

        else if(x==33)

        {

//Deciimeter to Meter

            double l, i;

            String  Decimeter= JOptionPane.showInputDialog(null, "Enter Decimeter:", "Decimeter to Meter", JOptionPane.PLAIN_MESSAGE);
            i = Double.parseDouble(Decimeter);
            l = i/10; // Formula: Divide the length value by 10
            String R =Double.toString(l);
            JOptionPane.showMessageDialog(null, "Meter :" +R);

        }

        else if(x==34)

        {

// Meter to Decimeter

            double k, y;

            String  Meter= JOptionPane.showInputDialog(null, "Enter Meter:", "Meter to Decimeter", JOptionPane.PLAIN_MESSAGE);
            y = Double.parseDouble(Meter);
            k = y*10; // Formula: Multiply the length value by 10
            String O =Double.toString(k);
            JOptionPane.showMessageDialog(null, "Deciimeter :" +O);

        }

        else if(x==35)

        {

//Centimeter to Decimeter

            double u, a;

            String  Centimeter= JOptionPane.showInputDialog(null, "Enter Centimeter:", "Centimeter to Decimeter", JOptionPane.PLAIN_MESSAGE);
            a = Double.parseDouble(Centimeter);
            u = a/10; // Formula: Divide the length value by 10
            String C =Double.toString(u);
            JOptionPane.showMessageDialog(null, "Decimeter:" +C);

        }

        else if(x==36)

        {

//Decimeter to Centimeter

            double l, j;

            String  Decimeter= JOptionPane.showInputDialog(null, "Enter Decimeter:", "Decimeter to Centimeter", JOptionPane.PLAIN_MESSAGE);
            j = Double.parseDouble(Decimeter);
            l = j*10; // Formula: Multiply the length value by 10
            String R =Double.toString(l);
            JOptionPane.showMessageDialog(null, "Centimeter :" +R);

        }

        else if(x==37)

        {

//Decimeter to Inch

            double q, j;

            String  Decimeter= JOptionPane.showInputDialog(null, "Enter Decimeter:", "Decimeter to Inch", JOptionPane.PLAIN_MESSAGE);
            j = Double.parseDouble(Decimeter);
            q = j*3.937; // Formula: Multiply the length value by 3.937
            String M =Double.toString(q);
            JOptionPane.showMessageDialog(null, "Inch :" +M);

        }

        else if(x==38)

        {

//Inch to Decimeter

            double c, a;

            String  Inch= JOptionPane.showInputDialog(null, "Enter Inch:", "Inch to Decimeter", JOptionPane.PLAIN_MESSAGE);
            a = Double.parseDouble(Inch);
            c = a/3.937; // Formula: Divide the length value by 3.937
            String F =Double.toString(c);
            JOptionPane.showMessageDialog(null, "Decimeter:" +F);

        }

        else if(x==39)

        {

//Decimeter to Feet

            double w, j;

            String  Decimeter= JOptionPane.showInputDialog(null, "Enter Decimeter:", "Decimeter to Feet", JOptionPane.PLAIN_MESSAGE);
            j = Double.parseDouble(Decimeter);
            w = j/3.048; // Formula: Divide the length value by 3.048
            String Q =Double.toString(w);
            JOptionPane.showMessageDialog(null, "Feet :" +Q);

        }

        else if(x==40)

        {

//Inch to Decimeter

            double q, j;

            String  Inch= JOptionPane.showInputDialog(null, "Enter Inch:", "Inch to Decimeter", JOptionPane.PLAIN_MESSAGE);
            j = Double.parseDouble(Inch);
            q = j*3.048; // Formula: Multiply the length value by 3.048
            String E =Double.toString(q);
            JOptionPane.showMessageDialog(null, "Decimeter :" +E);

        }

        else if(x==41)

        {

//Kilometer to Decimeter

            double q, a;

            String  Kilometer= JOptionPane.showInputDialog(null, "Enter Kilometer:", "Kilometer to Decimeter", JOptionPane.PLAIN_MESSAGE);
            a = Double.parseDouble(Kilometer);
            q = a*10000; // Formula: Multiply the length value by 10000
            String T =Double.toString(q);
            JOptionPane.showMessageDialog(null, "Decimeter :" +T);

        }

        else if(x==42)

        {

//Decimeter to FKilometer

            double o, j;

            String  Decimeter= JOptionPane.showInputDialog(null, "Enter Decimeter:", "Decimeter to Kilometer", JOptionPane.PLAIN_MESSAGE);
            j = Double.parseDouble(Decimeter);
            o = j/1000; // Formula: Divide the length value by 10000
            String R =Double.toString(o);
            JOptionPane.showMessageDialog(null, "Kilometer :" +R);

        }

        else if(x==43)

        {

//Feet to Kilometer

            double w, j;

            String  Feet= JOptionPane.showInputDialog(null, "Enter Feet:", "Feet to Kilometer", JOptionPane.PLAIN_MESSAGE);
            j = Double.parseDouble(Feet);
            w = j/3281; // Formula: Divide the length value by 3281
            String Q =Double.toString(w);
            JOptionPane.showMessageDialog(null, "Kilometer :" +Q);

        }

        else if(x==44)

        {

//Kilometer to Feet

            double p, j;

            String  Kilometer= JOptionPane.showInputDialog(null, "Enter Kilometer:", "Kilometer to Feet", JOptionPane.PLAIN_MESSAGE);
            j = Double.parseDouble(Kilometer);
            p = j*3281; // Formula: Multiply the length value by 3281
            String Q =Double.toString(p);
            JOptionPane.showMessageDialog(null, "Feet :" +Q);

        }

        else if(x==45)

        {

//Yard to Mile

            double k, y;

            String  Yard= JOptionPane.showInputDialog(null, "Enter Yard:", "Yard to Mile", JOptionPane.PLAIN_MESSAGE);
            y = Double.parseDouble(Yard);
            k = y/1760; // Formula: Divide the length value by 1760
            String T =Double.toString(k);
            JOptionPane.showMessageDialog(null, "Mile :" +T);

        }

        else if(x==46)

        {

//Mile to Yard

            double l, p;

            String  Mile= JOptionPane.showInputDialog(null, "Enter Decimeter:", "Mile to Yard", JOptionPane.PLAIN_MESSAGE);
            p = Double.parseDouble(Mile);
            l = p*176; // Formula: Multiply the length value by 1760
            String S =Double.toString(l);
            JOptionPane.showMessageDialog(null, "Yard :" +S);

        }

    }

}
