package br.com.sgm.controller;

import br.com.sgm.model.Noticia;
import br.com.sgm.service.NoticiasService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/noticias")
public class NoticiasController {

    @Autowired
    private NoticiasService service;

    @GetMapping
    @ApiOperation(value = "Recupera todas noticias")
//    @Secured({"ROLE_ADMIN","ROLE_USER", "ROLE_CITIZEN"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok", response = Noticia.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "Sem noticias cadastradas")
    })
    public ResponseEntity recuperaTodas() {
        List<Noticia> noticias = service.recuperaTodas();
        if(noticias.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else return ResponseEntity.ok().body(noticias);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Recupera por id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Noticia encontrada", response = Noticia.class),
            @ApiResponse(code = 404, message = "Protocolo não encontrado")
    })
    public ResponseEntity recuperaPorId(@PathVariable("id") Integer id) {
       Optional<Noticia> noticias =  service.consultaPorId(id);
       if(noticias.isPresent()) {
           return ResponseEntity.ok().body(noticias);
       } else return ResponseEntity.notFound().build();
    }

    @GetMapping("/{titulo}/titulo")
    @ApiOperation(value = "Recupera por titulo")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Noticia encontrada", response = Noticia.class),
            @ApiResponse(code = 404, message = "Protocolo não encontrado")
    })
    public ResponseEntity recuperaPorTitulo(@PathVariable("titulo") String titulo) {
        Noticia noticias =  service.consultaPorTitulo(titulo);
        if(noticias != null) {
            return ResponseEntity.ok().body(noticias);
        } else return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ApiOperation(value = "Salvar noticia")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Noticia cadastrada", response = Noticia.class),
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 403, message = "Access Denied"),
    })
    public ResponseEntity<?> cadastrar(@RequestBody Noticia noticia) {
        Noticia saved = service.save(noticia);
        return ResponseEntity.ok().body(saved);
    }
}
