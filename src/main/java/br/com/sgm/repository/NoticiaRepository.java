package br.com.sgm.repository;

import br.com.sgm.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Integer> {

    Noticia findByTituloIgnoreCase(String titulo);

}
