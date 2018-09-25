package com.example.educacionit.clase02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {

    private TextView txtUsuario;
    private String usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtUsuario =findViewById(R.id.txtUsuario);
        usuario = getIntent().getStringExtra(MainActivity.USUARIO);
        txtUsuario.setText(usuario);
    }
}
