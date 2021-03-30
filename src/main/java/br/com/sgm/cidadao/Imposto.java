package br.com.sgm.cidadao;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Imposto {
    private Integer id;
    private String proprietario;
    private String cpfCnpj;
    private String endereco;
    private Integer numero;
    private String cep;
    private String cidade;
    private String estado;
    private TipoCasaEnum tipoCasa;
    private TipoImpostoEnum tipoImposto;
    private Double valor;
    private int tamanho;
    private int ano;
    private Integer inscricao;

    @Override
    public String toString() {
        return "Imposto{" +
                "id=" + id +
                ", proprietario='" + proprietario + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", tipoCasa=" + tipoCasa +
                ", tipoImposto=" + tipoImposto +
                ", valor='" + valor + '\'' +
                ", tamanho=" + tamanho +
                ", ano=" + ano +
                ", inscricao='" + inscricao + '\'' +
                '}';
    }
}
