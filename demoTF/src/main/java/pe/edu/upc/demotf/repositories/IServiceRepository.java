package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.Entities.Services;

@Repository
public interface IServiceRepository extends JpaRepository<Services,Integer> {

}
