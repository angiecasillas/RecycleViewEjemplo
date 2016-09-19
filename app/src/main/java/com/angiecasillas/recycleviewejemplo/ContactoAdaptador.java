package com.angiecasillas.recycleviewejemplo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Usuario on 17/09/2016.
 */
public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder> {

    ArrayList<Contacto> contactos;

    public ContactoAdaptador (ArrayList<Contacto> contactos){
        this.contactos = contactos;
    }




    @Override
    //Inflar el Layout y lo pasará al viewHolder para que obtenga cada elemento, o sea los views
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    //Indica cuál es el "Layout" que estará reciclando, en este caso "cardview_contacto"
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto, parent, false);
        return new ContactoViewHolder(v);
    }

    @Override
    //Asocia cada elemento de la lista (arraylist) con cada view
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder, int position) {
    Contacto contacto = contactos.get(position);
        contactoViewHolder.imgFoto.setImageResource(contacto.getFoto());
        contactoViewHolder.imgFotoEstrella.setImageResource(contacto.getFotoEstrella());
        contactoViewHolder.tvNombreCV.setText(contacto.getNombre());
        contactoViewHolder.tvRatingCV.setText(contacto.getRating());

    }

    @Override

    //Método implementado, contiene la cantidad de objetos que tiene la lista
    //Devuelve la cantidad del elementos
    public int getItemCount() {
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private ImageView imgFotoEstrella;
        private TextView tvNombreCV;
        private TextView tvRatingCV;




        public ContactoViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            imgFotoEstrella = (ImageView) itemView.findViewById(R.id.imgFotoEstrella);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvRatingCV = (TextView) itemView.findViewById(R.id.tvRatingCV);

        }
    }
}
