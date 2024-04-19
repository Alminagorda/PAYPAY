package pe.edu.upc.demotf.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.Entities.Role;
import pe.edu.upc.demotf.ServicesInterfaces.IRoleService;
import pe.edu.upc.demotf.repositories.IRoleRepository;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;
    @Override
    public void insert(Role rol) {
      rR.save(rol);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Role listarId(Long idRol) {
        return rR.findById(idRol).orElse(new Role());
    }
}
