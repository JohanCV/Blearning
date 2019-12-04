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
    int nota=0;

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
                myAlertDialog.setMessage("Esta es tu nota obtenida:  "+nota);
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
        ArrayList<Pregunta> preguntas = new ArrayList<>();

        String title = titulo;
        switch (titulo){
            case "Libro 1":
                preguntas.add(new Pregunta("P1","como se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P2","Porque se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P3","como se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P4","Porque se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P5","como se murio el cuento?","por estres",0,getRespuestas(title)));
                break;
            case "Libro 2":
                preguntas.add(new Pregunta("P1","Como ?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P2","Porque SI ?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P3","Donde?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P4","Porque?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P5","Porque no?","por estres",0,getRespuestas(title)));
                break;
            case "Libro 3":
                preguntas.add(new Pregunta("P1","Hau?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P2","Hey?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P3","Hooo?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P4","Huuu?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P5","Huii?","por estres",0,getRespuestas(title)));
                break;
            case "Libro 4":
                preguntas.add(new Pregunta("P1","waa?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P2","wuu?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P3","woo?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P4","wiu?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P5","wee?","por estres",0,getRespuestas(title)));
                break;
            case "Libro 5":
                preguntas.add(new Pregunta("P1","como se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P2","Porque se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P3","como se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P4","Porque se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P5","como se murio el cuento?","por estres",0,getRespuestas(title)));
                break;
            case "Libro 6":
                preguntas.add(new Pregunta("P1","como se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P2","Porque se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P3","como se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P4","Porque se murio el cuento?","por estres",0,getRespuestas(title)));
                preguntas.add(new Pregunta("P5","como se murio el cuento?","por estres",0,getRespuestas(title)));
                break;
        }

        return  preguntas;
    }

    public ArrayList<String> getRespuestas(String titulo){
        ArrayList<String> respuestas = new ArrayList<>();

        switch (titulo){
            case "Libro 1":
                //Pregunta 1
                respuestas.add("rpta1");
                respuestas.add("rpta2");
                respuestas.add("rpta3");
                respuestas.add("rpta4");
                respuestas.add("rpta5");
                //Pregunta 2
                respuestas.add("rpta6");
                respuestas.add("rpta7");
                respuestas.add("rpta8");
                respuestas.add("rpta9");
                respuestas.add("rpta10");
                //Pregunta 3
                respuestas.add("rpta11");
                respuestas.add("rpta12");
                respuestas.add("rpta13");
                respuestas.add("rpta14");
                respuestas.add("rpta15");
                //Pregunta 4
                respuestas.add("rpta16");
                respuestas.add("rpta17");
                respuestas.add("rpta18");
                respuestas.add("rpta19");
                respuestas.add("rpta20");
                //Pregunta 5
                respuestas.add("rpta21");
                respuestas.add("rpta22");
                respuestas.add("rpta23");
                respuestas.add("rpta24");
                respuestas.add("rpta25");
                break;
            case "Libro 2":
                //Pregunta 1
                respuestas.add("rp1");
                respuestas.add("rp2");
                respuestas.add("rp3");
                respuestas.add("rp4");
                respuestas.add("rp5");
                //Pregunta 2
                respuestas.add("rp6");
                respuestas.add("rp7");
                respuestas.add("rp8");
                respuestas.add("rp9");
                respuestas.add("rp10");
                //Pregunta 3
                respuestas.add("rp11");
                respuestas.add("rp12");
                respuestas.add("rp13");
                respuestas.add("rp14");
                respuestas.add("rp15");
                //Pregunta 4
                respuestas.add("rp16");
                respuestas.add("rp17");
                respuestas.add("rp18");
                respuestas.add("rp19");
                respuestas.add("rp20");
                //Pregunta 5
                respuestas.add("rp21");
                respuestas.add("rp22");
                respuestas.add("rp23");
                respuestas.add("rp24");
                respuestas.add("rp25");
                break;
            case "Libro 3":
                //Pregunta 1
                respuestas.add("rpta1s");
                respuestas.add("rpta2s");
                respuestas.add("rpta3s");
                respuestas.add("rpta4s");
                respuestas.add("rpta5s");
                //Pregunta 2
                respuestas.add("rpta6s");
                respuestas.add("rpta7s");
                respuestas.add("rpta8s");
                respuestas.add("rpta9s");
                respuestas.add("rpta10s");
                //Pregunta 3
                respuestas.add("rpta11s");
                respuestas.add("rpta12s");
                respuestas.add("rpta13s");
                respuestas.add("rpta14s");
                respuestas.add("rpta15s");
                //Pregunta 4
                respuestas.add("rpta16s");
                respuestas.add("rpta17s");
                respuestas.add("rpta18s");
                respuestas.add("rpta19s");
                respuestas.add("rpta20s");
                //Pregunta 5
                respuestas.add("rpta21s");
                respuestas.add("rpta22s");
                respuestas.add("rpta23s");
                respuestas.add("rpta24s");
                respuestas.add("rpta25s");
                break;
            case "Libro 4":
                //Pregunta 1
                respuestas.add("r1");
                respuestas.add("r2");
                respuestas.add("r3");
                respuestas.add("r4");
                respuestas.add("r5");
                //Pregunta 2
                respuestas.add("r6");
                respuestas.add("r7");
                respuestas.add("r8");
                respuestas.add("r9");
                respuestas.add("r10");
                //Pregunta 3
                respuestas.add("r11");
                respuestas.add("r12");
                respuestas.add("r13");
                respuestas.add("r4");
                respuestas.add("r15");
                //Pregunta 4
                respuestas.add("r16");
                respuestas.add("r17");
                respuestas.add("r18");
                respuestas.add("r19");
                respuestas.add("r20");
                //Pregunta 5
                respuestas.add("r21");
                respuestas.add("r22");
                respuestas.add("r23");
                respuestas.add("r24");
                respuestas.add("r25");
                break;
            case "Libro 5":
                //Pregunta 1
                respuestas.add("rpta1");
                respuestas.add("rpta2");
                respuestas.add("rpta3");
                respuestas.add("rpta4");
                respuestas.add("rpta5");
                //Pregunta 2
                respuestas.add("rpta6");
                respuestas.add("rpta7");
                respuestas.add("rpta8");
                respuestas.add("rpta9");
                respuestas.add("rpta10");
                //Pregunta 3
                respuestas.add("rpta11");
                respuestas.add("rpta12");
                respuestas.add("rpta13");
                respuestas.add("rpta14");
                respuestas.add("rpta15");
                //Pregunta 4
                respuestas.add("rpta16");
                respuestas.add("rpta17");
                respuestas.add("rpta18");
                respuestas.add("rpta19");
                respuestas.add("rpta20");
                //Pregunta 5
                respuestas.add("rpta21");
                respuestas.add("rpta22");
                respuestas.add("rpta23");
                respuestas.add("rpta24");
                respuestas.add("rpta25");
                break;
            case "Libro 6":
                //Pregunta 1
                respuestas.add("rpta1");
                respuestas.add("rpta2");
                respuestas.add("rpta3");
                respuestas.add("rpta4");
                respuestas.add("rpta5");
                //Pregunta 2
                respuestas.add("rpta6");
                respuestas.add("rpta7");
                respuestas.add("rpta8");
                respuestas.add("rpta9");
                respuestas.add("rpta10");
                //Pregunta 3
                respuestas.add("rpta11");
                respuestas.add("rpta12");
                respuestas.add("rpta13");
                respuestas.add("rpta14");
                respuestas.add("rpta15");
                //Pregunta 4
                respuestas.add("rpta16");
                respuestas.add("rpta17");
                respuestas.add("rpta18");
                respuestas.add("rpta19");
                respuestas.add("rpta20");
                //Pregunta 5
                respuestas.add("rpta21");
                respuestas.add("rpta22");
                respuestas.add("rpta23");
                respuestas.add("rpta24");
                respuestas.add("rpta25");
                break;

        }
        return respuestas;
    }
}
