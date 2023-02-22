import javax.swing.*;

public class ProgramaJava {
    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Viação X", "Cidade Tiradentes", 10);

        String t1 = JOptionPane.showInputDialog("digite o texto 1");
        String t2 = JOptionPane.showInputDialog("digite o texto 2");

        int t1n = Integer.parseInt(t1);
        int t2n = Integer.parseInt(t2);

        System.out.println(t1 == t2);
        System.out.println(t1n == t2n);
    }
}
