# poo_exercicio_02
1. Corrija as seguintes afirmações: Considere uma classe chamada Avaliacao. Para compilarmos e executamos a
classe devemos executar os seguintes comandos:

```BASH
$ javac Avaliacao
$ javac Avaliacao.java
```
Errado.

2. Qual o resultado da compilação do código abaixo e justifique sua resposta:

```Java
public class Aplicacao {
  public static void main() {
    int contador;
    System.out.println(contador++);
  }
}
```
O código em questão não irá executar. Pois falta os paramêtros que é um vetor de Strings além de ter um contador++ com a variavel que não foi inicializada.

3. Explique detalhadamente o resultado após a execução abaixo do código:

```Java
public class Exemplo {
  public static void main(String[] args) {
    int a = 9;
    int b = 0;
    if ((a > 11) && (++b <= 100)){
      System.out.println(a*b);
    } else {
      System.out.println(a-b);
    }
  }
}
```
```
  O resultado do código acima é 9.
  mesmo com o incremento de b na codicional b não muda o valor então 9-0 = 9
```

4. Explique detalhadamente qual a saída da execução do trecho de código abaixo e
    justifique:
```Java
int op = 1;
switch (op) {
  case 1: System.out.println(op);
  case 2: System.out.println(op);
  default: System.out.println(op);
}
```
```
A saída será 1, mesmo entrando no primeiro caso ele n para de comparar vai até chegar no default, pois está faltando um break;
```
5. Corrija a classe abaixo para que a mesma exiba corretamente a soma de a e b.

```Java
public class Exemplo {
  public static void main(String args[]) {
    int a = 10, b=1;
    System.out.println("Soma: " + (a + b));
  }
}
```

6. Crie uma classe em que o método main() exiba uma mensagem de saudação
    usando um “println”.
    ```Java
    public class Main {
      public static void main(String args[]) {
        System.out.println("Olá, Avanti!");
      }
    }
    ```
