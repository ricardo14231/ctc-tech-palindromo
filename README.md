# Desafio CTC TECH - Palíndromo


## Sobre o projeto 

Projeto desenvolvido para avaliação de conhecimento da empresa CTC TECH.   
Consiste em uma busca por palavras ou frases Palíndromo.   
É possível informar se a buscar deve considerar as palvaras Case Insensite ou se deve considerar os espações em branco.   

OBS.: caso queira levar em consideração os espações em branco, eles vão consister da avaliação se é palíndromo.

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


## Modelo para adicionar uma palavra para busca.

Para adicionar uma nova palavra ou as opções de case insensitive / ignora espaço em braco, adicione um objeto com o modelo a seguir:   
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
