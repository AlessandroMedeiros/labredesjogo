package labredes.repository;

import labredes.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RespostaRepository extends JpaRepository<Resposta, Integer> {

    boolean existsByIdPerguntaAndRespostaAndCorreta(Integer idPergunta, String resposta, boolean correta);
}
