package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.Movement;
import pe.edu.upc.demotf.repositories.IMovementRepository;
import pe.edu.upc.demotf.servicesinterfaces.IMoventService;

import java.util.Date;
import java.util.List;
@Service
public class MovementServiceImplement implements IMoventService {
   @Autowired
   private IMovementRepository mR;
    @Override
    public void insert(Movement movement) {
        mR.save(movement);
    }

    @Override
    public List<Movement> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }

    @Override
    public Movement lisId(int id) {
        return mR.findById(id).orElse(new Movement());
    }

    @Override
    public Movement findMovementsByDateMovement(Date dateM) {
        return mR.findMovementsByDateMovement(dateM);
    }
}
