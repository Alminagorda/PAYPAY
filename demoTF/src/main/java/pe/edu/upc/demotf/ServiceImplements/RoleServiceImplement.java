package pe.edu.upc.demotf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.entities.Role;
import pe.edu.upc.demotf.repositories.IRoleRepository;
import pe.edu.upc.demotf.servicesinterfaces.IRoleService;

import java.util.List;
@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;
    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Role lisId(int id) {
        return rR.findById(id).orElse(new Role());
    }
}
