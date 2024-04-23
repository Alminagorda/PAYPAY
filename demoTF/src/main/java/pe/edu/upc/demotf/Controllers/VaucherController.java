package pe.edu.upc.demotf.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demotf.Dtos.VoucherDTO;
import pe.edu.upc.demotf.Entities.Voucher;
import pe.edu.upc.demotf.ServicesInterfaces.IVoucherService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vaucher")
public class VaucherController {

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
   // @GetMapping("/cantidadPVaucher")
   // public List
}
