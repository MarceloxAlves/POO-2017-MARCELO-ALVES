package capitulo4;

public class GestaoPessoal {

    public GestaoPessoal() {
        Funcionario f1 = new Funcionario();
        f1.nome = "Danilo";
        f1.salario = 100;

        Funcionario f2 = new Funcionario();
        f2.nome = "Danilo";
        f2.salario = 100;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }


        Funcionario f3 = new Funcionario("Marcelo Alves");
        Departamento dp = new Departamento("TI",100);
        Data data = new Data(10,11,2017);
        f3.admitir(data,dp,1000);
        f3.mostra();

    }

}
