package oi.github.gabriel.huck.service;

import oi.github.gabriel.huck.model.Equipamento;
import oi.github.gabriel.huck.repository.EquipamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {

    private EquipamentoRepository repository;

    public EquipamentoService(EquipamentoRepository repository) {
        this.repository = repository;
    }

    public Equipamento createde(Equipamento equipamento){
        return repository.save(equipamento);
    }
    public Equipamento obterPorId(Long id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("id não encontrado"));
    }
}
