package pe.edu.upc.demotf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.dtos.AccountBankingDTO;
import pe.edu.upc.demotf.dtos.VoucherDTO;
import pe.edu.upc.demotf.entities.AccountBanking;
import pe.edu.upc.demotf.entities.Voucher;
import pe.edu.upc.demotf.servicesinterfaces.IAccountBankingService;
import pe.edu.upc.demotf.servicesinterfaces.IVoucherService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comprobantes")
public class VoucherController {
    @Autowired
    private IVoucherService vS;
    @PostMapping
    public void registrar(@RequestBody VoucherDTO vdto){
        ModelMapper m=new ModelMapper();
        Voucher v=m.map(vdto,Voucher.class);
        vS.insert(v);
    }
    @PutMapping
    public void modificar(@RequestBody VoucherDTO vdto){
        ModelMapper m=new ModelMapper();
        Voucher v=m.map(vdto,Voucher.class);
        vS.insert(v);
    }
    @GetMapping
    public List<VoucherDTO> list(){
        return vS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,VoucherDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){vS.delete(id);}

    public VoucherDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        VoucherDTO dto=m.map(vS.lisId(id),VoucherDTO.class);
        return dto;
    }
}
