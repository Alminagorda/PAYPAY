package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.AccountBankingDTO;
import pe.edu.upc.demotf.dtos.MovementDTO;
import pe.edu.upc.demotf.entities.AccountBanking;
import pe.edu.upc.demotf.entities.Movement;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;
import pe.edu.upc.demotf.servicesinterfaces.IMoventService;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movimientos")
public class MovementController {
    @Autowired
    private IMoventService mS;
    @PostMapping
    public void registrar(@RequestBody MovementDTO md){
        ModelMapper m=new ModelMapper();
        Movement ac=m.map(md,Movement.class);
        mS.insert(ac);
    }
    @PutMapping
    public void modificar(@RequestBody MovementDTO md){
        ModelMapper m=new ModelMapper();
        Movement ac=m.map(md,Movement.class);
        mS.insert(ac);
    }
    @GetMapping
    public List<MovementDTO> list(){
        return mS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MovementDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){mS.delete(id);}

    @GetMapping("/listarid")
    public MovementDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        MovementDTO dto=m.map(mS.lisId(id),MovementDTO.class);
        return dto;
    }

    @GetMapping("/porfecha")
    public MovementDTO listarPorFecha(@PathVariable("date")Date date){
        ModelMapper m=new ModelMapper();
        MovementDTO dto=m.map(mS.findMovementsByDateMovement(date),MovementDTO.class);
        return dto;
    }
}
