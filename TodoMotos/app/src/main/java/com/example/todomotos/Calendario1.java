package com.example.todomotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Calendario1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario1);
        getSupportActionBar().hide();
    }
    public void Regresar(View view){
        Intent i = new Intent(this,RegistroDos.class);
        startActivity(i);
    }
}