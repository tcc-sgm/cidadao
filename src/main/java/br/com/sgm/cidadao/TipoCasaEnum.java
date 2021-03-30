package br.com.sgm.cidadao;

public enum TipoCasaEnum {

    CASA("casa"), APARTAMENTO("aparamento");

    private String tipo;

    TipoCasaEnum(String tipo) {
        this.tipo = tipo;
    }

    public static TipoCasaEnum getByTipo(String tipo) {
        for (TipoCasaEnum tipoCasa : TipoCasaEnum.values()) {
            if(tipoCasa.tipo.equals(tipo))
                return tipoCasa;
        }
        return null;
    }
}
