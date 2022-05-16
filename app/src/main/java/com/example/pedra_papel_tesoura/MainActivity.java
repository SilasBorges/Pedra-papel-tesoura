package com.example.pedra_papel_tesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelcionada) {

        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);
        String[] opcao = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcao[numero];

        switch (opcaoApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (opcaoApp == "pedra" && opcaoSelcionada == "tesoura" || opcaoApp == "tesoura" && opcaoSelcionada == "papel" || opcaoApp == "papel" && opcaoSelcionada =="pedra") {
            textResultado.setText("Você perdeu!");
        } else if (opcaoSelcionada == "pedra" && opcaoApp == "tesoura" || opcaoSelcionada == "tesoura" && opcaoApp == "papel" || opcaoSelcionada == "papel" && opcaoApp =="pedra") {
            textResultado.setText("Você Ganhou!");
        } else {
            textResultado.setText("Empate!");

        }

    }
}