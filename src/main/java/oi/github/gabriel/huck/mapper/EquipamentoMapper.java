package oi.github.gabriel.huck.mapper;

import oi.github.gabriel.huck.model.Equipamento;
import oi.github.gabriel.huck.model.dto.EquipamentoDTO;

public class EquipamentoMapper {


    public static Equipamento toEnty(EquipamentoDTO dto){
        return Equipamento.builder()
                .nome(dto.getNome())
                .valor(dto.getValor())
                .descricao(dto.getDescricao())
                .build();
    }
    public static EquipamentoDTO toDto(Equipamento enty){
        return EquipamentoDTO.builder()
                .nome(enty.getNome())
                .valor(enty.getValor())
                .descricao(enty.getDescricao())
                .build();
    }
}
