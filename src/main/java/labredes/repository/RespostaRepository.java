package labredes.repository;

import labredes.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RespostaRepository extends JpaRepository<Resposta, Integer> {

    boolean existsByIdPerguntaAndRespostaAndCorreta(Integer idPergunta, String resposta, boolean correta);

    List<Resposta> findAllByIdPergunta(Integer idPergunta);
}
