package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.BankingEntityDTO;
import pe.edu.upc.demotf.entities.BankingEntity;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;
import pe.edu.upc.demotf.servicesinterfaces.IBankingEntityService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entidades")
public class BankingEntityController {
    @Autowired
    private IBankingEntityService bE;
    @PostMapping
    public void registrar(@RequestBody BankingEntityDTO b){
        ModelMapper m=new ModelMapper();
        BankingEntity be=m.map(b,BankingEntity.class);
        bE.insert(be);
    }
    @PutMapping
    public void modificar(@RequestBody BankingEntityDTO b){
        ModelMapper m=new ModelMapper();
        BankingEntity be=m.map(b,BankingEntity.class);
        bE.insert(be);
    }
    @GetMapping
    public List<BankingEntityDTO> list(){
        return bE.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,BankingEntityDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){bE.delete(id);}

    public BankingEntityDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        BankingEntityDTO dto=m.map(bE.lisId(id),BankingEntityDTO.class);
        return dto;
    }
}
