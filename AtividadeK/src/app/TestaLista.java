package app;

import model.Conta;
import model.ContaCorrente;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaLista {


    public static void main(String[] args) {
        List<Conta> contas = new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            Random random = new Random();
            int num = random.nextInt();
            ContaCorrente cc = new ContaCorrente("");
            cc.deposita(num);
            contas.add(cc);
        }
    }
}
