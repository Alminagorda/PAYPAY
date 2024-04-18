package pe.edu.upc.demotf.Controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.Dtos.BankingEntityDTO;
import pe.edu.upc.demotf.Entities.BankingEntitys;
import pe.edu.upc.demotf.ServicesInterfaces.IBankingEntityServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bankingentity")
public class BankingEntityController {
@Autowired
    private IBankingEntityServices bS;
@PostMapping
    public  void registrar (@RequestBody BankingEntityDTO b){
    ModelMapper m = new ModelMapper();
    BankingEntitys be = m.map(b,BankingEntitys.class);
    bS.insert((be));
}
@GetMapping
    public List<BankingEntityDTO> list(){
    return bS.list().stream().map(y-> {
        ModelMapper m = new ModelMapper();
        return m.map(y, BankingEntityDTO.class);
    }).collect(Collectors.toList());
}
@DeleteMapping("/{id}")
public  void  eliminar ( @PathVariable("id") Integer id){
    bS.delete(id);
}
@GetMapping("/{id}")
public  BankingEntityDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        BankingEntityDTO dto =m.map(bS.listId(id), BankingEntityDTO.class);
        return  dto;
    }
}