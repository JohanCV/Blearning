package kypm.com.blearning.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import kypm.com.blearning.Modelo.Libro;
import kypm.com.blearning.Modelo.Pregunta;
import kypm.com.blearning.R;

public class ReciclerAdapterPreguntas extends RecyclerView.Adapter<ReciclerAdapterPreguntas.ViewHolderPregunta>{

    private Context context;
    private List<Pregunta> listPregunta;

    public ReciclerAdapterPreguntas(Context context, List<Pregunta> listPregunta){
        this.context = context;
        this.listPregunta = listPregunta;
    }

    @NonNull
    @Override
    public ViewHolderPregunta onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_preguntas, parent, false);
        return new ViewHolderPregunta(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPregunta holder, int position) {
        holder.pregunta.setText(position+1+". "+listPregunta.get(position).getPregunta());
        holder.radioButton.setText(listPregunta.get(position).getRespuesta());
    }

    @Override
    public int getItemCount() {
        return listPregunta.size();
    }


    public class ViewHolderPregunta extends RecyclerView.ViewHolder {

        TextView pregunta;
        RadioButton radioButton;

        public ViewHolderPregunta(@NonNull View itemView) {
            super(itemView);
            pregunta = itemView.findViewById(R.id.tv_pregunta);
            radioButton = itemView.findViewById(R.id.radioButtonRespuesta);
        }
    }


}
