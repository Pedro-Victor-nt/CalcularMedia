package com.example.calcularmedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edNotaA1, edNotaA2, edNotaA3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associar os elemntos de tela aos objetos declarados
        edNotaA1 = (EditText) findViewById(R.id.edNotaA1);
        edNotaA2 = (EditText) findViewById(R.id.edNotaA2);
        edNotaA3 = (EditText) findViewById(R.id.edNotaA3);
    }

    public void calcularMedia(View v){

        // Declara as variáveis que farão o cálculo da média
        float notaA1 = Float.parseFloat(edNotaA1.getText().toString());
        float notaA2 = Float.parseFloat(edNotaA2.getText().toString());
        float notaA3 = Float.parseFloat(edNotaA3.getText().toString());

        // Calcula a média
        float media = (notaA1 + notaA2 + notaA3) / 3;

        // Declara o controle Intent que será usado para identificar a próxima tela
        Intent i = new Intent(this, Resultado.class);

        // Insere um parâmetro a ser usado na próxima tela
        i.putExtra("media", media);

        // Chama a próxima tela
        startActivity(i);

    }
}