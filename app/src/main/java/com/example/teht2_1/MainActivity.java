package com.example.teht2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private boolean btn2enabled = true;
    private boolean btn3enabled = true;
    private ImageView kuva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        kuva = findViewById(R.id.foto);

    }
    public void btn1Click(View view) {
        if (btn2enabled == true && btn3enabled == true) {
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn2enabled = false;
            btn3enabled = false;
        }

        else {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn2enabled = true;
            btn3enabled = true;
        }


    }

    public void btn2Click(View view) {
        kuva.setVisibility(View.INVISIBLE);
    }

    public void btn3Click(View view) {
        kuva.setVisibility(View.VISIBLE);
    }
}
