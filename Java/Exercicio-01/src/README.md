# Exercício sobre polimorfismo - sobreposição e sobrescrita de métodos

## Exercício
Uma loja que vende CD e DVDS deseja construir um cadastro com dos seus produtos. Para tanto, foi elaborado o diagrama de classes dado na figura abaixo.

![UML - Exercicio-01](https://user-images.githubusercontent.com/100242220/168829966-eb0ecd56-46a1-4ac0-b650-fe2c6d0d14a7.png)

A tabela abaixo fornece uma descrição dos métodos que deverão ser
elaborados para cada uma das classes.

| Método 	| Descrição 	|
|---	|---	|
| getTipo() 	| Retorna uma String com o nome da classe. 	|
| getDetalhes() 	| Retorna uma String com as informações contidas nos campos. 	|
| printDados() 	| Imprime as informações contidas nos campos da classe. Para tanto, usa dois métodos para recuperar estas informações: getTipo() e getDetalhes(). Estas funções por sua vez são polimórficas, ou seja, seu tipo retorno varia de acordo com a classe escolhida, tal que estemétodo é sobreposto nas subclasses. 	|
| inserirDados() 	| Insere os dados necessários para se preencher os campos de um objeto de uma dada classe. Seu comportamento é polimórfico. 	|

Além dos métodos descritos na tabela a cima, deverão ser criados os métodos get e set correspondentes para retorna e modificar o conteúdo dos campos, respectivamente, bem como os construtores com e sem parâmetros de cada classe. Criar um programa que simule o uso de um cadastro de CD e DVDs.

## Arquivos  
| App.java (main) |  
| Midia.java (Superclass) |  
| DVD.java (Subclass) |  
| CD.java (Subclass) |  
