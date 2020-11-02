package br.com.portflio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TeladeCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telade_cadastro);
    }

    public void cadastrarC(View view)
    {
        EditText email = (EditText) findViewById(R.id.emailC);
        EditText nome = (EditText) findViewById(R.id.nomeP);
        EditText senha = (EditText) findViewById(R.id.senhaP);

        SharedPreferences prefs = getSharedPreferences(email.getText().toString(),0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("email",email.getText().toString());
        editor.putString("senha",senha.getText().toString());
        editor.putString("nome",nome.getText().toString());
        editor.commit();
        finish();
    }
}