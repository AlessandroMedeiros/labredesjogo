package labredes.service;

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

    public Pergunta getRandomPergunta(Integer level) {
        List<Pergunta> lista = perguntaRepository.findAllByNivelPergunta(level);
        Random r = new Random();
        return lista.get(r.nextInt(lista.size()));
    }
}
