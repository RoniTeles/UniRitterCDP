package br.com.uniritter.app1_2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1_1).setOnClickListener(view -> {
            Toast.makeText(this, "Oieeee", Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.button1_2).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Activity2.class);
            startActivity(intent);
        });

        }

    //Aula 04/11 - 1:50
}