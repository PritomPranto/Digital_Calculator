package oopproject1;
import javax.swing.JOptionPane;

/*
    @Owner: Md. Shazadur Rahman
    Id. No: 1932020013
*/

public class DataConverter {


    {

        String[] options = {"Byte to KB", "Byte to MB", "Byte to GB", "Byte to TB", "KB to Byte", "KB to MB", "KB to GB", "KB to TB", "MB to Byte", "MB to KB", "MB to GB", "MB to TB", "GB to Byte", "GB to KB", "GB to MB", "GB to TB"};

        int x = JOptionPane.showOptionDialog(null, "Your choice", "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (x == 0){
            //bytes to Kilobyte
            String bytes1 = JOptionPane.showInputDialog(null, "Enter the bytes: ", "bytes to Kilobyte", JOptionPane.PLAIN_MESSAGE);
            double bytes = Double.parseDouble(bytes1);

            double KB = bytes / 1024;
            bytes1 = Double.toString(KB);

            JOptionPane.showMessageDialog(null, "The KB is: " + bytes1);
        }

        else if (x == 1) {
            //bytes to Megabyte
            String bytes1 = JOptionPane.showInputDialog(null, "Enter the bytes: ", "bytes to Megabyte", JOptionPane.PLAIN_MESSAGE);
            double bytes = Double.parseDouble(bytes1);

            double MB = bytes / 1048576;
            bytes1 = Double.toString(MB);

            JOptionPane.showMessageDialog(null, "The MB is: " + bytes1);
        }

        else if (x == 2) {
            //bytes to Gigabyte
            String bytes1 = JOptionPane.showInputDialog(null, "Enter the bytes: ", "bytes to Gigabyte", JOptionPane.PLAIN_MESSAGE);
            double bytes = Double.parseDouble(bytes1);

            double GB = bytes / 1073741824;
            bytes1 = Double.toString(GB);

            JOptionPane.showMessageDialog(null, "The GB is: " + bytes1);
        }

        else if (x == 3) {
            //bytes to Terabyte
            String bytes1 = JOptionPane.showInputDialog(null, "Enter the bytes: ", "bytes to Terabyte", JOptionPane.PLAIN_MESSAGE);
            double bytes = Double.parseDouble(bytes1);

            double TB = bytes / 109951162;
            bytes1 = Double.toString(TB);

            JOptionPane.showMessageDialog(null, "The TB is: " + bytes1);
        }

        else if (x == 4) {
            //Kilobyte to bytes
            String Kilobyte = JOptionPane.showInputDialog(null, "Enter the KB: ", "Kilobyte to bytes", JOptionPane.PLAIN_MESSAGE);
            double KB = Double.parseDouble(Kilobyte);

            double bytes = KB * 1024;
            Kilobyte = Double.toString(bytes);

            JOptionPane.showMessageDialog(null, "The bytes is: " + Kilobyte);
        }

        else if (x == 5) {
            //Kilobyte to Megabyte
            String Kilobyte = JOptionPane.showInputDialog(null, "Enter the KB: ", "Kilobyte to Megabyte", JOptionPane.PLAIN_MESSAGE);
            double KB = Double.parseDouble(Kilobyte);

            double MB = (KB * 1024) / 1048576;
            Kilobyte = Double.toString(MB);

            JOptionPane.showMessageDialog(null, "The MB is: " + Kilobyte);
        }

        else if (x == 6) {
            //Kilobyte to Gigabyte
            String Kilobyte = JOptionPane.showInputDialog(null, "Enter the KB: ", "Kilobyte to Gigabyte", JOptionPane.PLAIN_MESSAGE);
            double KB = Double.parseDouble(Kilobyte);

            double GB = KB / 1048576;
            Kilobyte = Double.toString(GB);

            JOptionPane.showMessageDialog(null, "The GB is: " + Kilobyte);
        }

