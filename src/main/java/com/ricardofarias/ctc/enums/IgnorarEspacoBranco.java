package com.ricardofarias.ctc.enums;

public enum IgnorarEspacoBranco {
    SIM (true),
    NAO (false);

    boolean opcao;

    IgnorarEspacoBranco(boolean opcao) {
        this.opcao = opcao;
    }

    public boolean getOpcao() {
        return this.opcao;
    }
}
