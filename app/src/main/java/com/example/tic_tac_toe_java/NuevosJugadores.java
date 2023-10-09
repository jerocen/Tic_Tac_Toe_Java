package com.example.tic_tac_toe_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NuevosJugadores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevos_jugadores);

        final EditText playerOne = findViewById(R.id.playerOneName);
        final EditText playerTwo = findViewById(R.id.playerTwoName);
        final Button startGameBtn = findViewById(R.id.startGameBtn);

        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final String getPLayerOneName = playerOne.getText().toString();
                final String getPLayerTwoName = playerTwo.getText().toString();

                if(getPLayerOneName.isEmpty() || getPLayerTwoName.isEmpty())
                {
                    Toast.makeText(NuevosJugadores.this,"Por favor escriban sus nombre ambos jugadores", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(NuevosJugadores.this, MainActivity.class);
                    intent.putExtra("playerOne", getPLayerOneName);
                    intent.putExtra("playerTwo", getPLayerTwoName);
                    startActivity(intent);
                }
            }
        });
    }
}