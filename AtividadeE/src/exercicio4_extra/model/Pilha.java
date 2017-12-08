package exercicio4_extra.model;

public class Pilha {
    private int ultimo;
    private int[] elementos;

    public Pilha(int tamanho) {
        elementos = new int[tamanho];
        this.ultimo = 0;
    }

    public void empilhar(int numero){
        if (!estaCheia())
            this.elementos[this.ultimo++] = numero;
    }

   public String exibir(){
        String texto =  "ELEMENTOS:";
       for (int i = 0; i < this.ultimo ; i++) {
            texto+= "\nITEM["+i+"]: " +this.elementos[i];
       }
       return texto;
   }


   private boolean estaCheia(){
        if (this.ultimo == this.elementos.length)
            return true;
        return false;
   }

    public int retornarTopo(){
        return this.elementos[this.ultimo-1];
    }


}
