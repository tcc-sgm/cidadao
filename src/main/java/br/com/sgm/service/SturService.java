package br.com.sgm.service;

import br.com.sgm.model.Imposto;
import br.com.sgm.model.TipoImpostoEnum;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SturService {

    private List<Imposto> iptuImpostos;
    private List<Imposto> itrImpostos;

    public SturService() {
        iptuImpostos = ImpostoMockDatas.getImpostos(TipoImpostoEnum.IPTU);
        itrImpostos = ImpostoMockDatas.getImpostos(TipoImpostoEnum.ITR);
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
