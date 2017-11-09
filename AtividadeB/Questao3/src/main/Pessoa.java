package main;
public class Pessoa {
    private String nome;
    private int cpf;

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void mostrar(){
        System.out.println("NOME: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }


}
