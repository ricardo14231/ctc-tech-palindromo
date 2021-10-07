package com.ricardofarias.ctc.utils;

import com.ricardofarias.ctc.execeptions.PalavraInvalidaExeception;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class FormataPalavra {

    public static String removeEspacoEmBranco(String palavra) {
        return palavra.replaceAll("\\s", "");
    }

    public static String padronizaPalavra(String palavra) throws PalavraInvalidaExeception {

        if(palavra == null || palavra.isEmpty()) {
            throw new PalavraInvalidaExeception();
        }

        String palavraSemAcentos = substituiLetrasComAcentos(palavra);
        //String palavraSemCaracteres = removeCaractersInvalidos(palavra);
        //String p = substituiLetrasComAcentos(palavraSemCaracteres);
        //System.out.println(p);
        return removeCaractersInvalidos(palavraSemAcentos);
    }

    private static String removeCaractersInvalidos(String palavra) {
        String regex = "[^a-zA-Z0-9\\s]";
        //String regex = "[@!,\\-_:]";
        return palavra.replaceAll(regex, "");
    }

    private static String substituiLetrasComAcentos(String palavra) {
        String normalize = Normalizer.normalize(palavra, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalize).replaceAll("");
    }
}
