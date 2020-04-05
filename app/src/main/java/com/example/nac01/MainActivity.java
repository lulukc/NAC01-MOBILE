package com.example.nac01;

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

    public void sobreView(View v){
        Intent intent = new Intent(this, SobreActivity.class);
        startActivity(intent);
    }

    public void setWebView(View v){
        Intent intent = new Intent(this, NavegadorActivity.class);

        String url;

        switch (v.getId()){
            case R.id.mercadoLivre:
                url = "https://www.mercadolivre.com.br/";
                break;
            case R.id.buscape:
                url = "https://www.buscape.com.br/";
                break;

            case R.id.ebay:
                url = "https://www.ebay.com/";
                break;
            case R.id.webmotors:
                url = "https://www.webmotors.com.br/";
                break;
            case R.id.magalu:
                url = "https://www.magazineluiza.com.br/";
                break;
            case R.id.netshoes:
                url = "https://www.netshoes.com.br/";
                break;
            default:
                url = null;
                break;
        }

        intent.putExtra("base_url",url);
        startActivity(intent);
    }
}
