package lotacao;

public class Funcionario {
    private String nome;
    private Cargo cargo;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void aumentarSalario(double aumento){
        this.salario += aumento/100.0*this.salario;
    }

    public void admitir(Cargo cargo){
        this.salario  = cargo.getSalario_base();
        this.cargo = cargo;
    }

    public void mostrar(){
        System.out.println("NOME: " + this.nome);
        System.out.println("CARGO: " + cargo.getDescricao());
        System.out.println("SALARIO: " + this.salario);
    }


}
