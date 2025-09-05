package com.example.calcularmedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Resultado extends AppCompatActivity {

    // Declara os objetos que serão associados aos elementos de tela
    TextView idResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultado);

        // Associa os objetos aos elementos de tela
        idResultado = (TextView)findViewById(R.id.idResultado);

        // Declara o objeto que receberá o gerenciador de atividades
        Intent i = getIntent();

        // Lê o parâmetro que foi passado pela tela anterior
        float media = i.getFloatExtra("media", 0f);

        // Define o que será apresentado ao usuário
        String situacao = null;
        if(media >= 6)
            situacao = "APROVADO";
        else
            situacao = "REPROVADO";
        String msg = "Você foi " + situacao + " com média " + String.format("%.1f", media);

        // Copia a mensagem que será mostrada ao usuário para o canto idResultado
        idResultado.setText(msg);
    }
}