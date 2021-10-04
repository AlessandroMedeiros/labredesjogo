package labredes.service;

import labredes.model.Pergunta;
import labredes.repository.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PerguntaService {

    @Autowired
    private PerguntaRepository perguntaRepository;

    public List<Pergunta> listarPerguntas() {
        return perguntaRepository.findAll();
    }

    public Pergunta getRandomPergunta(Integer level) {
        List<Pergunta> lista = perguntaRepository.findAllByNivelPergunta(level);
        Random r = new Random();
        return lista.get(r.nextInt(lista.size()));
    }


}
