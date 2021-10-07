package com.ricardofarias.ctc.execeptions;

public class PalavraInvalidaExeception extends NullPointerException {

    private static final String mensagem = "A palavra não é válida! Por favor, informe outra palavra.";

    public PalavraInvalidaExeception() {
        super(mensagem);
    }
}
