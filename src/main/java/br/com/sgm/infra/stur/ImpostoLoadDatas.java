package br.com.sgm.infra.stur;

import br.com.sgm.cidadao.Imposto;
import br.com.sgm.cidadao.TipoCasaEnum;
import br.com.sgm.cidadao.TipoImpostoEnum;

import java.util.ArrayList;
import java.util.List;

public class ImpostoLoadDatas {

    public static List<Imposto> getImpostos(TipoImpostoEnum tipoImpostoEnum) {
        List<Imposto> impostos = new ArrayList<>();
        Imposto imp1 = Imposto.builder().
                id(1)
                .proprietario("Erick Ricardo da Mota")
                .cpfCnpj("46406708776")
                .endereco("Travessa Rio Tigre")
                .numero(20)
                .cep("59115696")
                .cidade("Natal")
                .estado("RN")
                .tipoCasa(TipoCasaEnum.CASA)
                .tipoImposto(tipoImpostoEnum)
                .valor(2000.0)
                .tamanho(300)
                .ano(1999)
                .inscricao(397177689)
                .build();

        Imposto imp2 = Imposto.builder().
                id(2)
                .proprietario("Maya Pietra Isis Viana")
                .cpfCnpj("88767122167")
                .endereco("Rua Sancho Canafístula")
                .numero(1)
                .cep("62020300")
                .cidade("Sobral")
                .estado("CE")
                .tipoCasa(TipoCasaEnum.APARTAMENTO)
                .tipoImposto(tipoImpostoEnum)
                .valor(1200.0)
                .tamanho(110)
                .ano(2018)
                .inscricao(256748883)
                .build();

        Imposto imp3 = Imposto.builder().
                id(3)
                .proprietario("Maya Pietra Isis Viana")
                .cpfCnpj("88767122167")
                .endereco("Santa Maria da Codipe")
                .numero(12)
                .cep("64013525")
                .cidade("Sobral")
                .estado("CE")
                .tipoCasa(TipoCasaEnum.APARTAMENTO)
                .tipoImposto(tipoImpostoEnum)
                .valor(1200.0)
                .tamanho(1222)
                .ano(2018)
                .inscricao(149496023)
                .build();

        Imposto imp4 = Imposto.builder().
                id(4)
                .proprietario("Marcos Luan Mateus Rezende")
                .cpfCnpj("47897794326")
                .endereco("Rua Edson Castro")
                .numero(20)
                .cep("69309657")
                .cidade("Pricumã")
                .estado("SP")
                .tipoCasa(TipoCasaEnum.CASA)
                .tipoImposto(tipoImpostoEnum)
                .valor(190.00)
                .tamanho(34)
                .ano(1934)
                .inscricao(274167864)
                .build();

        Imposto imp5 = Imposto.builder().
                id(5)
                .proprietario("Marcos Luan Mateus Rezende")
                .cpfCnpj("47897794326")
                .endereco("Rua Sabino Cardoso de Araújo")
                .numero(20)
                .cep("57063590")
                .cidade("Pricumã")
                .estado("SP")
                .tipoCasa(TipoCasaEnum.APARTAMENTO)
                .tipoImposto(tipoImpostoEnum)
                .valor(1200.00)
                .tamanho(34)
                .ano(2012)
                .inscricao(306035194)
                .build();

        Imposto imp6 = Imposto.builder().
                id(6)
                .proprietario("Andrea Fátima Pires")
                .cpfCnpj("03259466711")
                .endereco("Setor Tradicional (São Sebastião)")
                .numero(20)
                .cep("71691106")
                .cidade("Brasília")
                .estado("DF")
                .tipoCasa(TipoCasaEnum.CASA)
                .tipoImposto(tipoImpostoEnum)
                .valor(1000.0)
                .tamanho(120)
                .ano(1978)
                .inscricao(214488792)
                .build();

        Imposto imp7 = Imposto.builder().
                id(7)
                .proprietario("Leonardo Bruno Hugo Cardoso")
                .cpfCnpj("52042193747")
                .endereco("Travessa Coréia")
                .numero(210)
                .cep("79094410")
                .cidade("Campo Grande")
                .estado("")
                .tipoCasa(TipoCasaEnum.CASA)
                .tipoImposto(tipoImpostoEnum)
                .valor(2000.0)
                .tamanho(123)
                .ano(2020)
                .inscricao(52042193)
                .build();

        Imposto imp8 = Imposto.builder().
                id(8)
                .proprietario("Renan Marcos da Cunha")
                .cpfCnpj("78310407149")
                .endereco("Avenida 8")
                .numero(2)
                .cep("68927173")
                .cidade("Santana")
                .estado("BA")
                .tipoCasa(TipoCasaEnum.CASA)
                .tipoImposto(tipoImpostoEnum)
                .valor(1300.0)
                .tamanho(300)
                .ano(1999)
                .inscricao(296434346)
                .build();

        Imposto imp9 = Imposto.builder().
                id(1)
                .proprietario("Jonathan Cabral")
                .cpfCnpj("02963866165")
                .endereco("Setor CHS Conjunto 76")
                .numero(30)
                .cep("72238791")
                .cidade("Brasilia")
                .estado("DF")
                .tipoCasa(TipoCasaEnum.APARTAMENTO)
                .tipoImposto(tipoImpostoEnum)
                .valor(1300.0)
                .tamanho(200)
                .ano(2021)
                .inscricao(2923651)
                .build();

        Imposto imp10 = Imposto.builder().
                id(1)
                .proprietario("Andre Sousa")
                .cpfCnpj("82610233171")
                .endereco("SHC 23 Mansoes norte")
                .numero(211)
                .cep("51249091")
                .cidade("Brasilia")
                .estado("DF")
                .tipoCasa(TipoCasaEnum.CASA)
                .tipoImposto(tipoImpostoEnum)
                .valor(22000.0)
                .tamanho(5000)
                .ano(2016)
                .inscricao(5135873)
                .build();

        impostos.add(imp1);
        impostos.add(imp2);
        impostos.add(imp3);
        impostos.add(imp4);
        impostos.add(imp5);
        impostos.add(imp6);
        impostos.add(imp7);
        impostos.add(imp8);
        impostos.add(imp9);
        impostos.add(imp10);
        return impostos;
    }
}
