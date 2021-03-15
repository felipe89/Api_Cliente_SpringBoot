package io.github.felipe89.cliente.model.repository;

import io.github.felipe89.cliente.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

}
