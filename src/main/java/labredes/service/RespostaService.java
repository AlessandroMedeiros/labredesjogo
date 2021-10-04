package labredes.service;

import labredes.model.Resposta;
import labredes.repository.RespostaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RespostaService {

    private final RespostaRepository respostaRepository;

    public boolean isRespostaCerta(Integer idPergunta, String resposta) {
        return respostaRepository.existsByIdPerguntaAndRespostaAndCorreta(idPergunta, resposta, true);
    }

    public List<String> getResposta (Integer id){
        return respostaRepository.findAllByIdPergunta(id).stream().map(Resposta::getResposta).collect(Collectors.toList());
    }
}
