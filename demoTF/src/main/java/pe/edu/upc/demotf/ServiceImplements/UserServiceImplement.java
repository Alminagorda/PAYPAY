package pe.edu.upc.demotf.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demotf.Entities.User;
import pe.edu.upc.demotf.ServicesInterfaces.IUserService;
import pe.edu.upc.demotf.repositories.IUserRepository;

import java.util.List;
@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(User users) {
        uR.save(users);
    }

    @Override
    public List<User> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int dni) {
        uR.deleteById(dni);
    }

    @Override
    public List<User> findByLastnameUser(String lastname) {
        return uR.findByLastnameUser(lastname);
    }
}
