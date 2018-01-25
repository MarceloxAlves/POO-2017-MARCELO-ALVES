package app;

import model.Conta;
import model.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

    public static void main(String[] args) {
        Conta c1 = new ContaCorrente("Marcelo");
        c1.deposita(10000);

        Conta c2 = new ContaCorrente("João");
        c2.deposita(3000);

        Map mapaDeContas = new HashMap();

        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}