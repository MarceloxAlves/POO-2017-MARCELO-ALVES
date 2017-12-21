package Banco.model;

import javax.swing.*;

public class Evento {
    public int getInt(String label) {
       return Integer.parseInt(JOptionPane.showInputDialog(label));
    }

    public String getString(String label) {
        return JOptionPane.showInputDialog(label);
    }


    public double getDouble(String valor) {
        return Double.parseDouble(JOptionPane.showInputDialog(valor));
    }
}
