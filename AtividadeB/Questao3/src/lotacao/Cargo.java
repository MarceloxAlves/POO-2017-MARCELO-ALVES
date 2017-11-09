package lotacao;

public class Cargo {
    private String lotacao;
    private String descricao;
    private double salario_base;

    public Cargo(String lotacao, String descricao, double salario_base) {
        this.lotacao = lotacao;
        this.descricao = descricao;
        this.salario_base = salario_base;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public void mostrar(){
        System.out.println("LOTACAO: " + this.lotacao);
        System.out.println("CARGO: " + this.descricao);
        System.out.println("SALARIO BASE: " + this.salario_base);
    }
}
