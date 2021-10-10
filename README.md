# Desafio CTC TECH - Palíndromo


# Sobre o projeto 

Projeto de uma busca de palavras e frases palíndromo para avaliação de conhecimento da empresa CTC TECH.

## Pré-requisitos para executar o projeto:

*Java: 11 ou superior.  
*Maven: 3.8.1  
*JUnit 5.

## Para executar a aplicação:

No diretório do projeto execute o seguinte comando no terminal:  
`mvn clean install`   
`*Abra o projeto em uma IDE.   
*execute a classe "PalindromoMain" do pacote com.ricardofarias.ctc.main   `


## Modelo para alterar uma palavra
Para adicionar uma nova palavra ou as opções de case insensitive / ignora espaço em braco, adicione um objeto com o modelo a seguir:   
``` JSON
Palindromo palindromo3 = new Palindromo
                .PalindromoBuilder()
                .palavra("À Rita, sátira!")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
                ```
## Autor:

Ricardo Farias.

https://www.linkedin.com/in/ricardo-farias-04069359/

## Licença:

MIT
