package labredes.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pergunta")
public class Pergunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pergunta")
    private String pergunta;

    @Column(name = "NIVEL_PERGUNTA")
    private Integer nivelPergunta;

    public Pergunta() {
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
}
