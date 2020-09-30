package com.example.menu_corel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button jbkembali;

    private Button [] buttons;
    private Boolean bad_move = false ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}