package facturacion.api_producto.Producto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    public List<Producto> findAll();
    
}
