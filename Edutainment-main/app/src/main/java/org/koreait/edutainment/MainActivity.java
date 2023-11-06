package org.koreait.edutainment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onPostCreate(Bundle saveInstanceState) {
        super.onPostCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        sign = findViewById(R.id.SpeakButton);
        sign.setOnClickListener(v ->{
            Intent intent = new Intent(this,SpeakActivity.class);
            startActivity(intent);
        });

        sign = findViewById(R.id.PlayButton);
        sign.setOnClickListener(v ->{
            Intent intent = new Intent(this,ZoomActivity.class);
            startActivity(intent);
        });
    }

}