package com.example.factsandpaws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button boton_sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_sig = findViewById(R.id.button3);
    }

    public void buttonLogin(View view) {
        Intent intent = new Intent(this, login_activity.class);
        startActivity(intent);
    }
}