# lambda-exercicios
Estes repositório tem como objetivo guardar exercicios que utilizam do lambda para implementar interfaces Funcionais

## Exercicios
Aqui conterá um descritivo sebre cada exercicio e seus Pacotes/Classes

### Exercicio 1
Defina uma interface funcional que especifique uma
operação sobre strings. A mesma deve prover um
método que recebe uma string e retorna uma nova
string resultante do processamento da primeira.
Exemplifique o uso desta interface escrevendo um
método que recebe uma lista de strings e esta interface
funcional por parâmetro a aplica a operação sobre todos
os elementos da lista para obter uma nova lista de
strings modificadas. Por fim use este método passando
diferentes funções lambda como parâmetro

Para executar esse exercicio, você deve rodar a classe `App_upperCase`.
Pacotes/Classes usadas nesse exercicios:
- `/interfaces/Palavra`
- `/services/Modificador`

### Exercicio 2
Defina uma interface funcional que recebe dois inteiros
por parâmetro e retorna um inteiro resultante de uma
operação sobre os dois recebidos. Crie uma função que
aplica esta operação sobre uma lista de inteiros para
gerar uma nova lista. Exemplifique o uso da mesma
com funções lambda chamando o método com funções
lambda para:
- a) Criar uma nova lista onde os novos elementos são o resultado 
da soma dos elementos da lista original agrupados 2 a 2. Ex: 
[10,20,30,40]→[30,50,70]
- b) Criar uma nova lista onde cada elemento corresponde a média 
de cada dois elementos da lista original. Ex: [10,20,30] → [15,25]
- c) Criar uma nova lista contendo de cada par de elementos da lista 
original sempre o maior. Ex: [10,20,5,50,30] → [20,20,50,50]


Para executar esse exercicio, você deve rodar a classe `App_ListaInteiros`.
Pacotes/Classes usadas nesse exercicios:
- `/interfaces/Inteiros`
- `/services/ListaInteiros`

### Exercicio 3
Criar uma interface funcional chamada intToStr que
recebe um inteiro e devolve uma String. Criar uma
rotina que recebe uma lista de inteiros e um intToStr por
parâmetro e imprime o resultado da aplicação da função
sobre os elementos da lista. Faça um exemplo de uso
criando funções lambda para:
- Acrescentar R$ na frente dos valores
- Imprimir o módulo do valor seguido de <C> (crédito) para os 
positivos ou <D> débito para os negativos


Para executar esse exercicio, você deve rodar a classe `App_ImprimiNovaStr`.
Pacotes/Classes usadas nesse exercicios:
- `/interfaces/InteirosToStr`
- `/services/ImprimiNovaStr`
