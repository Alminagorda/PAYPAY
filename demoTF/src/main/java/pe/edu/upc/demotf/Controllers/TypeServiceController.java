package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.AccountBankingDTO;
import pe.edu.upc.demotf.dtos.TypeServiceDTO;
import pe.edu.upc.demotf.entities.AccountBanking;
import pe.edu.upc.demotf.entities.TypeService;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;
import pe.edu.upc.demotf.servicesinterfaces.ITypeServiceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tiposervicios")
public class TypeServiceController {
    @Autowired
    private ITypeServiceService tS;
    @PostMapping
    public void registrar(@RequestBody TypeServiceDTO ts){
        ModelMapper m=new ModelMapper();
        TypeService t=m.map(ts, TypeService.class);
        tS.insert(t);
    }
    @PutMapping
    public void modificar(@RequestBody TypeServiceDTO ts){
        ModelMapper m=new ModelMapper();
        TypeService t=m.map(ts, TypeService.class);
        tS.insert(t);
    }
    @GetMapping
    public List<TypeServiceDTO> list(){
        return tS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,TypeServiceDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){tS.delete(id);}

    public TypeServiceDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TypeServiceDTO dto=m.map(tS.lisId(id), TypeServiceDTO.class);
        return dto;
    }

    public List<TypeServiceDTO> buscar(@RequestParam String nameType){
        return tS.findTypeServicesByNameTypeService(nameType).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TypeServiceDTO.class);
        }).collect(Collectors.toList());
    }
}
