package com.henkef.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbrir, buttonFechar;
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbrir = findViewById(R.id.buttonAbrir);
        buttonFechar = findViewById(R.id.buttonFechar);

//        buttonAbrir.setOnClickListener(new View.OnClickListener() {   //para incluir o SnackBar é esse comando, e deve ser incluido uma nova dependência quando for incluso. Geralmente ela é inclusa automaticamente na Gradle Script
//            @Override
//            public void onClick(View view) {
//
//                Snackbar.make(
//                        view,
//                        "Botão pressionado",
//                        Snackbar.LENGTH_LONG
//                ).show();
//            }
//        });

        buttonAbrir.setOnClickListener(new View.OnClickListener() {   //para incluir o SnackBar com um comando dentro
            @Override
            public void onClick(View view) {

                Snackbar.make(
                        view,
                        "Botão pressionado",
                        Snackbar.LENGTH_LONG
                ).setAction("Confirmar", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                               buttonAbrir.setText("Botão abrir alterado");
                            }
                        }).setActionTextColor( getResources().getColor( com.google.android.material.R.color.design_default_color_primary))
                        .show();
            }
        });

//        buttonAbrir.setOnClickListener(new View.OnClickListener() {   //para incluir o SnackBar com um comando dentro de outra maneira
//            @Override
//            public void onClick(View view) {
//
//                Snackbar snackbar = Snackbar.make(
//                        view,
//                        "Botão pressionado",
//                        Snackbar.LENGTH_INDEFINITE
//                ).setAction("Confirmar", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        buttonAbrir.setText("Botão abrir alterado, segundo modo");
//                    }
//                });
//
//                snackbar.show();
//            }
//        });

        /*
        buttonFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss(); //esse metodo fecha a snackbar
            }
        });
         */
    }

    public void abrirSnackbar(View view){  //o parametro view nos permite acessar a nossa interface



    }
}