package com.example.banderasquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView foto1;
    RadioButton rb1, rb2, rb3;
    TextView TxtNpregunta, Txtpregunta,Txtfelicidades;
    Button btnsiguiente;
    Button btnsalir;
    int nota = 0;
    int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        foto1=(ImageView)findViewById(R.id.foto1);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);

        TxtNpregunta = (TextView) findViewById(R.id.TxtNpregunta);
        Txtpregunta = (TextView) findViewById(R.id.TxtPregunta);
        Txtfelicidades=(TextView)findViewById(R.id.Txtfelicidades) ;

        btnsiguiente = (Button) findViewById(R.id.btnSiguiente);
        btnsalir = (Button) findViewById(R.id.btnSalir);
    }

    public void siguiente(View view) {

        if (Npregunta==1 ){
            foto1.setImageResource(R.drawable.brazil);
        }
        if (Npregunta==2 ){
            foto1.setImageResource(R.drawable.colombia);
        }
        if (Npregunta==3 ){
            foto1.setImageResource(R.drawable.canada);
        }
        if (Npregunta==4 ){
            foto1.setImageResource(R.drawable.honduras);
        }

        if (rb1.isChecked() == false && rb2.isChecked() == false && rb3.isChecked() == false && foto1.isOpaque() == false) {
            Toast.makeText(this, "Eliga una opcion", Toast.LENGTH_LONG).show();

        } else if (Npregunta == 1) {
            if (rb2.isChecked()) {
                nota = nota + 2;
            }

            Npregunta = Npregunta + 1;
            TxtNpregunta.setText("Pregunta 2");
            Txtpregunta.setText("Pista:Su ave nacional se llama Zorzal clorado");
            rb1.setText("Argentina");
            rb2.setText("Brazil");
            rb3.setText("Costa Rica");

            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);

        } else if (Npregunta == 2) {
            if (rb1.isChecked()) {
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;

            TxtNpregunta.setText("Pregunta 3");
            Txtpregunta.setText("Pista: Su ave nacional se llama el cóndor ");
            rb1.setText("Venezuela");
            rb2.setText("El Salvador");
            rb3.setText("Colombia");

            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
        } else if (Npregunta == 3) {
            if (rb3.isChecked()) {
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;

            TxtNpregunta.setText("Pregunta 4");
            Txtpregunta.setText("Pista: Su animal nacional es el Castor ");
            rb1.setText("Canada");
            rb2.setText("China");
            rb3.setText("Rusia");

            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
        } else if (Npregunta == 4) {
            if (rb1.isChecked()) {
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;

            TxtNpregunta.setText("Gracias por jugar");
            Txtfelicidades.setText("Espero haya sido de mucho aprendizaje");
            Txtpregunta.setText("Pista: Su animal nacional se llama La guara roja");
            rb1.setText("Portugal");
            rb2.setText("Honduras");
            rb3.setText("Polonia");

            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
        } else if (Npregunta == 5) {
            if (rb2.isChecked()) {
                nota = nota + 2;


            }
            Txtpregunta.setText("Tu nota final:" + nota);

            if (nota >= 6) {
                Txtpregunta.setText("Felicidades aprobaste");
            } else {
                Txtpregunta.setText("No aprobaste lo sentimos");
            }

            rb1.setVisibility(View.GONE);
            rb2.setVisibility(View.GONE);
            rb3.setVisibility(View.GONE);
            foto1.setVisibility(View.GONE);


        }

    }

    public void Salir(View View) {
        finish();
    }


}