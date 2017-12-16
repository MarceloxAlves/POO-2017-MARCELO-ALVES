package model;

public class Diretor extends  Funcionario {
    public Diretor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        //implementação
        return 0;
    }
}
