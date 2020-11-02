package br.com.portflio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Produtos extends AppCompatActivity {

    int[] produtos = new int[3];
 TextView mussarela;
 TextView leite;
 TextView queijo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
        produtos[0] = 0;
        produtos[1] = 0;
        produtos[2] = 0;
        mussarela=findViewById(R.id.qtdM);
        leite=findViewById(R.id.qtdleit);
        queijo=findViewById(R.id.qtdqueijo);
    }

    //SomaValor
    public void mudaValorMussarelaSS(View view)
    {
        produtos[0]++;
        mussarela.setText(produtos[0]+"");
    }
    //Subtrai valor
    public void mudaValorMussarelaS(View view)
    {
        produtos[0]--;
        mussarela.setText(produtos[0]+"");
    }
    public void enviar(View view)
    {
        SharedPreferences prefs = getSharedPreferences("mussarela",0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("qtd",produtos[0]+"");
        editor.commit();
    }
}