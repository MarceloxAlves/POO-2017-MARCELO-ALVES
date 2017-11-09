package capitulo2;

import javax.swing.*;

public class Capitulo2 {

    public Capitulo2() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("" +
                "*************** CAPITULO 2  *************** \n" +
                "1 - Questão Saudação\n" +
                "2 - Questão 2 System.out\n" +
                "3 - Questão usando /n" +
                ""));
        switch (op) {
            case 1:
                saudar("Olá Bem vindo!");
                break;
            case 2:
                Questao2();
                break;
            case 3:
                Questao3();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
    }


    //Questão 1
    public void saudar(String saudacao){
        JOptionPane.showMessageDialog(null, saudacao);
    }

    //Questão 2
    public void Questao2(){

        System.out.println("Bem");
        System.out.println("Vindo");
    }

    //Questão 1
    public void Questao3(){

        System.out.println("Bem\n");
        System.out.println("Vindo\n");
    }

}
