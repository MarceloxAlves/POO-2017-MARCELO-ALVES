O que teria acontecido se a classe Conta não implementasse Comparable<Conta> mas tivesse o método compareTo?

_`Error:(25, 20) java: no suitable method found for sort(java.util.List<model.ContaCorrente>)
    method java.util.Collections.<T>sort(java.util.List<T>) is not applicable
      (inference variable T has incompatible bounds
        equality constraints: model.ContaCorrente
        upper bounds: java.lang.Comparable<? super T>)
    method java.util.Collections.<T>sort(java.util.List<T>,java.util.Comparator<? super T>) is not applicable
      (cannot infer type-variable(s) T
        (actual and formal argument lists differ in length))`_
        
Como posso inverter a ordem de uma lista? Como posso embaralhar todos os elementos de uma lista? Como posso rotacionar os elementos de uma lista?

`  Collections.reverse(contas);`

	`rotate(List<?> list, int distance)
    Gira os elementos na lista especificada pela distância especificada.`
    
    `Collections.rotate(contas,2);`
    
   O que é lento? A inserção de 30 mil elementos ou as 30 mil buscas?
    `A busca que é lenta`
    
`    HashSet -> é bem mais rápido para busca e um pouco mais lento na inserção ja o ArrayList é rapido na inserção mas a busca é consideravelmente lenta em relação ao Hashset`

