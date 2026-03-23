package com.am.gerenciamento_tarefas.Controller;


import com.am.gerenciamento_tarefas.Model.TarefaModel;
import com.am.gerenciamento_tarefas.Service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public TarefaModel criarTarefa(@RequestBody TarefaModel tarefa) {
        return service.criarTarefa(tarefa);
    }

    @GetMapping
    public List<TarefaModel> listarTarefas() {
        return service.listarTarefas();
    }

    @GetMapping("/{id}")
    public Optional<TarefaModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        service.deletarTarefa(id);
    }
}
