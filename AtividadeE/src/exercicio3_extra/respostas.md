# poo_exercicio_03 extra
1. Não executa pois não existe o metodo main
2. Dará erro pois a classe não foi instanciada apenas declarada
3. dará erro pois a variavel  "j"  não foi inicializada
4. Não dará erro pois a variavel não foi declarada dentro do escopo do metódo 
5. Não compila. Resolve passando um inteiro no construtor

7. ````java
    //Antes
    public class Produto {
    int quantidade;
    void acumula (int quantidade) {
    quantidade++;
    }
    }
    //Depois
    public class Produto {
     int quantidade;
     void acumula (int quantidade) {
       this.quantidade++;
     }
     }
````
