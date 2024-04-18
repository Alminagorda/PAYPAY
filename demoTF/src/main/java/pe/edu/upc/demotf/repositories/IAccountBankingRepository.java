package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.entities.AccountBanking;

@Repository
public interface IAccountBankingRepository extends JpaRepository<AccountBanking,Integer> {
}
