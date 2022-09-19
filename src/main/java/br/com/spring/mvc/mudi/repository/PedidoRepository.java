package br.com.spring.mvc.mudi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.mvc.mudi.models.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

  

}
