package com.example.aula3.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.aula3.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByPublished(boolean published);

    List<Projeto> findByNameContains(String name);
}
