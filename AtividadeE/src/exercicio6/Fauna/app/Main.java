package exercicio6.Fauna.app;

import exercicio6.Fauna.model.Animal;
import exercicio6.Fauna.model.Bovino;
import exercicio6.Fauna.model.Cercado;
import exercicio6.Fauna.model.Peixe;

public class Main {
    public static void main(String[] args) {
        Cercado cercado = new Cercado(10);
        Animal boi1 = new Bovino("Nelore","Boizinho1");
        Animal boi2 = new Bovino("Nelore","Boizinho2");
        Animal peixe1 = new Peixe("N sei","Branquinha");
        Animal peixe2 = new Peixe("N sei","Tilápia");
    }
}
