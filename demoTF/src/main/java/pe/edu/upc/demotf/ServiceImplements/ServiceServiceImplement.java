package pe.edu.upc.demotf.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.Entities.Services;
import pe.edu.upc.demotf.ServicesInterfaces.IServiceServices;
import pe.edu.upc.demotf.repositories.IServiceRepository;

import java.util.List;
@Service
public class ServiceServiceImplement implements IServiceServices {

    @Autowired
    private IServiceRepository sR;
    @Override
    public void insert(Services service) {
      sR.save(service);
    }

    @Override
    public List<Services> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
sR.deleteById(id);
    }

    @Override
    public void update(Services service) {

    }
    @Override
    public Services listId(int id){
        return sR.findById(id).orElse(new Services());
    }

    @Override
    public List<Services> findbynameandDescription(String name, String descrip) {
        return sR.findByNameServiceAndDescriptionService(name,descrip);
    }
}
