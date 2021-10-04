package labredes.controller.DTO;

import labredes.model.Resposta;

import java.util.List;

public class PerguntaDTO {

    private Integer id;
    private String pergunta;
    private Integer nivelPergunta;
    private List<String> lista;

    public PerguntaDTO() {
    }

    public PerguntaDTO(Integer id, String pergunta, Integer nivelPergunta, List<String> lista) {
        this.id = id;
        this.pergunta = pergunta;
        this.nivelPergunta = nivelPergunta;
        this.lista = lista;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Integer getNivelPergunta() {
        return nivelPergunta;
    }

    public void setNivelPergunta(Integer nivelPergunta) {
        this.nivelPergunta = nivelPergunta;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}
