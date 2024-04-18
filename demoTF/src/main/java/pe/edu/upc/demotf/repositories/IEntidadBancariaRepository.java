package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.demotf.Entities.BankingEntitys;

public interface IEntidadBancariaRepository extends JpaRepository <BankingEntitys,Integer> {
}
