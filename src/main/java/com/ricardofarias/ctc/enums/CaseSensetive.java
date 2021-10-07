package com.ricardofarias.ctc.enums;

public enum CaseSensetive {
    SIM (true),
    NAO (false);

    boolean opcao;

    CaseSensetive(boolean opcao) {
        this.opcao = opcao;
    }

    public boolean getOpcao() {
        return this.opcao;
    }
}
