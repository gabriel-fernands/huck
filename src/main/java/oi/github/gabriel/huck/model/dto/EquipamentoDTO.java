package oi.github.gabriel.huck.model.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class EquipamentoDTO {


    private String nome;

    private String descricao;

    private BigDecimal valor;

}
