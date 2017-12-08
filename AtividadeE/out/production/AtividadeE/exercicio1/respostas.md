# poo_exercicio_01
1. Qual a diferença entre objetos e classes? Exemplifique.
   ```Classe é uma estrutura e Objeto é a instancia desta estrutura.```
  Por exemplo:
    - Classe: Animal.
    - Objetos: Cachorro, Gato

2. De forma breve, conceitue atributos e métodos. Pesquise e exemplifique um
    exemplo de objeto que possua atributos e métodos (notação livre).
    Atributos são as "caracteristicas". Métodos são as ações.
    ```
      Animal:
        atributos: raça, qtpatas.
        métodos: falar, correr, comer
    ```

3. A abstração visa focar no que é importante para um sistema. Você concorda que
    um atributo de uma pessoa pode ser importante ou não dependendo do contexto
    do sistema. Enumere na tabela abaixo contextos/sistemas distintos em que os
    atributos abaixo seriam ou não relevantes:

| Atributo | Sistema em que é importante | Sistema em que não é importante |
| -------- | --------------------------- | ------------------------------- |
| Peso   |  Esportes, Academia  | Frente de Loja
| Tipo de CNH  | Auto Escola, Transportes | Contabilidade
| Tipo Sanguíneo   | Banco de Sangue, SUS | Ponto Eletrônico
| Habilidade destra  | Esportes | Qacadêmico
| Percentual de gordura  | Esportes | Qacadêmico
| Saldo em conta   | Finaceiro, Bancário | Qacadêmico
| Etinia   | Estatístico | Finaceiro

4. Considerando os objetos Pessoa e Conta:

    a) Seria interessante em um sistema bancário um objeto "conta" possuir uma
       "pessoa" como um atributo interno representando o titular da conta?

       ```Sim. Seria interessante ter uma referência para saber de qual "pessoa" essa "conta" pertence.```

    b) Olhando no sentido inverso, seria interessante uma pessoa possuir mais de
       uma conta como atributo? Que elemento da programação estruturada melhor
       representaria o conjunto de contas de uma pessoa?

       ```Uma vetor/lista.```

5. Identifique pelo menos 5 objetos de um sistema de controle acadêmico. Ex: aluno.
 ```
  Sistema Acadêmico
    - Aluno
    - Turma
    - Curso
    - Professor
    - Disciplina
 ```
6. Imagine um jogo qualquer. Identifique o máximo de objetos possíveis e eventuais
    características (atributos) e comportamentos (métodos) que os mesmos poderiam
    ter.
    ```
    # Dama
      * Objetos:
        - Tabuleiro
          - dimensãoX
          - dimensãoY
          - gerarMapa()

        - Pinos
          - cor
          - direção
          - destruir()
          - mover()

        - Jogador
          - lado
          - mover_pino()

    ```

7. Considerando o exemplo da classe Retangulo dos slides, implemente um método
    adicional chamado que calcule o perímetro do retângulo e altere a classe
    TestaRetangulo para exibir o cálculo do perímetro.

    ```Java
      class Retangulo {
        private double perimetro;
        public double perimetro(double lado1, lado2){
            return 2 * lado1 + 2 * lado2;
        }
      }

    ```

8. Crie uma classe Circulo que possua um atributo raio. Crie dois métodos que
    calculam a área e o perímetro e crie uma outra classe chamada TestaCirculo que
    instancia, atribui um valor ao raio e exibe a área e o perímetro chamando os dois
    métodos definidos na questão anterior.

    _Circulo.java_
    ```Java
      public class Circulo {
          private  double raio;
          private  double diametro;
          private  Ponto centro;

          public Circulo(Ponto centro) {
              this.centro = centro;
          }

          public double getRaio() {
              return raio;
          }

          public void setRaio(double raio) {
              this.raio = raio;
          }

          public double getDiametro() {
              return diametro;
          }

          public void setDiametro(double diametro) {
              this.diametro = diametro;
          }

          public  double getCircunferencia(){
              return  2*3.14*this.raio;
          }

          public  double calcularArea(){
              return  3.14*this.raio*this.raio;
          }

          public  Ponto getCentro(){
              return  this.centro;
          }

          public  void  movimentar(Ponto ponto){
              this.centro = ponto;
          }


          public boolean isInSide(Ponto B){
              if(centro.distancia(B) < this.raio){
                  return true;
              }
              return false;
          }

          public String relacaoCirculo(Circulo B){

              if (this.centro.distancia(B.getCentro()) == (this.raio+B.getRaio())){
                  return "Tangente";
              }else  if (this.centro.distancia(B.getCentro()) < (this.raio+B.getRaio())){
                  return "Secante";
              }else{
                  return "Externos";
              }

          }


      }


