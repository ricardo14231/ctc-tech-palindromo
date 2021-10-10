# Desafio CTC TECH - Palíndromo


## Sobre o projeto 

Projeto desenvolvido para avaliação de conhecimento da empresa CTC TECH.   
Consiste em uma busca por palavras ou frases Palíndromo.   
É possível informar se a buscar deve considerar as palavras Case-Insensitive ou se deve considerar os espaços em branco.   

## Pré-requisitos para executar o projeto:

* Java: 11 ou superior.  
* Maven: 3.8.1  
* JUnit 5.

## Para executar a aplicação:

No diretório do projeto execute o seguinte comando no terminal:  
`mvn clean install`   
`
Abra o projeto em uma IDE.      
execute a classe "PalindromoMain" do pacote com.ricardofarias.ctc.main   `


## EXEMPLO Modelo para adicionar uma palavra para busca.

Para adicionar uma nova palavra ou as opções de case-insensitive / ignora espaço em branco, adicione um objeto com o modelo a seguir:   
OBS.: caso considere os espaços em branco, o algoritmo os leva em consideração para avaliar se é palíndromo.   
``` Objeto (builder)   
Palindromo palindromo3 = new Palindromo
                .PalindromoBuilder()
                .palavra("À Rita, sátira!")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
```
## Autor:

Ricardo Farias.

https://www.linkedin.com/in/ricardo14231/

## Licença:

MIT
