package com.angiecasillas.recycleviewejemplo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

   ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);*/

        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();


    /*ArrayList<String> nombresContacto = new ArrayList<>();
        //Pone los nombres en el listview
        for(Contacto contacto : contactos){
            nombresContacto.add(contacto.getNombre());
        }*/
    }
      /*  public ContactoAdaptador adaptador;
        private void inicializaAdaptador(){
        adaptador = new ContactoAdaptador(contactos, this);
            rvContactos.setAdapter(adaptador);
        } */


        public void irPopular(View v){
            Intent intent = new Intent(this,Popular.class);
            startActivity(intent);

        }

        public void inicializarAdaptador(){
            ContactoAdaptador adaptador = new ContactoAdaptador(contactos);
            listaContactos.setAdapter(adaptador);
        }

        public void inicializarListaContactos() {

            contactos = new ArrayList<Contacto>();
            contactos.add(new Contacto("Max","5", R.drawable.mascotaperro1,R.drawable.star_hotel5s));
            contactos.add(new Contacto("Fifi", "2", R.drawable.mascotaperro2, R.drawable.star_hotel5s));
            contactos.add(new Contacto("Cachito", "1", R.drawable.mascotaperro3, R.drawable.star_hotel5s));
            contactos.add(new Contacto("Terry", "8", R.drawable.mascotaperro4, R.drawable.star_hotel5s));
            contactos.add(new Contacto("Mayo", "9", R.drawable.mascotaperro5, R.drawable.star_hotel5s));
            contactos.add(new Contacto("Momo", "4",  R.drawable.mascotaperro6, R.drawable.star_hotel5s));



    }
}
