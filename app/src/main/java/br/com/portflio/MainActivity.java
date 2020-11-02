package br.com.portflio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrar(View view)
    {
        Intent intent = new Intent(this,TeladeCadastro.class);
        startActivity(intent);
    }
    public void entrar(View view)
    {
        Intent intent = new Intent(this,Produtos.class);
        startActivity(intent);
    }
}