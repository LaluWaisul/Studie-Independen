package com.nongsa.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int RandomAngka;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();

    }

    public void guess() {

        EditText jawaban = (EditText) findViewById(R.id.tebakan);

        int IntAngka = Integer.parseInt(jawaban.getText().toString());

        if (IntAngka > RandomAngka){

            makeToast("Terlalu Besar, Lebih Kecil Lagi");

        } else if (IntAngka < RandomAngka) {

            makeToast("Terlalu Kecil, Lebih Besar Lagi");
        } else {
            makeToast("Yaps Benar Sekali Boskuee, Ayo Main Lagi");

            Random rand = new Random();
            RandomAngka = rand.nextInt(20) + 1;

        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        RandomAngka = rand.nextInt(20)+1;

        Button button = (Button) findViewById(R.id.tebak);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guess();
            }
        });
    }
}