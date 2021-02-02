package br.com.wesley.mota.registrocartorio.controller;

import br.com.wesley.mota.registrocartorio.controller.dto.CartorioRq;
import br.com.wesley.mota.registrocartorio.controller.dto.CartorioRs;
import br.com.wesley.mota.registrocartorio.model.Cartorio;
import br.com.wesley.mota.registrocartorio.repository.CartorioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cartorio")
@Api(value="Cartorios API REST")
@CrossOrigin(origins = "*")

public class CartorioController {

    public CartorioController(CartorioRepository cartorioRepository) {
        this.cartorioRepository = cartorioRepository;
    }

    private final CartorioRepository cartorioRepository;

    @GetMapping("/")
    @ApiOperation(value = "Retorna os dados de cadastro dos cartorios")
    public List<CartorioRs> findAll(){

        var cartorio = cartorioRepository.findAll();
        return cartorio
                .stream()
                .map(CartorioRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna os dados de cadastro de um único cartorio")
    public CartorioRs findById(@PathVariable("id") Long id){
        var cartorio = cartorioRepository.getOne(id);
        return CartorioRs.converter(cartorio);
    }

    @PostMapping("/")
    @ApiOperation(value = "Cadastra os dados do cartorio")
    public void saveCartorio(@RequestBody CartorioRq cartorio){
        var c = new Cartorio();
        c.setNm_cartorio(cartorio.getNm_cartorio());
        c.setLogradouro(cartorio.getLogradouro());
        c.setCEP(cartorio.getCEP());
        c.getNumero(cartorio.getNumero(cartorio.getNumero()));
        c.setTp_certidoes(cartorio.getTp_certidoes());
        cartorioRepository.save(c);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Altera os dados de um cartorio")
    public void updateCartorio(@PathVariable("id") Long id, @RequestBody CartorioRq cartorio) throws Exception {
        var c = cartorioRepository.findById(id);
        if(c.isPresent()){
            var cartorioSave = c.get();
            cartorioSave.setNm_cartorio(cartorio.getNm_cartorio());
            cartorio.setLogradouro(cartorio.getLogradouro());
            cartorio.setCEP(cartorio.getCEP());
            cartorio.getNumero(cartorio.getNumero(cartorio.getNumero()));
            cartorio.setTp_certidoes(cartorio.getTp_certidoes());
            cartorioRepository.save(cartorioSave);
        } else{
            throw new Exception("Cartorio não encontrado");
        }
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta o registro de um cartorio")
    public void deleteCartorio(@PathVariable("id") Long id, @RequestBody CartorioRq cartorio) throws Exception {
        var c = cartorioRepository.findById(id);
        if(c.isPresent()){
            var cartorioSave = c.get();
            cartorioSave.setNm_cartorio(cartorio.getNm_cartorio());
            cartorio.setLogradouro(cartorio.getLogradouro());
            cartorio.setCEP(cartorio.getCEP());
            cartorio.getNumero(cartorio.getNumero(cartorio.getNumero()));
            cartorio.setTp_certidoes(cartorio.getTp_certidoes());
            cartorioRepository.delete(cartorioSave);
        } else{
            throw new Exception("Cartorio não encontrado");
        }
    }


}
