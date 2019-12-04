package kypm.com.blearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import kypm.com.blearning.Modelo.Libro;
import kypm.com.blearning.Modelo.Pregunta;

public class LibroPdfActivity extends AppCompatActivity {

    ImageView iv_regresar;
    TextView tv_cabecera, titulo,tipo,nivel,contenido;
    Button btn_preguntas;
    Libro libro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro_pdf);

        iv_regresar = findViewById(R.id.regresar);
        tv_cabecera = findViewById(R.id.titulo_nombre_cabecera);
        titulo = findViewById(R.id.tvpdf_titulo);
        tipo = findViewById(R.id.tv_pdf_tipo);
        nivel = findViewById(R.id.tv_pdf_nivel);
        contenido = findViewById(R.id.tv_pdf_contenido);
        btn_preguntas = findViewById(R.id.btn_preguntas);
        libro =(Libro) getIntent().getSerializableExtra("sendLibro");

        tv_cabecera.setText("Lectura");
        titulo.setText(libro.getTitulo());
        tipo.setText(libro.getTipo());
        nivel.setText(libro.getNivel());
        contenido.setText(libro.getContenido());

        iv_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(getApplicationContext(),LibrosListActivity.class);
                finish();
            }
        });

        btn_preguntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent preguntas = new Intent(getApplicationContext(), Preguntas.class);
                preguntas.putExtra("sendTitulolibro",libro);
                startActivity(preguntas);
            }
        });
    }
}
