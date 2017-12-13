2.Se não podemos dar new em Conta, qual é a utilidade de ter um método que recebe uma referência a Conta como argumento? Aliás, posso ter isso?
``
É util para definir um modelo de objeto a ser herdado, ou seja implementar um tipo!
``

3. Qual é o problema com a classe ContaPoupanca?
  ``
    O erro ocorre pois uma classe concreta que herda de uma classe abstrata é  obrigada a implementar os metodos abstratos ou virar abstrata para transferir a responsabilidade para outra.
  ``
5.(opcional) Existe outra maneira de a classe ContaCorrente compilar se você não reescrever o método abstrato?
``
Sim. Tornando a classe em subclasse abstrata e passando a responsabilidade para outra
``
6.(opcional) Pra que ter o método atualiza na classe Conta se ele não faz nada? O que acontece se simplesmente apagarmos esse método da classe Conta e deixarmos o método atualiza nas filhas?
``
 Para que todos os objetos de conta tenha o metodo mas que tenha comportamento diferente.
 Se retirar da classe Conta não dará erro.
``

7.(opcional) Posso chamar um método abstrato de dentro de um outro método da própria classe abstrata? Um exemplo: o mostra do Funcionario pode invocar this.getBonificacao()?
``
Sim é permitido!
``

8. [DESAFIO] Não podemos dar new em Conta, mas por que, então, podemos dar new em Conta[10], por exemplo
``
Porque como falei no item 2 a classe abstrata funciona como um tipo então neste caso estará criando um vetor de conta com 10 posições que não são instancias
``