package com.ltthuong.radiobutton_checkbox_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You are clicking this!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}