package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.TypeService;
import pe.edu.upc.demotf.repositories.ITypeServiceRepository;
import pe.edu.upc.demotf.servicesinterfaces.ITypeServiceService;

import java.util.List;

@Service
public class TypeServiceServiceImplement implements ITypeServiceService {
    @Autowired
    private ITypeServiceRepository tR;
    @Override
    public void insert(TypeService typeService) {
        tR.save(typeService);
    }

    @Override
    public List<TypeService> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public TypeService lisId(int id) {
        return tR.findById(id).orElse(new TypeService());
    }

    @Override
    public List<TypeService> findTypeServicesByNameTypeService(String typeName) {
        return tR.findTypeServicesByNameTypeService(typeName);
    }
}
