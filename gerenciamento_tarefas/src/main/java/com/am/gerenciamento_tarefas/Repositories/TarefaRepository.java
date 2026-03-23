package com.am.gerenciamento_tarefas.Repositories;
import com.am.gerenciamento_tarefas.Model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}