package oopproject1;
import javax.swing.JOptionPane;


public class CurrencyConverter {

    {

        String[] options = {"Tk to Dollar", "Tk to Yuan", "Tk to Pound", "Tk to Euro", "Tk to Rupee", "Tk to Riyal", "Dollar to Tk", "Dollar to Yuan", "Dollar to Pound", "Dollar to Euro", "Dollar to Rupee", "Dollar to Riyal",
                "Yuan to Taka", " Yuan to Dollar", "Yuan to Pound", "Yuan to Euro", "Yuan to Rupee", "Yuan to Riyal", "Pound to Taka", "Pound to Dollar", "Pound to Yuan", "Pound to Euro",
                "Pound to Rupee", "Pound to Riyal", "Euro to Tk", "Euro to Dollar", "Euro to Yuan", "Euro to Pound", "Euro to Rupee", "Euro to Riyal", "Rupee to Tk", "Rupee to Dollar", "Rupee to Yuan", "Rupee to Pound",
                "Rupee to Euro", "Rupee to Riyal", "Riyal to Taka", "Riyal to Dollar", "Riyal to Yuan", "Riyal to Pound", "Riyal to Euro", "Riyal to Rupee"};

        int x = JOptionPane.showOptionDialog(null, "Your choice", "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (x == 0) {
            //Taka to Dollar
            String Taka1 = JOptionPane.showInputDialog(null, "Enter the amount of Taka: ", "Taka to Dollar", JOptionPane.PLAIN_MESSAGE);
            double Taka = Double.parseDouble(Taka1);

            double Dollar = Taka * 0.012;
            Taka1 = Double.toString(Dollar);

            JOptionPane.showMessageDialog(null, "The Dollar is: " + Taka1);
        }

        else if (x == 1) {
            //Taka to Chinese Yuan
            String Taka1 = JOptionPane.showInputDialog(null, "Enter the amount of Taka: ", "Taka to Chinese Yuan", JOptionPane.PLAIN_MESSAGE);
            double Taka = Double.parseDouble(Taka1);

            double ChineseYuan = Taka * 0.076;
            Taka1 = Double.toString(ChineseYuan);

            JOptionPane.showMessageDialog(null, "The Chinese Yuan is: " + Taka1);
        }

        else if (x == 2) {
            //Taka to Pound
            String Taka1 = JOptionPane.showInputDialog(null, "Enter the amount of Taka: ", "Taka to Pound", JOptionPane.PLAIN_MESSAGE);
            double Taka = Double.parseDouble(Taka1);

            double Pound = Taka * 0.0086;
            Taka1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + Taka1);
        }

        else if (x == 3) {
            //Taka to Euro
            String Taka1 = JOptionPane.showInputDialog(null, "Enter the amount of Taka: ", "Taka to Euro", JOptionPane.PLAIN_MESSAGE);
            double Taka = Double.parseDouble(Taka1);

            double Euro = Taka * 0.0100;
            Taka1 = Double.toString(Euro);

            JOptionPane.showMessageDialog(null, "The Euro is: " + Taka1);
        }

        else if (x == 4) {
            //Taka to Rupee
            String Taka1 = JOptionPane.showInputDialog(null, "Enter the amount of Taka: ", "Taka to Rupee", JOptionPane.PLAIN_MESSAGE);
            double Taka = Double.parseDouble(Taka1);

            double Rupee = Taka * 0.086;
            Taka1 = Double.toString(Rupee);

            JOptionPane.showMessageDialog(null, "The Rupee is: " + Taka1);
        }

        else if (x == 5) {
            //Taka to Saudi Riyal
            String Taka1 = JOptionPane.showInputDialog(null, "Enter the amount of Taka: ", "Taka to Saudi Riyal", JOptionPane.PLAIN_MESSAGE);
            double Taka = Double.parseDouble(Taka1);

            double SaudiRiyal = Taka * 0.044;
            Taka1 = Double.toString(SaudiRiyal);

            JOptionPane.showMessageDialog(null, "The Saudi Riyal is: " + Taka1);
        }

