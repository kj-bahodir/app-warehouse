package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Output;

@RepositoryRestResource(path = "output")
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
