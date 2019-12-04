package kypm.com.blearning.Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pregunta implements Serializable {
    String titulo;
    String pregunta;
    String respuesta;
    int estado;
    ArrayList<String> preguntaList;

    public Pregunta(String titulo, String pregunta, String respuesta, int estado) {
        this.titulo = titulo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.estado = estado;
    }

    public Pregunta(String titulo, String pregunta, String respuesta, int estado, ArrayList<String> preguntaList) {
        this.titulo = titulo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.estado = estado;
        this.preguntaList = preguntaList;
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

    public ArrayList<String> getPreguntaList() {
        return preguntaList;
    }

    public void setPreguntaList(ArrayList<String> preguntaList) {
        this.preguntaList = preguntaList;
    }
}
