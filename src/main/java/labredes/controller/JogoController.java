package labredes.controller;

import labredes.model.Pergunta;
import labredes.service.PerguntaService;
import labredes.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogo")
public class JogoController {

    @Autowired
    private PerguntaService perguntaService;

    @Autowired
    private RespostaService respostaService;

    @GetMapping("/pergunta")
    public Pergunta listarPerguntas(Integer level) {
        return perguntaService.getRandomPergunta(level);
    }

    @GetMapping("/resposta")
    public boolean isRespostaCerta(Integer idPergunta, String resposta) {
        return respostaService.isRespostaCerta(idPergunta, resposta);
    }
}
