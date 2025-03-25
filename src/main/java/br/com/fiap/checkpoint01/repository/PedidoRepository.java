package br.com.fiap.checkpoint01.repository;

import br.com.fiap.checkpoint01.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}