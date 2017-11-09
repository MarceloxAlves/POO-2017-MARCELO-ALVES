package capitulo4;

public class Funcionario {
     String nome;
     Departamento departamento;
     double salario;
     Data admissao;
     String rg;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    void recebeAumento(float percentual){
        this.salario += percentual/100.0*this.salario;
}

    double calculaGanhoAnual() {
        return (salario * 12);

    }

    public void admitir(Data data, Departamento departamento, double salario){
        this.admissao =  data;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostra(){
        System.out.println("NOME:" + this.nome);
        System.out.println("DEPARTAMENTO:" + departamento.getDescricao());
        System.out.println("SALARIO:" + this.salario);
        System.out.println("SALARIO ANUAL:" + this.calculaGanhoAnual());
        System.out.println("ADMISSÃO:" + admissao.getShortData());

    }
}
