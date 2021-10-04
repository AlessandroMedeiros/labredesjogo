package labredes.service;

import labredes.repository.RespostaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RespostaService {

    private final RespostaRepository respostaRepository;

    public boolean isRespostaCerta(Integer idPergunta, String resposta) {
        return respostaRepository.existsByIdPerguntaAndRespostaAndCorreta(idPergunta, resposta, true);
    }
}
