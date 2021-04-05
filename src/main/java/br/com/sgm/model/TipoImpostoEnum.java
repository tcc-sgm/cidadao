package br.com.sgm.model;

public enum TipoImpostoEnum {

    IPTU("iptu"), ITR("itr");

    private String tipo;

    TipoImpostoEnum(String tipo) {
        this.tipo = tipo;
    }

    public static TipoImpostoEnum getByTipo(String tipo) {
        for (TipoImpostoEnum tipoImposto : TipoImpostoEnum.values()) {
            if(tipoImposto.tipo.equals(tipo))
                return tipoImposto;
        }
        return null;
    }
}
