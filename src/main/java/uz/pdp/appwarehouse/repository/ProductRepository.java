package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Product;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
