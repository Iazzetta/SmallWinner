package com.example.rm71819.smallwinner;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    private ImageView imgpc1;
    private ImageView imgpc2;
    private ImageView imgp1;
    private ImageView imgp2;
    private TextView txtResultado;
    private TextView txtPontosPC;
    private TextView txtPontosP;
    private int[] dados;

    private int _placarPC = 0;
    private int _placarPlayer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgpc1 = (ImageView)findViewById(R.id.imgc1);
        imgpc2 = (ImageView)findViewById(R.id.imgc2);
        imgp1 = (ImageView)findViewById(R.id.imgp1);
        imgp2 = (ImageView)findViewById(R.id.imgp2);
        dados = new int[]{ R.drawable.ic_dados1,R.drawable.ic_dados2,R.drawable.ic_dados3,
                R.drawable.ic_dados4,R.drawable.ic_dados5,R.drawable.ic_dados6};
        txtResultado = (TextView)findViewById(R.id.txtResultados);
        txtPontosPC = (TextView)findViewById(R.id.txtPontosPC);
        txtPontosP = (TextView)findViewById(R.id.txtPontosP);



    }

    public void btnJogar_click(View v){

        Random r = new Random();
        int pc1 = r.nextInt(6);
        int pc2 = r.nextInt(6);
        int p1 = r.nextInt(6);
        int p2 = r.nextInt(6);

        imgpc1.setImageResource(dados[pc1]);
        imgpc2.setImageResource(dados[pc2]);
        imgp1.setImageResource(dados[p1]);
        imgp2.setImageResource(dados[p2]);

        int somapc = dados[pc1] + dados[pc2];
        int somap = dados[p1] + dados[p2];



        if(somapc < somap){
        txtResultado.setText("Computador venceu a rodada.");

            _placarPC++;
            txtPontosPC.setText(Integer.toString( _placarPC));

        }
        else if(somapc > somap){
            txtResultado.setText("Player venceu a rodada.");
            _placarPlayer++;
            txtPontosP.setText(Integer.toString( _placarPlayer));
        }
        else {
            txtResultado.setText("Ninguem ganhou a rodada.");
        }

    }



}
