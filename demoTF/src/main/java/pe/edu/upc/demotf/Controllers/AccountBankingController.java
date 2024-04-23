package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.AccountBankingDTO;
import pe.edu.upc.demotf.entities.AccountBanking;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cuentas")
public class AccountBankingController {
    @Autowired
    private IAccountBankingService aS;
    @PostMapping
    public void registrar(@RequestBody AccountBankingDTO a){
        ModelMapper m=new ModelMapper();
        AccountBanking ac=m.map(a,AccountBanking.class);
        aS.insert(ac);
    }
    @PutMapping
    public void modificar(@RequestBody AccountBankingDTO a){
        ModelMapper m=new ModelMapper();
        AccountBanking ac=m.map(a,AccountBanking.class);
        aS.insert(ac);
    }
    @GetMapping
    public List<AccountBankingDTO> list(){
        return aS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,AccountBankingDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){aS.delete(id);}

    public AccountBankingDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        AccountBankingDTO dto=m.map(aS.lisId(id),AccountBankingDTO.class);
        return dto;
    }
}
