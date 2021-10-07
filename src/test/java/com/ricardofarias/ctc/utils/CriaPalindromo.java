package com.ricardofarias.ctc.utils;

import com.ricardofarias.ctc.Palindromo;
import com.ricardofarias.ctc.enums.CaseSensetive;
import com.ricardofarias.ctc.enums.IgnorarEspacoBranco;

public class CriaPalindromo {

    public static Palindromo criaPalindromoValido() {
        return new Palindromo.PalindromoBuilder()
                .palavra("arara")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoInValido() {
        return new Palindromo.PalindromoBuilder()
                .palavra("araraaaa")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoPalavraNull() {
        return new Palindromo.PalindromoBuilder()
                .palavra(null)
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoComPalavraEmBranco() {
        return new Palindromo.PalindromoBuilder()
                .palavra("")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoValidoComCaseSensitive() {
        return new Palindromo.PalindromoBuilder()
                .palavra("ArarA")
                .caseSensitive(CaseSensetive.SIM)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoInvalidoComCaseSensitive() {
        return new Palindromo.PalindromoBuilder()
                .palavra("Arara")
                .caseSensitive(CaseSensetive.SIM)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoValidoComEspacoEmBranco() {
        return new Palindromo.PalindromoBuilder()
                .palavra("a arara a")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.NAO)
                .build();
    }

    public static Palindromo criaPalindromoInvalidoComEspacoEmBranco() {
        return new Palindromo.PalindromoBuilder()
                .palavra("a arara")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.NAO)
                .build();
    }

    public static Palindromo criaPalindromoFraseValida() {
        return new Palindromo.PalindromoBuilder()
                .palavra("Amo Omã. Se Roma me tem amores, amo Omã!")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoFraseInvalida() {
        return new Palindromo.PalindromoBuilder()
                .palavra("a arara não voa.")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }

    public static Palindromo criaPalindromoFraseValidaComAcentos() {
        return new Palindromo.PalindromoBuilder()
                .palavra("À Rita, sátira!")
                .caseSensitive(CaseSensetive.NAO)
                .ignorarEspacoEmBranco(IgnorarEspacoBranco.SIM)
                .build();
    }
}
