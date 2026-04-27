package oi.github.gabriel.huck.controller;

import oi.github.gabriel.huck.model.Equipamento;
import oi.github.gabriel.huck.service.EquipamentoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/huck")
public class EquipamentoController {

    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }
    @PostMapping
    public Equipamento criar(@RequestBody Equipamento equipamento){
        return service.createde(equipamento);
    }
    @GetMapping("/{id}")
    public Equipamento buscar(@PathVariable Long id){
        return service.obterPorId(id);

    }
}
