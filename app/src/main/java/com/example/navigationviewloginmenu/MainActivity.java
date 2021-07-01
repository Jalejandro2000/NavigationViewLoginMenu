package com.example.navigationviewloginmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.navigationviewloginmenu.model.rol;
import com.example.navigationviewloginmenu.model.user;


import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.CoreProtocolPNames;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    Button Entrar;
    EditText Usuario;
    EditText Clave;
    CloseableHttpClient httpClient = HttpClients.createDefault();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Entrar = findViewById(R.id.btnEntrar);
        Usuario = findViewById(R.id.txtusuario);
        Clave = findViewById(R.id.editTextTextPassword);

        Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpGet request = new HttpGet("https://localhost:5001/api/seguridad/getlogin?usuario=" + Usuario.getText() + "&clave=" + Clave);
                try {
                    CloseableHttpResponse response = httpClient.execute(request);
                    System.out.println(response.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }


}