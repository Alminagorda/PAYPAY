package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.Services;
import pe.edu.upc.demotf.repositories.IServiceRepository;
import pe.edu.upc.demotf.servicesinterfaces.IServiceService;

import java.util.List;

@Service
public class ServiceServiceImplement implements IServiceService {
    @Autowired
    private IServiceRepository sR;

    @Override
    public void insert(Services ser) {
        sR.save(ser);
    }

    @Override
    public List<Services> list() {
       return sR.findAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Services lisId(int id) {
        return null;
    }

    @Override
    public List<Services> findbynameandDescription(String name, String descrip) {
        return sR.findByNameServiceAndDescriptionService(name,descrip);
    }

}
