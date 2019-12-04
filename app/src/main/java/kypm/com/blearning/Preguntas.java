package kypm.com.blearning;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kypm.com.blearning.Adaptador.ReciclerAdapter;
import kypm.com.blearning.Adaptador.ReciclerAdapterPreguntas;
import kypm.com.blearning.Modelo.Libro;
import kypm.com.blearning.Modelo.Pregunta;

public class Preguntas extends AppCompatActivity {

    ImageView iv_regresar;
    TextView tv_cabecera;
    Button btn_terminar;
    Libro libro;
    RecyclerView recyclerView;
    ReciclerAdapterPreguntas reciclerAdapterPreguntas;
    List<Pregunta> listPreguntas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);

        iv_regresar = findViewById(R.id.regresar);
        tv_cabecera = findViewById(R.id.titulo_nombre_cabecera);
        btn_terminar = findViewById(R.id.btn_terminar);
        recyclerView = findViewById(R.id.rv_preguntas);

        libro =(Libro) getIntent().getSerializableExtra("sendTitulolibro");
        tv_cabecera.setText("Preguntas");


        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);


        listPreguntas = (List<Pregunta>) data(libro.getTitulo());
        reciclerAdapterPreguntas = new ReciclerAdapterPreguntas(getApplicationContext(), listPreguntas);
        recyclerView.setAdapter(reciclerAdapterPreguntas);

        iv_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(getApplicationContext(),LibroPdfActivity.class);
                finish();
            }
        });

        btn_terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(
                        Preguntas.this);
                myAlertDialog.setTitle("Calificacion:");
                myAlertDialog.setMessage("Esta es tu nota obtenida");
                myAlertDialog.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //listener.onPossitiveButtonClick();
                            }
                        });

                myAlertDialog.show();
            }

        });
    }

    public ArrayList<Pregunta> data(String titulo){
        ArrayList<String> respuestas = new ArrayList<>();
        respuestas.add("rpta1");
        respuestas.add("rpta2");
        respuestas.add("rpta3");
        respuestas.add("rpta4");
        respuestas.add("rpta5");

        respuestas.add("rpta1");
        respuestas.add("rpta2");
        respuestas.add("rpta3");
        respuestas.add("rpta4");
        respuestas.add("rpta5");


        ArrayList<Pregunta> preguntas = new ArrayList<>();
        switch (titulo){
            case "Libro 1":
                preguntas.add(new Pregunta("Libro 1","como se murio el cuento?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 1","Porque se murio el cuento?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 1","como se murio el cuento?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 1","Porque se murio el cuento?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 1","como se murio el cuento?","por estres",0,respuestas));
                break;
            case "Libro 2":
                preguntas.add(new Pregunta("Libro 2","Hasta?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 2","como ?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 2","Porque ?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 2","Seguro?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 2","Nunca?","por estres",0,respuestas));
                break;
            case "Libro 13":
                preguntas.add(new Pregunta("Libro 13","Huy?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 13","Hay?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 13","Hoy?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 13","Plp?","por estres",0,respuestas));
                preguntas.add(new Pregunta("Libro 13","Sera","por estres",0,respuestas));
                break;
        }
        /*preguntas.add(new Pregunta("Libro 1","como se murio el cuento?","por aburrimiento",1));
        preguntas.add(new Pregunta("Libro 1","como se murio el cuento?","por estres",0));*/

        return  preguntas;
    }
}
