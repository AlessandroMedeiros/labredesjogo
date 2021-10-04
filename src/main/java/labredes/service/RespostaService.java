package labredes.service;

import labredes.model.Resposta;
import labredes.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public List<Resposta> listarPerguntas() {
        return respostaRepository.findAll();
    }

    public boolean isRespostaCerta(Integer idPergunta, String resposta){
        return respostaRepository.existsByIdPerguntaAndRespostaAndCorreta(idPergunta, resposta, true);
    }
}
