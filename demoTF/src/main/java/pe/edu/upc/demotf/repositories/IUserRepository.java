package pe.edu.upc.demotf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demotf.Entities.User;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>  {
    public List<User> findByLastnameUser(String lastname);

}
