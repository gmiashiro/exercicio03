package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
