package app;

import model.Conta;
import model.ContaCorrente;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ManipuladorContas {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Marcelo");
        c1.deposita(500);

        ContaCorrente c2 = new ContaCorrente("Joao");
        c2.deposita(200);

        ContaCorrente c3 = new ContaCorrente("Adão");
        c3.deposita(150);

        ContaCorrente c4 = new ContaCorrente("Manoel");
        c4.deposita(100);

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c4);
        contas.add(c3);
        contas.add(c2);

        Collections.sort(contas);

        for (Conta c: contas)
             {
                 System.out.println("Conta de : "+c.getTitular());
             }
    }
}
