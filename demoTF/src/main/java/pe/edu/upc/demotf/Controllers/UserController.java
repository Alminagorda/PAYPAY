package pe.edu.upc.demotf.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.Dtos.UserDTO;
import pe.edu.upc.demotf.Entities.User;
import pe.edu.upc.demotf.ServicesInterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;
    @PostMapping
    public void registrar(@RequestBody UserDTO u){
        ModelMapper m=new ModelMapper();
        User s=m.map(u,User.class);
        uS.insert(s);
    }

    @GetMapping
public List<UserDTO> list(){
       return uS.list().stream().map(y->{
           ModelMapper m=new ModelMapper();
           return m.map(y,UserDTO.class);
       }).collect(Collectors.toList());
}
@DeleteMapping("/{dni}")
    public void eleminar(@PathVariable("dni") Integer dni){
       uS.delete(dni);
    }

}
