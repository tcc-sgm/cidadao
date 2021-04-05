package br.com.sgm.controller;

import br.com.sgm.model.Imposto;
import br.com.sgm.service.SturService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("imposto/")
public class CidadaoController {

    @Autowired
    private SturService client;

    @GetMapping(path = "iptu/cpf/{cpf}/inscricao/{inscricao}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "${user-controller.signup}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 403, message = "Access Denied"),
    })
    public ResponseEntity<?> recuperaIptu(@PathVariable("cpf") String cpf, @PathVariable("inscricao") Integer inscricao) {
        List<Imposto> impostos = client.recuperaIptu(cpf, inscricao);
        if (impostos.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(impostos);
        else return new ResponseEntity<>(impostos, HttpStatus.OK);
    }

    @GetMapping(path = "itr/cpf/{cpf}/inscricao/{inscricao}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "${user-controller.signup}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 403, message = "Access Denied"),
    })
    public ResponseEntity<?> recuperaItr(@PathVariable("cpf") String cpf, @PathVariable("inscricao") Integer inscricao) {
        List<Imposto> impostos = client.recuperaItr(cpf, inscricao);
        if (impostos.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(impostos);
        else return new ResponseEntity<>(impostos, HttpStatus.OK);
    }
}
