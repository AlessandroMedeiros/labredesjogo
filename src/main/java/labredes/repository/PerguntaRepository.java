package labredes.repository;

import labredes.model.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {

    List<Pergunta> findAllByNivelPergunta(Integer nivelPergunta);
}
