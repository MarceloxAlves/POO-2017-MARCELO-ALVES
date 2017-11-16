package Questao2.App;

import Questao2.Model.Circulo;
import Questao2.Model.Ponto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean rodando = true;
        Circulo c1 = new Circulo(new Ponto(0,0));
        while (rodando){
            int op = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "1 - Criar Circulo\n"+
                    "2 - Movimentar Circulo\n"+
                    "3 - Relacao dois Circulos\n"+
                    "4 - Ponto Dentro do Circulo\n"+
                    "0 - Sair"));

            switch (op){
                case 0:
                    rodando = false;
                    break;
                case 1:
                    float X = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao X"));
                    float Y = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao Y"));
                    Ponto p = new Ponto(X,Y);
                    c1 = new Circulo(p);
                    break;
                case 2:
                     X = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao X"));
                     Y = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao Y"));
                     p = new Ponto(X,Y);
                     c1.movimentar(p);
                    break;
                case 3:
                    X = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao X Circulo A"));
                    Y = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao Y Circulo A"));
                    float X2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao X Circulo B"));
                    float Y2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao Y Circulo B"));
                    Circulo c3 = new Circulo(new Ponto(X,Y));
                    Circulo c2 = new Circulo(new Ponto(X2,Y2));
                    c2.relacaoCirculo(c3);
                    break;
                case 4:
                    X = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao X Circulo A"));
                    Y = Float.parseFloat(JOptionPane.showInputDialog("Digite a posicao Y Circulo A"));
                    c1.isInSide(new Ponto(X,Y));
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida!");
            }


        }



    }
}
