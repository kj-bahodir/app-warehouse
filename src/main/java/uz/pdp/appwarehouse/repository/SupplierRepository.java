package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Supplier;

@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
