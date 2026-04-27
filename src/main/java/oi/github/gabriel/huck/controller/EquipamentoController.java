package oi.github.gabriel.huck.controller;

import oi.github.gabriel.huck.model.Equipamento;
import oi.github.gabriel.huck.model.dto.EquipamentoDTO;
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
    public EquipamentoDTO criar(@RequestBody EquipamentoDTO dto){
        return service.createde(dto);
    }
    @GetMapping("/{id}")
    public Equipamento buscar(@PathVariable Long id){
        return service.obterPorId(id);

    }
}
