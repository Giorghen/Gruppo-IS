package com.example.saf;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class myAdapter extends ArrayAdapter <Tipo>{
    Context cont;
    int ricerca;
    List<Tipo>lista;

    public myAdapter (Context cont, int ricerca, List<Tipo>lista){
        super(cont, ricerca, lista);
    this.cont= cont;
    this.ricerca= ricerca;
    this.lista= lista;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(cont);

        View view= inflater.inflate(R.layout.activity_prodotto, null);

        TextView testoNome= view.findViewById(R.id.nome_prodotto);
        TextView testoDesc= view.findViewById(R.id.descrizione_prodotto);
        TextView testoPrezzo= view.findViewById(R.id.prezzo_prodotto);
        ImageView imageCont= view.findViewById(R.id.immagine_prodotto);

        Tipo tip = lista.get(position);

        testoNome.setText(tip.getNome());
        testoDesc.setText(tip.getDesc());
        testoPrezzo.setText(tip.getPrize().toString());
        imageCont.setImageDrawable(cont.getResources().getDrawable(tip.getImage()));

        return view;
    }

    private void remuveItem (final int posizione){

        AlertDialog.Builder builder = new AlertDialog.Builder(cont);
        builder.setTitle("Sei sicuro di volerlo eliminare?");

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                lista.remove(posizione);
                notifyDataSetChanged();

            }
        });

        AlertDialog alertDialog= builder.create();
        alertDialog.show();

    }
}
