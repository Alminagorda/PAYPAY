package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.ServiceDTO;
import pe.edu.upc.demotf.entities.Services;
import pe.edu.upc.demotf.servicesinterfaces.IServiceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServiceController {
    @Autowired
    private IServiceService sS;
    @PostMapping
    public void registrar(@RequestBody ServiceDTO sd){
        ModelMapper m=new ModelMapper();
        Services s=m.map(sd, Services.class);
        sS.insert(s);
    }
    @PutMapping
    public void modificar(@RequestBody ServiceDTO sd){
        ModelMapper m=new ModelMapper();
        Services s=m.map(sd, Services.class);
        sS.insert(s);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<ServiceDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ServiceDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){sS.delete(id);}

    public ServiceDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ServiceDTO dto=m.map(sS.lisId(id),ServiceDTO.class);
        return dto;
    }
    @GetMapping("/buscarServicioND")
    public List<ServiceDTO>buscar(@RequestParam String name, String descrip){
        return sS.findbynameandDescription(name,descrip).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ServiceDTO.class);
        }).collect(Collectors.toList());
    }
}
