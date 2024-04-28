package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.entities.BankingEntity;

@Repository
public interface IBankingEntityRepository extends JpaRepository<BankingEntity,Integer> {
}
