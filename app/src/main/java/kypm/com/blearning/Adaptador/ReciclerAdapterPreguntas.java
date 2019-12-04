package kypm.com.blearning.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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
    private int lastSelectedPosition = -1;

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
        /*holder.radioButton.setText(listPregunta.get(position).getRespuesta());
        holder.radioButton2.setText(listPregunta.get(position).getRespuesta());*/
        //holder.radioButton.setChecked(lastSelectedPosition == position);

        switch (position){
            case 0:
                holder.radioButton.setText(listPregunta.get(position).getPreguntaList().get(position));
                holder.radioButton2.setText(listPregunta.get(position).getPreguntaList().get(position+1));
                holder.radioButton3.setText(listPregunta.get(position).getPreguntaList().get(position+2));
                holder.radioButton4.setText(listPregunta.get(position).getPreguntaList().get(position+3));
                holder.radioButton5.setText(listPregunta.get(position).getPreguntaList().get(position+4));
                break;
            case 1:
                holder.radioButton.setText(listPregunta.get(position).getPreguntaList().get(position+4));
                holder.radioButton2.setText(listPregunta.get(position).getPreguntaList().get(position+5));
                holder.radioButton3.setText(listPregunta.get(position).getPreguntaList().get(position+6));
                holder.radioButton4.setText(listPregunta.get(position).getPreguntaList().get(position+7));
                holder.radioButton5.setText(listPregunta.get(position).getPreguntaList().get(position+8));
                break;
            case 2:
                holder.radioButton.setText(listPregunta.get(position).getPreguntaList().get(position+8));
                holder.radioButton2.setText(listPregunta.get(position).getPreguntaList().get(position+9));
                holder.radioButton3.setText(listPregunta.get(position).getPreguntaList().get(position+10));
                holder.radioButton4.setText(listPregunta.get(position).getPreguntaList().get(position+11));
                holder.radioButton5.setText(listPregunta.get(position).getPreguntaList().get(position+12));
                break;
            case 3:
                holder.radioButton.setText(listPregunta.get(position).getPreguntaList().get(position+12));
                holder.radioButton2.setText(listPregunta.get(position).getPreguntaList().get(position+13));
                holder.radioButton3.setText(listPregunta.get(position).getPreguntaList().get(position+14));
                holder.radioButton4.setText(listPregunta.get(position).getPreguntaList().get(position+15));
                holder.radioButton5.setText(listPregunta.get(position).getPreguntaList().get(position+16));
                break;
            case 4:
                holder.radioButton.setText(listPregunta.get(position).getPreguntaList().get(position+16));
                holder.radioButton2.setText(listPregunta.get(position).getPreguntaList().get(position+17));
                holder.radioButton3.setText(listPregunta.get(position).getPreguntaList().get(position+18));
                holder.radioButton4.setText(listPregunta.get(position).getPreguntaList().get(position+19));
                holder.radioButton5.setText(listPregunta.get(position).getPreguntaList().get(position+20));
                break;
        }

    }

    @Override
    public int getItemCount() {
        return listPregunta.size();
    }


    public class ViewHolderPregunta extends RecyclerView.ViewHolder {

        TextView pregunta;
        RadioButton radioButton, radioButton2, radioButton3,radioButton4,radioButton5;

        public ViewHolderPregunta(@NonNull View itemView) {
            super(itemView);
            pregunta = itemView.findViewById(R.id.tv_pregunta);

            radioButton = itemView.findViewById(R.id.radioButtonRespuesta);
            radioButton2 = itemView.findViewById(R.id.radioButtonRespuesta2);
            radioButton3 = itemView.findViewById(R.id.radioButtonRespuesta3);
            radioButton4 = itemView.findViewById(R.id.radioButtonRespuesta4);
            radioButton5 = itemView.findViewById(R.id.radioButtonRespuesta5);

            radioButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    lastSelectedPosition = getAdapterPosition();
                    notifyDataSetChanged();
                }
            });
        }
    }


}