        else if (x == 7) {
            //Kilobyte to Terabyte
            String Kilobyte = JOptionPane.showInputDialog(null, "Enter the KB: ", "Kilobyte to Terabyte", JOptionPane.PLAIN_MESSAGE);
            double KB = Double.parseDouble(Kilobyte);

            double TB = KB / 1.07374182;
            Kilobyte = Double.toString(TB);

            JOptionPane.showMessageDialog(null, "The TB is: " + Kilobyte);
        }

        else if (x == 8) {
            //Megabyte to byte
            String Megabyte = JOptionPane.showInputDialog(null, "Enter the  MB: ", "Megabyte to byte", JOptionPane.PLAIN_MESSAGE);
            Double MB = Double.parseDouble(Megabyte);

            Double bytes = MB * 1048576;
            Megabyte = Double.toString(bytes);

            JOptionPane.showMessageDialog(null, "The byte is: " + Megabyte);
        }

        else if (x == 9) {
            //Megabyte to Kilobyte
            String Megabyte = JOptionPane.showInputDialog(null, "Enter the  MB: ", "Megabyte to Kilobyte", JOptionPane.PLAIN_MESSAGE);
            double MB = Double.parseDouble(Megabyte);

            double KB = MB * 1024;
            Megabyte = Double.toString(KB);

            JOptionPane.showMessageDialog(null, "The KB is: " + Megabyte);
        }

        else if (x == 10) {
            //Megabyte to Gigabyte
            String Megabyte = JOptionPane.showInputDialog(null, "Enter the  MB: ", "Megabyte to Gigabyte", JOptionPane.PLAIN_MESSAGE);
            double MB = Double.parseDouble(Megabyte);

            double GB = MB / 1024;
            Megabyte = Double.toString(GB);

            JOptionPane.showMessageDialog(null, "The GB is: " + Megabyte);
        }

        else if (x == 11) {
            //Megabyte to Terabyte
            String Megabyte = JOptionPane.showInputDialog(null, "Enter the  MB: ", "Megabyte to Terabyte", JOptionPane.PLAIN_MESSAGE);
            double MB = Double.parseDouble(Megabyte);

            double TB = MB / 1048576;
            Megabyte = Double.toString(TB);

            JOptionPane.showMessageDialog(null, "The TB is: " + Megabyte);
        }

        else if (x == 12) {
            //Gigabyte to byte
            String Gigabyte = JOptionPane.showInputDialog(null, "Enter the GB: ", "Gigabyte to byte", JOptionPane.PLAIN_MESSAGE);
            double GB = Double.parseDouble(Gigabyte);

            double bytes = GB * 1073741824;
            Gigabyte = Double.toString(bytes);

            JOptionPane.showMessageDialog(null, "The byte is: " + Gigabyte);
        }

        else if (x == 13) {
            //Gigabyte to Kilobyte
            String Gigabyte = JOptionPane.showInputDialog(null, "Enter the GB: ", "Gigabyte to Kilobyte", JOptionPane.PLAIN_MESSAGE);
            double GB = Double.parseDouble(Gigabyte);

            double KB = GB * 1048576;
            Gigabyte = Double.toString(KB);

            JOptionPane.showMessageDialog(null, "The KB is: " + Gigabyte);
        }

        else if (x == 14) {
            //Gigabyte to Megabyte
            String Gigabyte = JOptionPane.showInputDialog(null, "Enter the GB: ", "Gigabyte to Megabyte", JOptionPane.PLAIN_MESSAGE);
            double GB = Double.parseDouble(Gigabyte);

            double MB = GB * 1024;
            Gigabyte = Double.toString(MB);

            JOptionPane.showMessageDialog(null, "The MB is: " + Gigabyte);
        }

        else {
            //Gigabyte to Terabyte
            String Gigabyte = JOptionPane.showInputDialog(null, "Enter the GB: ", "Gigabyte to Terabyte", JOptionPane.PLAIN_MESSAGE);
            Double GB = Double.parseDouble(Gigabyte);

            Double TB = GB / 1024;
            Gigabyte = Double.toString(TB);

            JOptionPane.showMessageDialog(null, "The TB is: " + Gigabyte);
        }
    }
}