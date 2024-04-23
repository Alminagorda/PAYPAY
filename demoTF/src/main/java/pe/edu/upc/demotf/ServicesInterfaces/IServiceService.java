package pe.edu.upc.demotf.servicesinterfaces;
import pe.edu.upc.demotf.entities.Services;

import java.util.List;

public interface IServiceService {
    public void insert(Services ser);
    public List<Services> list();
    public void delete(int id);
    public Services lisId(int id);

    public List<Services>findbynameandDescription(String name, String descrip);
}
