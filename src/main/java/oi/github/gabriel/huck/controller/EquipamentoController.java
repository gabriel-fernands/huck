package oi.github.gabriel.huck.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import oi.github.gabriel.huck.model.Equipamento;
import oi.github.gabriel.huck.model.dto.EquipamentoDTO;
import oi.github.gabriel.huck.service.EquipamentoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/huck")
@Tag(name = "equipamento", description = "controller para cadastrar produtos")
public class EquipamentoController {

    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }
    @PostMapping
    @Operation(summary = "cadastra produto", description = "Método para cadastrar produto")
    @ApiResponse(responseCode = "200", description = "Equipamento cadastrado com sucesso")
    @ApiResponse(responseCode = "400", description = "Equipamento já cadastrado ")
    @ApiResponse(responseCode = "500", description = "Erro no servidor")
    public EquipamentoDTO criar(@RequestBody EquipamentoDTO dto){
        return service.createde(dto);
    }
    @GetMapping("/{id}") @Operation(summary = "busca de  produto", description = "Método para buscar produtos por id")
    @ApiResponse(responseCode = "200", description = "Equipamento encontrado com sucesso")
    @ApiResponse(responseCode = "404", description = "Equipamento não encontrado ")
    @ApiResponse(responseCode = "500", description = "Erro no servidor")
    public Equipamento buscar(@PathVariable Long id){
        return service.obterPorId(id);

    }
}
