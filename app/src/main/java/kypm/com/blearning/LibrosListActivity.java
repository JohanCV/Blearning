package kypm.com.blearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kypm.com.blearning.Adaptador.ReciclerAdapter;
import kypm.com.blearning.Modelo.Libro;

public class LibrosListActivity extends AppCompatActivity implements ReciclerAdapter.OnNoteListener {

    TextView nombrecab;
    RecyclerView recyclerView;
    ReciclerAdapter reciclerAdapter;
    RecyclerView.LayoutManager recLayoutManager;
    List<Libro> listBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_list);

        nombrecab = findViewById(R.id.nombre_cabecera);
        recyclerView = findViewById(R.id.rv_libros);

        nombrecab.setText("Biblioteca");

        listBook = data();
        recLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(recLayoutManager);

        reciclerAdapter = new ReciclerAdapter(getApplicationContext(), listBook,this);
        recyclerView.setAdapter(reciclerAdapter);

    }

    public ArrayList<Libro> data(){
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new Libro(R.drawable.book,"Libro 1","Historia","3", "Esta historia 1"));
        libros.add(new Libro(R.drawable.book,"Libro 2","Historia","4", "Esta historia 2"));
        libros.add(new Libro(R.drawable.book,"Libro 3","Historia","5", "Esta historia 3"));
        libros.add(new Libro(R.drawable.book,"Libro 4","Historia","1", "Esta historia 4"));
        libros.add(new Libro(R.drawable.book,"Libro 5","Historia","2", "Esta historia 5"));
        libros.add(new Libro(R.drawable.book,"Libro 6","Historia","6", "Esta historia 6"));
        return  libros;
    }

    @Override
    public void onNoteClick(int position) {
        listBook.get(position);
        Intent i = new Intent(getApplicationContext(), LibroPdfActivity.class);
        i.putExtra("sendLibro",listBook.get(position));
        startActivity(i);
    }
}
