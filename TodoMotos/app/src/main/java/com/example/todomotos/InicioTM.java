package com.example.todomotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioTM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_tm);
        getSupportActionBar().hide();
    }

    public void inDatos(View view){
        Intent i = new Intent(this,Registrp.class);
        startActivity(i);
    }
    public void InicioSesion(View view){
        Intent i = new Intent(this,RegistroDos.class);
        startActivity(i);
    }
}