package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.AccountBankingDTO;
import pe.edu.upc.demotf.dtos.RoleDTO;
import pe.edu.upc.demotf.entities.AccountBanking;
import pe.edu.upc.demotf.entities.Role;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;
import pe.edu.upc.demotf.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;
    @PostMapping
    public void registrar(@RequestBody Role r){
        ModelMapper m=new ModelMapper();
        Role rol=m.map(r,Role.class);
        rS.insert(rol);
    }
    @PutMapping
    public void modificar(@RequestBody Role r){
        ModelMapper m=new ModelMapper();
        Role rol=m.map(r,Role.class);
        rS.insert(rol);
    }
    @GetMapping
    public List<RoleDTO> list(){
        return rS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){rS.delete(id);}

    public RoleDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RoleDTO dto=m.map(rS.lisId(id),RoleDTO.class);
        return dto;
    }
}
