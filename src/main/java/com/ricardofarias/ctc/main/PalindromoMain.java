package com.ricardofarias.ctc.main;

import com.ricardofarias.ctc.Palindromo;
import com.ricardofarias.ctc.enums.CaseSensetive;
import com.ricardofarias.ctc.enums.IgnorarEspacoBranco;

public class PalindromoMain {

    public static void main(String[] args) {

        Palindromo palindromo = new Palindromo
                .PalindromoBuilder()
                .palavra("aia")
                .caseSensitive(CaseSensetive.SIM)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();

        System.out.println(palindromo.resultado());

        Palindromo palindromo2 = new Palindromo
                .PalindromoBuilder()
                .palavra("asaaa1234")
                .caseSensitive(CaseSensetive.SIM)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();

        System.out.println(palindromo2.resultado());


        Palindromo palindromo3 = new Palindromo
                .PalindromoBuilder()
                .palavra("À Rita, sátira!")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();

        System.out.println(palindromo3.resultado());


        Palindromo palindromo4 = new Palindromo
                .PalindromoBuilder()
                .palavra("")
                .caseSensitive(CaseSensetive.SIM)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();

        System.out.println(palindromo4.resultado());


        Palindromo palindromo5 = new Palindromo
                .PalindromoBuilder()
                .palavra(null)
                .caseSensitive(CaseSensetive.SIM)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();

        System.out.println(palindromo5.resultado());


        Palindromo palindromo6 = new Palindromo
                .PalindromoBuilder()
                //.palavra(null)
                .caseSensitive(CaseSensetive.SIM)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();

        System.out.println(palindromo6.resultado());

    }

}
