# poo_exercicio_03
1. Podemos afirmar que haverá um problema de compilação, pois a variável inteira não foi inicializada previamente? Justifique.
```Não dará erro pois a variavel não foi declarada dentro do escopo do metódo```

2. Qual o resultado da compilação e/ou execução da classe que tenha o método acima? Justifique
```Erro devido não existir um construtor que receba a quantidade de reservas. Caso tambem não esteja no mesmo pacote não poderá ver o atributo```

3. Qual o resultado da compilação e/ou execução da classe que tenha o método acima? Justifique
```Será 0 devido o valor padrao de "int" da variavel "a" da instancia pois ela não é alterada no construtor da classe porque tem um parametro
com o mesmo nome e para refenciar a atributos da instancia usa o "this".```

4. Dado o seguinte trecho de código de acumulação de um atributo valor, explique a problemática envolvida e reescreva o método com uma solução:
   *antes
   ```Java
        void x(double valor) {
           valor = valor + valor;
        }```
        Para refenciar a atributos da instancia usa o "this".
   *depois
      ```Java
           void x(double valor) {
              this.valor += valor;
           }```

5. O Erro acontece devido não passar o parametro obrigatório no "construtor".


6.  -a)Aparecerão o mesmo conteúdo pois eles estão apontando para o mesmo endereço de memória.
    -b)não terá ponteiros apontando para ele!.


