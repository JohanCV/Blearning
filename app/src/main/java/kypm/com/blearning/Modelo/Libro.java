package kypm.com.blearning.Modelo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Libro implements Serializable {
    int imgLibro;
    String titulo;
    String tipo;
    String nivel;
    String contenido;

    public Libro(int imgLibro, String titulo, String tipo, String nivel, String contenido) {
        this.imgLibro = imgLibro;
        this.titulo = titulo;
        this.tipo = tipo;
        this.nivel = nivel;
        this.contenido = contenido;
    }

    public int getImgLibro() {
        return imgLibro;
    }

    public void setImgLibro(int imgLibro) {
        this.imgLibro = imgLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


}
