package model;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario()*Financeiro.getParticipacaoLucro()+super.getSalario();
    }
}
