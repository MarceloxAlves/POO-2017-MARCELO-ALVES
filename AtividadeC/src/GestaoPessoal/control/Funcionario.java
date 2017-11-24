package GestaoPessoal.control;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private static int chave;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
        this.chave++;
    }

    public Funcionario() {
        this("NOVATO","DESALOCADO");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public static int getChave() {
        return chave;
    }

    public void aumentarSalario(double aumento){
        this.salario += (aumento/100.0)*this.salario;
    }


    public String toString(){
        String texto =  "NOME: " + this.nome + "\n";
                texto+= "CARGO: " +this.cargo  + "\n";
                texto+= "SALARIO: " + this.salario  + "\n";
        return  texto;
    }


}
