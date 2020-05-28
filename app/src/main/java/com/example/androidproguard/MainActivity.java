package com.example.androidproguard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidproguard.model.Model;
import com.example.androidproguard.model.ModelConsumer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Model model = new Model();
        model.setName("Sarthak");
        model.setId(1);
        new ModelConsumer(this).showToast(model);
    }
}
