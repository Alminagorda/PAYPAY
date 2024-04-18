package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.entities.Movement;

import java.util.Date;

@Repository
public interface IMovementRepository extends JpaRepository<Movement,Integer> {


    @Query("from Movement m where m.dateMovement=:d")
    public Movement findMovementsByDateMovement(@Param("d") Date dateM);
}
