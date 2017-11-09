import Desafios.Desafios4;
import capitulo2.Capitulo2;
import capitulo3.Capitulo3;
import capitulo4.GestaoPessoal;
import javafx.application.Application;

import javax.swing.*;


public class Main {
    public static void main(String[] args){
        boolean rodando = true;
        while (rodando){
            int op = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "*************** ATIVIDADE A *************** \n" +
                    "2 - Atividade Capitulo 2\n" +
                    "3 - Atividade Capitulo 3\n" +
                    "4 - Atividade Capitulo 4\n" +
                    "0 - Sair\n" +
                    ""));

            switch (op){
                case 2:
                    Capitulo2 cp2 = new Capitulo2();
                    break;
                case 3:
                    Capitulo3 cp3 = new Capitulo3();
                    break;
                case 4:
                    GestaoPessoal gp = new GestaoPessoal();
                    Desafios4 df = new Desafios4();
                    break;
                case 0:
                    rodando =  false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }

    }
}
