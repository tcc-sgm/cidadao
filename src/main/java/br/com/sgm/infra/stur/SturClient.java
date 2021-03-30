package br.com.sgm.infra.stur;

import br.com.sgm.cidadao.Imposto;
import br.com.sgm.cidadao.TipoImpostoEnum;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SturClient {

    private List<Imposto> iptuImpostos;
    private List<Imposto> itrImpostos;

    public SturClient() {
        iptuImpostos = ImpostoLoadDatas.getImpostos(TipoImpostoEnum.IPTU);
        itrImpostos = ImpostoLoadDatas.getImpostos(TipoImpostoEnum.ITR);
    }

    public List<Imposto> recuperaIptu(String cpf, Integer inscricao) {
        return iptuImpostos.stream()
                .filter(iptu -> cpf.equals(iptu.getCpfCnpj()) && inscricao.equals(iptu.getInscricao()))
                .collect(Collectors.toList());
    }

    public List<Imposto> recuperaItr(String cpf, Integer inscricao) {
        return itrImpostos.stream()
                .filter(itr -> cpf.equals(itr.getCpfCnpj()) && inscricao.equals(itr.getInscricao()))
                .collect(Collectors.toList());
    }
}
