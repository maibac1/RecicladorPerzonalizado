package com.app.recicladorperzonalizado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<JuegosVO> listaJuegos;
    RecyclerView recyclerViewJuegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaJuegos=new ArrayList<>();
        recyclerViewJuegos= findViewById(R.id.recyclerId);
        recyclerViewJuegos.setLayoutManager(new LinearLayoutManager(this));
        
        llenarJuegos();
        AdaptadorJuegos adapter= new AdaptadorJuegos(listaJuegos);
        recyclerViewJuegos.setAdapter(adapter);
    }

    private void llenarJuegos() {

        listaJuegos.add(new JuegosVO("Juego 1","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ",R.drawable.small));
        listaJuegos.add(new JuegosVO("Juego 2","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ",R.drawable.small));
        listaJuegos.add(new JuegosVO("Juego 3","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ",R.drawable.small));
        listaJuegos.add(new JuegosVO("Juego 4","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ",R.drawable.small));
        listaJuegos.add(new JuegosVO("Juego 5","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ",R.drawable.small));
        listaJuegos.add(new JuegosVO("Juego 6","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ",R.drawable.small));

    }

}