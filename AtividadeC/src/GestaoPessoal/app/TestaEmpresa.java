package GestaoPessoal.app;

import GestaoPessoal.control.Empresa;
import GestaoPessoal.control.Funcionario;

public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("AVANTI","00000",1);

        Funcionario f1 = new Funcionario("Marcelo Alves", "PT");
        f1.setSalario(2000);
        f1.aumentarSalario(10);
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario("MICAEL","PROGRAMADOR");
        f2.setSalario(1000);
        empresa.adiciona(f2);

        System.out.println(empresa.status());

        if(empresa.inEmpresa(f1)){
            System.out.println("Contem "+ f1);
        }else{
            System.out.println("Não contem");
        }
    }
}
