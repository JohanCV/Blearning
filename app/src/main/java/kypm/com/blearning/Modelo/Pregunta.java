package kypm.com.blearning.Modelo;

import java.io.Serializable;

public class Pregunta implements Serializable {
    String titulo;
    String pregunta;
    String respuesta;
    int estado;

    public Pregunta(String titulo, String pregunta, String respuesta, int estado) {
        this.titulo = titulo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
