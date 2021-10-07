package com.ricardofarias.ctc;

import com.ricardofarias.ctc.enums.CaseSensetive;
import com.ricardofarias.ctc.enums.IgnorarEspacoBranco;
import com.ricardofarias.ctc.execeptions.PalavraInvalidaExeception;
import com.ricardofarias.ctc.utils.FormataPalavra;

public class Palindromo {

    private String palavra;
    private final CaseSensetive caseSensitive;
    private final IgnorarEspacoBranco ignorarEspacoBranco;

    private Palindromo(String palavra, CaseSensetive caseSensitive, IgnorarEspacoBranco ignorarEspacoBranco) {
        this.palavra = palavra;
        this.caseSensitive = caseSensitive;
        this.ignorarEspacoBranco = ignorarEspacoBranco;
    }

    public static class PalindromoBuilder {
        private String palavra;
        private CaseSensetive caseSensitive;
        private IgnorarEspacoBranco ignorarEspacoBranco;

        public PalindromoBuilder palavra(String palavra) {
            this.palavra = palavra;
            return this;
        }

        public PalindromoBuilder caseSensitive(CaseSensetive caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }

        public PalindromoBuilder ignorarEspacoEmBranco(IgnorarEspacoBranco ignorarEspacoBranco) {
            this.ignorarEspacoBranco = ignorarEspacoBranco;
            return this;
        }

        public Palindromo build() {
            return new Palindromo(palavra, caseSensitive, ignorarEspacoBranco);
        }
    }

    public String resultado() {
        String palavraPadronizada = "";

        try {
            palavraPadronizada = FormataPalavra.padronizaPalavra(this.palavra);
        } catch (PalavraInvalidaExeception err) {
            return err.getMessage();
        }

        if(!this.caseSensitive.getOpcao()) {
            palavraPadronizada = palavraPadronizada.toLowerCase();
        }

        if(this.ignorarEspacoBranco.getOpcao()) {
            palavraPadronizada = FormataPalavra.removeEspacoEmBranco(palavraPadronizada);
        }

        if(isPalindromo(palavraPadronizada)) {
            return "A palavra é palíndromo!";
        }
        return "A palavra NÃO é palíndromo!";
    }

    private static boolean isPalindromo(String palavra) {

        char[] arrayPalavra = palavra.toCharArray();
        int tamanhoArray = arrayPalavra.length;

        for (int i=0; i < tamanhoArray/2; i++) {
            if(arrayPalavra[i] != arrayPalavra[(tamanhoArray - 1) - i]) return false;
        }
        return true;
    }
}
