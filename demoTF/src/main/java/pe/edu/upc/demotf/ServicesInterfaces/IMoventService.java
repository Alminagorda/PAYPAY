package pe.edu.upc.demotf.servicesinterfaces;


import pe.edu.upc.demotf.entities.Movement;

import java.util.Date;
import java.util.List;

public interface IMoventService {
    public void insert(Movement movement);
    public List<Movement> list();
    public void delete(int id);
    public Movement lisId(int id);
    public Movement findMovementsByDateMovement(Date dateM);
}
