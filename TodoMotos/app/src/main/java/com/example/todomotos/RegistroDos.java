package com.example.todomotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistroDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_dos);
        getSupportActionBar().hide();
    }
    public void calent(View view){
        Intent i = new Intent(this,Calendario1.class);
        startActivity(i);
    }
    public void Mantenimiento(View view){
        Intent i = new Intent(this,RMantenimiento.class);
        startActivity(i);
    }
    public void Cerrar(View view){
        Intent i = new Intent(this,InicioTM.class);
        startActivity(i);
    }
    public void Regismoto(View view){
        Intent i = new Intent(this,RMoto.class);
        startActivity(i);
    }
}