package com.am.gerenciamento_tarefas.Service;


import com.am.gerenciamento_tarefas.Model.TarefaModel;
import com.am.gerenciamento_tarefas.Repositories.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public TarefaModel criarTarefa(TarefaModel tarefa) {
        return repository.save(tarefa);
    }

    public List<TarefaModel> listarTarefas() {
        return repository.findAll();
    }

    public Optional<TarefaModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarTarefa(Long id) {
        repository.deleteById(id);
    }
}
