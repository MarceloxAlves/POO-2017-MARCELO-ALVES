package Questao1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean rodando = true;
        ArCondicionado ar = new ArCondicionado(123);
        while (rodando){
            int op = Integer.parseInt(JOptionPane.showInputDialog("" +
                    ar.Display()+"\n"+
                    "1 - Ligar/Desligar\n"+
                    "2 - Modo\n"+
                    "3 - Aumentar Temperatura\n"+
                    "4 - Diminiuir Temperatura\n" +
                    "5 - Aumentar Velocidade\n" +
                    "6 - Diminuir Velocidade\n" +
                    "0 - Sair"));

            switch (op){
                case 0:
                    rodando = false;
                    break;
                case 1:
                    ar.setLigado();
                    break;
                case 2:
                    ar.setModo();
                    break;
                case 3:
                    ar.setTemperatura(1);
                    break;
                case 4:
                    ar.setTemperatura(-1);
                    break;
                case 5:
                    ar.setVelocidade(1);
                    break;
                case 6:
                    ar.setVelocidade(-1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida!");
            }


        }



    }
}
