package com.example.patrin_19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener {
ImageButton btn2;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        btn2 =findViewById(R.id.imageButtonback);
        btn1 = findViewById(R.id.buttonMap);

    }
    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn



        }
    }
}
