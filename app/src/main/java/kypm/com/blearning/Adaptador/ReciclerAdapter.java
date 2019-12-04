package kypm.com.blearning.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import kypm.com.blearning.Modelo.Libro;
import kypm.com.blearning.R;

public class ReciclerAdapter extends RecyclerView.Adapter<ReciclerAdapter.ViewHolderLibros>{

    private Context context;
    private List<Libro> listLibros;
    private OnNoteListener mOnNoteListener;

    public ReciclerAdapter(Context context, List<Libro> listLibros, OnNoteListener mOnNoteListener){
        this.context = context;
        this.listLibros = listLibros;
        this.mOnNoteListener = mOnNoteListener;
    }

    @NonNull
    @Override
    public ViewHolderLibros onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_libro, parent, false);
        return new ViewHolderLibros(view, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLibros holder, int position) {
        Glide.with(context).load(listLibros.get(position).getImgLibro()).into(holder.imgLibro);
        holder.titulo.setText(listLibros.get(position).getTitulo());
        holder.tipo.setText(listLibros.get(position).getTipo());
        holder.nivel.setText(listLibros.get(position).getNivel());
    }

    @Override
    public int getItemCount() {
        return listLibros.size();
    }


    public class ViewHolderLibros extends RecyclerView.ViewHolder implements View.OnClickListener {
        OnNoteListener onNoteListener;
        TextView titulo,  tipo, nivel;
        ImageView imgLibro;

        public ViewHolderLibros(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);

            titulo = itemView.findViewById(R.id.tv_titulo);
            tipo = itemView.findViewById(R.id.tv_tipo);
            nivel = itemView.findViewById(R.id.tv_pdf_nivel);
            imgLibro = itemView.findViewById(R.id.img_cv_book);

            this.onNoteListener = onNoteListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface OnNoteListener{
        void onNoteClick(int position);
    }
}
