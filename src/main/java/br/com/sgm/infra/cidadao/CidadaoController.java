package br.com.sgm.infra.cidadao;

import br.com.sgm.cidadao.Imposto;
import br.com.sgm.infra.stur.SturClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("imposto/")
public class CidadaoController {

    @Autowired
    private SturClient client;

    @RequestMapping(value = "iptu/cpf/{cpf}",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> recuperaIptu(@PathVariable("cpf") String cpf) {
        List<Imposto> impostos = client.recuperaIptu(cpf);
        if (impostos.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(impostos);
        else return new ResponseEntity<>(impostos, HttpStatus.OK);
    }

    @RequestMapping(value = "itr/cpf/{cpf}",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> recuperaItr(@PathVariable("cpf") String cpf) {
        List<Imposto> impostos = client.recuperaItr(cpf);
        if (impostos.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(impostos);
        else return new ResponseEntity<>(impostos, HttpStatus.OK);
    }

}
