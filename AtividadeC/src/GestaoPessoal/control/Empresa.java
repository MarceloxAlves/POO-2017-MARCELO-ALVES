package GestaoPessoal.control;

public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int pos;

    public Empresa(String nome, String cnpj, int qtVagas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new Funcionario[qtVagas];
        this.pos = 0;
    }

    public void adiciona(Funcionario f){
        if (this.temVaga())
            this.empregados[pos++] = f;
        else {
            realocarVagas();
            adiciona(f);
        }
     }


     public int getTotalVagas(){
         return  this.empregados.length;
     }

    public int getCountEmpregados(){
        return  this.pos;
     }

    public int  getVagasLivres(){
         return  getTotalVagas() - getCountEmpregados();
     }

    public boolean temVaga(){
         return this.getVagasLivres() > 0;
     }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

     public String status(){
        String texto = "" +
                "NOME: " + this.nome + "\n" +
                "CNPJ: "+ this.cnpj+"\n";
        for (int i = 0; i < getCountEmpregados(); i++){
            texto += "\nEMPREGADO("+i+"): \n"+ this.empregados[i].toString();
        }
        return texto;
     }


     public boolean inEmpresa(Funcionario f){
         for (int i = 0; i < getCountEmpregados(); i++){
             if(this.empregados[i].equals(f))
                 return true;
         }
         return  false;
     }


     public void realocarVagas(){
         Funcionario[] colaboradores = new Funcionario[this.empregados.length*2];
         for (int i = 0; i < this.empregados.length; i++) {
             colaboradores[i] =  this.empregados[i];
         }
         this.empregados  = colaboradores;
     }



}
