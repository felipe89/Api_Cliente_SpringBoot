package io.github.felipe89.cliente.model.repository;

import io.github.felipe89.cliente.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
