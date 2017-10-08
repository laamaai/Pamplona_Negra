package com.example.maider.pamplona_negra;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       TextView nuevaFuente = (TextView)findViewById(R.id.txtV);

        Typeface face = Typeface.createFromAsset(getAssets(),"Nosifer.ttf");
       ((TextView) findViewById(R.id.txtV)).setTypeface(face);


        Button btn = (Button) findViewById(R.id.btnJugar);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent (v.getContext(), PresentacionJuego.class);
                startActivityForResult(intent,0);
            }
        });


    }
}
