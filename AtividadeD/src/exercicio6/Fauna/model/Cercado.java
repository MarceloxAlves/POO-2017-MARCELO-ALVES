package exercicio6.Fauna.model;
public class Cercado {
    private int indice;
    private Animal[] animais;

    public Cercado(int quantidade) {
        this.indice = 0;
        this.animais = new Animal[quantidade];
    }

    public void inserir(Animal animal){
        if(!estaCheio())
            this.animais[this.indice++] = animal;
    }

    private boolean estaCheio(){
        if (this.indice == this.animais.length)
            return true;
        return false;
    }

}
