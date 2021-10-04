package labredes.service;

import labredes.controller.DTO.PerguntaDTO;
import labredes.model.Pergunta;
import labredes.repository.PerguntaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class PerguntaService {

    private final PerguntaRepository perguntaRepository;

    private final RespostaService respostaService;

    public PerguntaDTO getRandomPergunta(Integer level) {
        List<Pergunta> lista = perguntaRepository.findAllByNivelPergunta(level);
        Random r = new Random();
        Pergunta pergunta = lista.get(r.nextInt(lista.size()));
        return getPerguntaDTO(pergunta);
    }

    private PerguntaDTO getPerguntaDTO(Pergunta pergunta) {
        PerguntaDTO perguntaDTO = new PerguntaDTO();
        perguntaDTO.setId(pergunta.getId());
        perguntaDTO.setPergunta(pergunta.getPergunta());
        perguntaDTO.setNivelPergunta(pergunta.getNivelPergunta());
        perguntaDTO.setLista(respostaService.getResposta(pergunta.getId()));
        return perguntaDTO;
    }
}
