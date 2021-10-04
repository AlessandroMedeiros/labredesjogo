package labredes.model.DTO;

import java.util.ArrayList;

public class PerguntaDTO {

        public long id;
        public String titulo;
        public ArrayList<String> opcoesDeResposta;
        public int nivel;

    public PerguntaDTO(long id, String titulo, ArrayList<String> opcoesDeResposta, int nivel) {
        this.id = id;
        this.titulo = titulo;
        this.opcoesDeResposta = opcoesDeResposta;
        this.nivel = nivel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getOpcoesDeResposta() {
        return opcoesDeResposta;
    }

    public void setOpcoesDeResposta(ArrayList<String> opcoesDeResposta) {
        this.opcoesDeResposta = opcoesDeResposta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
