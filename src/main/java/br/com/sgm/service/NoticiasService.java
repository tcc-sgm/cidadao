package br.com.sgm.service;

import br.com.sgm.model.Noticia;
import br.com.sgm.repository.NoticiaRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiasService {

    @Autowired
    private NoticiaRepository repository;

    public List<Noticia> recuperaTodas() {
        return repository.findAll();
    }

    public Optional<Noticia> consultaPorId(Integer id) {
        return repository.findById(id);
    }

    public Noticia save(Noticia noticia) {
        return repository.save(noticia);
    }

    public Noticia consultaPorTitulo(String titulo) {
        return repository.findByTituloIgnoreCase(titulo);
    }
}
