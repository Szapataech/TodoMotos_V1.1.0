package com.example.todomotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registrp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrp);
        getSupportActionBar().hide();
    }
    public void Cancelar(View view){
        Intent i = new Intent(this,InicioTM.class);
        startActivity(i);
    }
    public void Entrar(View view){
        Intent i = new Intent(this,RegistroDos.class);
        startActivity(i);
    }
}