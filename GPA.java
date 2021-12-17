package oopproject1;

import javax.swing.JOptionPane;

public class GPA
{


    {
        String N = JOptionPane.showInputDialog(null,"Total Subjects: ", "CGPA Calculator", JOptionPane.PLAIN_MESSAGE);
        int n = Integer.parseInt(N);
        double[] marks=new double[n];

        System.out.println("Enter marks");


        for(int i=0;i<n;i++)
        {
            String Na = JOptionPane.showInputDialog(null,"Mark : ", "CGPA Calculator", JOptionPane.PLAIN_MESSAGE);
            marks[i]=Double.parseDouble(Na);
        }

        double grade[]=new double[n];

        double cgpa,sum=0;

        for(int i=0;i<n;i++)
        {
            grade[i]=(marks[i]/10) ;
        }

        for(int i=0;i<n;i++)
        {
            sum+=grade[i];
        }

        cgpa=sum/n;

        JOptionPane.showMessageDialog(null, "Your CGPA :" +cgpa);
        JOptionPane.showMessageDialog(null, "Your CGPA :" +cgpa*9.5);
    }

}