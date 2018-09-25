package com.example.educacionit.clase02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String USUARIO = "Usuario" ;// public para poder obtener desde otra activity
    private EditText etUsuario;
    private EditText etPassword;
    private Button btnCrear;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsuario =findViewById(R.id.etUsuario);
        etPassword =findViewById(R.id.etPassword);

    }

    public void onclickIngresar(View view){
        String usuario = etUsuario.getText().toString();
        String password = etPassword.getText().toString();

        if(usuario.isEmpty() || password.isEmpty()){
            Toast.makeText(this,"Completar datos",Toast.LENGTH_SHORT).show();
        }else if(usuario.equals("educacion") && password.equals("it")){
            Intent intent=new Intent(MainActivity.this,home.class);
            intent.putExtra(USUARIO,usuario); //colocar campos clave como constante y mayuscula,para pasar por parametro a otra activity
            startActivity(intent);
        }else {
            Toast.makeText(this,"Datos incorrectos",Toast.LENGTH_SHORT).show();
        }
    }
}