        else if (x == 6) {
            //Dollar to Taka
            String Dollar1 = JOptionPane.showInputDialog(null, "Enter the amount of Dollar: ", "Dollar to Taka", JOptionPane.PLAIN_MESSAGE);
            double Dollar = Double.parseDouble(Dollar1);

            double Taka = Dollar * 85.40;
            Dollar1 = Double.toString(Taka);

            JOptionPane.showMessageDialog(null, "The Saudi Riyal is: " + Dollar1);
        }

        else if (x == 7) {
            //Dollar to Chinese Yuan
            String Dollar1 = JOptionPane.showInputDialog(null, "Enter the amount of Dollar: ", "Dollar to Chinese Yuan", JOptionPane.PLAIN_MESSAGE);
            double Dollar = Double.parseDouble(Dollar1);

            double ChineseYuan = Dollar * 6.46;
            Dollar1 = Double.toString(ChineseYuan);

            JOptionPane.showMessageDialog(null, "The Chinese Yuan is: " + Dollar1);
        }

        else if (x == 8) {
            //Dollar to Pound
            String Dollar1 = JOptionPane.showInputDialog(null, "Enter the amount of Dollar: ", "Dollar to Pound", JOptionPane.PLAIN_MESSAGE);
            double Dollar = Double.parseDouble(Dollar1);

            double Pound = Dollar * 0.73;
            Dollar1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + Dollar1);
        }

        else if (x == 9) {
            //Dollar to Euro
            String Dollar1 = JOptionPane.showInputDialog(null, "Enter the amount of Dollar: ", "Dollar to Euro", JOptionPane.PLAIN_MESSAGE);
            double Dollar = Double.parseDouble(Dollar1);

            double Euro = Dollar * 0.85;
            Dollar1 = Double.toString(Euro);

            JOptionPane.showMessageDialog(null, "The Euro is: " + Dollar1);
        }

        else if (x == 10) {
            //Dollar to Rupee
            String Dollar1 = JOptionPane.showInputDialog(null, "Enter the amount of Dollar: ", "Dollar to Rupee", JOptionPane.PLAIN_MESSAGE);
            double Dollar = Double.parseDouble(Dollar1);

            double Rupee = Dollar * 73.82;
            Dollar1 = Double.toString(Rupee);

            JOptionPane.showMessageDialog(null, "The Rupee is: " + Dollar1);
        }

        else if (x == 11){
            //Dollar to Saudi Riyal
            String Dollar1 = JOptionPane.showInputDialog(null, "Enter the amount of Dollar: ", "Dollar to Saudi Riyal", JOptionPane.PLAIN_MESSAGE);
            double Dollar = Double.parseDouble(Dollar1);

            double SaudiRiyal = Dollar * 3.75;
            Dollar1 = Double.toString(SaudiRiyal);

            JOptionPane.showMessageDialog(null, "The Saudi Riyal is: " + Dollar1);
        }

        else if (x == 12){
            //Chinese Yuan to Taka
            String ChineseYuan1 = JOptionPane.showInputDialog(null, "Enter the amount of Chinese Yuan: ", "Chinese Yuan to Taka", JOptionPane.PLAIN_MESSAGE);
            double ChineseYuan = Double.parseDouble(ChineseYuan1);

            double Taka = ChineseYuan * 13.21;
            ChineseYuan1 = Double.toString(Taka);

            JOptionPane.showMessageDialog(null, "The Taka is: " + ChineseYuan1);
        }

        else if (x == 13){
            //Chinese Yuan to Dollar
            String ChineseYuan1 = JOptionPane.showInputDialog(null, "Enter the amount of Chinese Yuan: ", "Chinese Yuan to Dollar", JOptionPane.PLAIN_MESSAGE);
            double ChineseYuan = Double.parseDouble(ChineseYuan1);

            double Dollar = ChineseYuan * 0.15;
            ChineseYuan1 = Double.toString(Dollar);

            JOptionPane.showMessageDialog(null, "The Dollar is: " + ChineseYuan1);
        }

        else if (x == 14){
            //Chinese Yuan to Pound
            String ChineseYuan1 = JOptionPane.showInputDialog(null, "Enter the amount of Chinese Yuan: ", "Chinese Yuan to Pound", JOptionPane.PLAIN_MESSAGE);
            double ChineseYuan = Double.parseDouble(ChineseYuan1);

            double Pound = ChineseYuan * 0.11;
            ChineseYuan1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + ChineseYuan1);
        }

        else if (x == 15){
            //Chinese Yuan to Euro
            String ChineseYuan1 = JOptionPane.showInputDialog(null, "Enter the amount of Chinese Yuan: ", "Chinese Yuan to Euro", JOptionPane.PLAIN_MESSAGE);
            double ChineseYuan = Double.parseDouble(ChineseYuan1);

            double Euro = ChineseYuan * 0.13;
            ChineseYuan1 = Double.toString(Euro);

            JOptionPane.showMessageDialog(null, "The Euro is: " + ChineseYuan1);
        }

        else if (x == 16){
            //Chinese Yuan to Rupee
            String ChineseYuan1 = JOptionPane.showInputDialog(null, "Enter the amount of Chinese Yuan: ", "Chinese Yuan to Rupee", JOptionPane.PLAIN_MESSAGE);
            double ChineseYuan = Double.parseDouble(ChineseYuan1);

            double Rupee = ChineseYuan * 11.42;
            ChineseYuan1 = Double.toString(Rupee);

            JOptionPane.showMessageDialog(null, "The Rupee is: " + ChineseYuan1);
        }

        else if (x == 17){
            //Chinese Yuan to Saudi Riyal
            String ChineseYuan1 = JOptionPane.showInputDialog(null, "Enter the amount of Chinese Yuan: ", "Chinese Yuan to Saudi Riyal", JOptionPane.PLAIN_MESSAGE);
            double ChineseYuan = Double.parseDouble(ChineseYuan1);

            double SaudiRiyal = ChineseYuan * 0.58;
            ChineseYuan1 = Double.toString(SaudiRiyal);

            JOptionPane.showMessageDialog(null, "The Saudi Riyal is: " + ChineseYuan1);
        }

        else if (x == 18){
            //Pound to Taka
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the amount of Pound: ", "Pound to Taka", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double Taka = Pound * 116.66;
            Pound1 = Double.toString(Taka);

            JOptionPane.showMessageDialog(null, "The Taka is: " + Pound1);
        }

        else if (x == 19){
            //Pound to Dollar
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the amount of Pound: ", "Pound to Dollar", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double Dollar = Pound * 1.37;
            Pound1 = Double.toString(Dollar);

            JOptionPane.showMessageDialog(null, "The Dollar is: " + Pound1);
        }

        else if (x == 20){
            //Pound to Chinese Yuan
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the amount of Pound: ", "Pound to Chinese Yuan", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double ChineseYuan = Pound * 8.82;
            Pound1 = Double.toString(ChineseYuan);

            JOptionPane.showMessageDialog(null, "The Chinese Yuan is: " + Pound1);
        }

        else if (x == 21){
            //Pound to Euro
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the amount of Pound: ", "Pound to Euro", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double Euro = Pound * 1.16;
            Pound1 = Double.toString(Euro);

            JOptionPane.showMessageDialog(null, "The Euro is: " + Pound1);
        }

        else if (x == 22){
            //Pound to Rupee
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the amount of Pound: ", "Pound to Rupee", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double Rupee = Pound * 100.78;
            Pound1 = Double.toString(Rupee);

            JOptionPane.showMessageDialog(null, "The Rupee is: " + Pound1);
        }

        else if (x == 23){
            //Pound to Saudi Riyal
            String Pound1 = JOptionPane.showInputDialog(null, "Enter the amount of Pound: ", "Pound to Saudi Riyal", JOptionPane.PLAIN_MESSAGE);
            double Pound = Double.parseDouble(Pound1);

            double SaudiRiyal = Pound * 5.12;
            Pound1 = Double.toString(SaudiRiyal);

            JOptionPane.showMessageDialog(null, "The Saudi Riyal is: " + Pound1);
        }

        else if (x == 24){
            //Euro to Taka
            String Euro1 = JOptionPane.showInputDialog(null, "Enter the amount of Euro: ", "Euro to Taka", JOptionPane.PLAIN_MESSAGE);
            double Euro = Double.parseDouble(Euro1);

            double Taka = Euro * 100.22;
            Euro1 = Double.toString(Taka);

            JOptionPane.showMessageDialog(null, "The Taka is: " + Euro1);
        }

        else if (x == 25){
            //Euro to Dollar
            String Euro1 = JOptionPane.showInputDialog(null, "Enter the amount of Euro: ", "Euro to Dollar", JOptionPane.PLAIN_MESSAGE);
            double Euro = Double.parseDouble(Euro1);

            double Dollar = Euro * 1.17;
            Euro1 = Double.toString(Dollar);

            JOptionPane.showMessageDialog(null, "The Dollar is: " + Euro1);
        }

        else if (x == 26){
            //Euro to Chinese Yuan
            String Euro1 = JOptionPane.showInputDialog(null, "Enter the amount of Euro: ", "Euro to Chinese Yuan", JOptionPane.PLAIN_MESSAGE);
            double Euro = Double.parseDouble(Euro1);

            double ChineseYuan = Euro * 7.59;
            Euro1 = Double.toString(ChineseYuan);

            JOptionPane.showMessageDialog(null, "The Chinese Yuan is: " + Euro1);
        }

        else if (x == 27){
            //Euro to Pound
            String Euro1 = JOptionPane.showInputDialog(null, "Enter the amount of Euro: ", "Euro to Pound", JOptionPane.PLAIN_MESSAGE);
            double Euro = Double.parseDouble(Euro1);

            double Pound = Euro * 0.86;
            Euro1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + Euro1);
        }

        else if (x == 28){
            //Euro to Rupee
            String Euro1 = JOptionPane.showInputDialog(null, "Enter the amount of Euro: ", "Euro to Rupee", JOptionPane.PLAIN_MESSAGE);
            double Euro = Double.parseDouble(Euro1);

            double Rupee = Euro * 86.64;
            Euro1 = Double.toString(Rupee);

            JOptionPane.showMessageDialog(null, "The Rupee is: " + Euro1);
        }

        else if (x == 29){
            //Euro to Saudi Riyal
            String Euro1 = JOptionPane.showInputDialog(null, "Enter the amount of Euro: ", "Euro to Saudi Riyal", JOptionPane.PLAIN_MESSAGE);
            double Euro = Double.parseDouble(Euro1);

            double SaudiRiyal = Euro * 4.40;
            Euro1 = Double.toString(SaudiRiyal);

            JOptionPane.showMessageDialog(null, "The Saudi Riyal is: " + Euro1);
        }

        else if (x == 30){
            //Rupee to Taka
            String Rupee1 = JOptionPane.showInputDialog(null, "Enter the amount of Rupee: ", "Rupee to Taka", JOptionPane.PLAIN_MESSAGE);
            double Rupee = Double.parseDouble(Rupee1);

            double Taka = Rupee * 1.16;
            Rupee1 = Double.toString(Taka);

            JOptionPane.showMessageDialog(null, "The Taka is: " + Rupee1);
        }

        else if (x == 31){
            //Rupee to Dollar
            String Rupee1 = JOptionPane.showInputDialog(null, "Enter the amount of Rupee: ", "Rupee to Dollar", JOptionPane.PLAIN_MESSAGE);
            double Rupee = Double.parseDouble(Rupee1);

            double Dollar = Rupee * 0.014;
            Rupee1 = Double.toString(Dollar);

            JOptionPane.showMessageDialog(null, "The Dollar is: " + Rupee1);
        }

        else if (x == 32){
            //Rupee to Chinese Yuan
            String Rupee1 = JOptionPane.showInputDialog(null, "Enter the amount of Rupee: ", "Rupee to Chinese Yuan", JOptionPane.PLAIN_MESSAGE);
            double Rupee = Double.parseDouble(Rupee1);

            double ChineseYuan = Rupee * 0.088;
            Rupee1 = Double.toString(ChineseYuan);

            JOptionPane.showMessageDialog(null, "The Chinese Yuan is: " + Rupee1);
        }

        else if (x == 33){
            //Rupee to Pound
            String Rupee1 = JOptionPane.showInputDialog(null, "Enter the amount of Rupee: ", "Rupee to Pound", JOptionPane.PLAIN_MESSAGE);
            double Rupee = Double.parseDouble(Rupee1);

            double Pound = Rupee * 0.0099;
            Rupee1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + Rupee1);
        }

        else if (x == 34){
            //Rupee to Euro
            String Rupee1 = JOptionPane.showInputDialog(null, "Enter the amount of Rupee: ", "Rupee to Euro", JOptionPane.PLAIN_MESSAGE);
            double Rupee = Double.parseDouble(Rupee1);

            double Euro = Rupee * 0.012;
            Rupee1 = Double.toString(Euro);

            JOptionPane.showMessageDialog(null, "The Euro is: " + Rupee1);
        }

        else if (x == 35){
            //Rupee to Saudi Riyal
            String Rupee1 = JOptionPane.showInputDialog(null, "Enter the amount of Rupee: ", "Rupee to Saudi Riyal", JOptionPane.PLAIN_MESSAGE);
            double Rupee = Double.parseDouble(Rupee1);

            double SaudiRiyal = Rupee * 0.051;
            Rupee1 = Double.toString(SaudiRiyal);

            JOptionPane.showMessageDialog(null, "The Saudi Riyal is: " + Rupee1);
        }

        else if (x == 36){
            //Saudi Riyal to Taka
            String SaudiRiyal1 = JOptionPane.showInputDialog(null, "Enter the amount of Saudi Riyal: ", "Saudi Riyal to Taka", JOptionPane.PLAIN_MESSAGE);
            double SaudiRiyal = Double.parseDouble(SaudiRiyal1);

            double Taka = SaudiRiyal * 22.77;
            SaudiRiyal1 = Double.toString(Taka);

            JOptionPane.showMessageDialog(null, "The Taka is: " + SaudiRiyal1);
        }

        else if (x == 37){
            //Saudi Riyal to Dollar
            String SaudiRiyal1 = JOptionPane.showInputDialog(null, "Enter the amount of Saudi Riyal: ", "Saudi Riyal to Dollar", JOptionPane.PLAIN_MESSAGE);
            double SaudiRiyal = Double.parseDouble(SaudiRiyal1);

            double Dollar = SaudiRiyal * 0.27;
            SaudiRiyal1 = Double.toString(Dollar);

            JOptionPane.showMessageDialog(null, "The Dollar is: " + SaudiRiyal1);
        }

        else if (x == 38){
            //Saudi Riyal to Chinese Yuan
            String SaudiRiyal1 = JOptionPane.showInputDialog(null, "Enter the amount of Saudi Riyal: ", "Saudi Riyal to Chinese Yuan", JOptionPane.PLAIN_MESSAGE);
            double SaudiRiyal = Double.parseDouble(SaudiRiyal1);

            double ChineseYuan = SaudiRiyal * 1.72;
            SaudiRiyal1 = Double.toString(ChineseYuan);

            JOptionPane.showMessageDialog(null, "The Chinese Yuan is: " + SaudiRiyal1);
        }

        else if (x == 39){
            //Saudi Riyal to Pound
            String SaudiRiyal1 = JOptionPane.showInputDialog(null, "Enter the amount of Saudi Riyal: ", "Saudi Riyal to Pound", JOptionPane.PLAIN_MESSAGE);
            double SaudiRiyal = Double.parseDouble(SaudiRiyal1);

            double Pound = SaudiRiyal * 0.20;
            SaudiRiyal1 = Double.toString(Pound);

            JOptionPane.showMessageDialog(null, "The Pound is: " + SaudiRiyal1);
        }

        else if (x == 40){
            //Saudi Riyal to Euro
            String SaudiRiyal1 = JOptionPane.showInputDialog(null, "Enter the amount of Saudi Riyal: ", "Saudi Riyal to Euro", JOptionPane.PLAIN_MESSAGE);
            double SaudiRiyal = Double.parseDouble(SaudiRiyal1);

            double Euro = SaudiRiyal * 0.23;
            SaudiRiyal1 = Double.toString(Euro);

            JOptionPane.showMessageDialog(null, "The Euro is: " + SaudiRiyal1);
        }

        else if (x == 41){
            //Saudi Riyal to Rupee
            String SaudiRiyal1 = JOptionPane.showInputDialog(null, "Enter the amount of Saudi Riyal: ", "Saudi Riyal to Rupee", JOptionPane.PLAIN_MESSAGE);
            double SaudiRiyal = Double.parseDouble(SaudiRiyal1);

            double Rupee = SaudiRiyal * 19.68;
            SaudiRiyal1 = Double.toString(Rupee);

            JOptionPane.showMessageDialog(null, "The Rupee is: " + SaudiRiyal1);
        }
    }
}