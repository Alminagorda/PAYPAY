package pe.edu.upc.demotf.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.Dtos.ServiceDTO;
import pe.edu.upc.demotf.Entities.Services;
import pe.edu.upc.demotf.ServicesInterfaces.IServiceServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Services")
public class ServiceController {
    @Autowired
    private IServiceServices sS;
    @PostMapping
    public  void registrar(@RequestBody ServiceDTO s){
        ModelMapper m=new ModelMapper();
        Services sh=m.map(s,Services.class);
        sS.insert(sh);
    }
    @GetMapping("/listar")
    public List<ServiceDTO>lista(){
        return  sS.list().stream().map(y->{ModelMapper m=new ModelMapper();
        return  m.map(y,ServiceDTO.class);}).collect(Collectors.toList());
    }
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','USER','SUPERVISOR')&& !hasAnyAuthority('MARISOL')")
    public List<ServiceDTO>list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ServiceDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        sS.delete(id);
    }
    @GetMapping("{id}")
    public  ServiceDTO ListaId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ServiceDTO dto=m.map(sS.listId(id),ServiceDTO.class);
        return  dto;
    }
}
