package exercicio4.model;

public class Senha {
  private String valor;

  public boolean iguais(String valor){
      return  this.valor.equals(valor) ? true : false;
  }

    public boolean iguaisTrim(String valor){
        return  this.valor.trim().equals(valor.trim()) ? true : false;
    }

    public boolean tamanhoSeguro(){
        return  this.valor.length() >= 6 ? true : false;
    }

    public boolean possuiMaiusculaMinuscula(){
        for (int i = 0; i < this.valor.length(); i++){
            char c =  this.valor.charAt(i);
           if(c >= 'A' && c <= 'Z'){
                return true;
           }
        }

        return false;
    }

    public boolean possuiNumero(){
        for (int i = 0; i < this.valor.length(); i++){
            char c =  this.valor.charAt(i);
            if (Character.isDigit(c)){
                return true;
            }
        }

        return false;
    }

    public boolean ehValida(){
        if(!this.possuiMaiusculaMinuscula())
            return false;
        if(!this.possuiNumero())
            return false;
        return true;
    }


}
