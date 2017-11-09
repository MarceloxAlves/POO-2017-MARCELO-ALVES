package capitulo3;

import Utilities.Fibonacci;
import Utilities.Math;

import javax.swing.*;
import java.util.Scanner;

public class Capitulo3 {
    private  int op;
    public Capitulo3(){
        int op = Integer.parseInt(JOptionPane.showInputDialog("" +
                "*************** CAPITULO 3 FIXAÇÃO *************** \n" +
                "1 - Questão\n" +
                "2 - Questão\n" +
                "3 - Questão\n" +
                "4 - Questão (fatorial)\n" +
                "5 - Questão (fatorial) \n" +
                "6 - Questão\n" +
                "7 - Questão\n" +
                "8 - Questão\n" +
                "9 - Desafio\n" +
                ""));

        switch (op){
            case 1:
                Questao1();
                break;
            case 2:
                System.out.println("Soma de 1 - 1000: " + Questao2(1000));
                break;
            case 3:
                Questao3();
                break;
            case 4:
                Questao4e5(10);
                break;
            case 5:
                Questao4e5(30);
                break;
            case 6:
                Questao6();
                break;
            case 7:
                Questao7();
                break;
            case 8:
                Questao8();
                break;
            case 9:
                Questao9();
                break;

            default:
                JOptionPane.showMessageDialog(null,"Opção Inválida");
        }
    }

    //Questão 1
    public void Questao1(){

        for (int i = 150; i <= 300 ; i++) {
            System.out.println(i+"\n");
        }
    }
    //Questão 2
    public int Questao2(int numero){
        return  numero == 1 ? numero : numero + Questao2(numero-1);
    }

    //Questão 3
    public void Questao3(){
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0){
                System.out.println(i+"\n");
            }

        }
    }

    //Questão 4 e 5
    public void Questao4e5(int q){
        for (int i = 1; i <= q ; i++) {
            System.out.println(Math.fat(i)+"\n");
        }
    }


    //Questão 6
    public void Questao6(){
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 101; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }
    }


    //Questão 7
    public  void  Questao7() {
            Scanner ler = new Scanner(System.in);
            int x;
            System.out.println("digite var:\n");
            x = ler.nextInt();
            while (x != 1) {
                if(x % 2 == 0 && x != 2) {
                    x = x /2;
                    System.out.println(x+"->");
                }
                else {
                    if (x%2 !=0) {
                        x = x * 3 +1;
                        System.out.println(x+"->");
                    }
                    else {
                        x = x /2;
                        System.out.println(x+"->");
                    }

                }
            }

        }

        public void Questao8(){
            for (int i = 1; i < 10; i ++){
                for( int a = 1; a<=i ; a++){
                    System.out.print(i*a+" ");
                }
                System.out.println();
            }
        }


    public void Questao9(){
       int a = 0;
       int e = 1;
       while (a < 100){
           System.out.print(a+" ");
           e =  a + e;
           a =  e - a;
       }

    }

}
