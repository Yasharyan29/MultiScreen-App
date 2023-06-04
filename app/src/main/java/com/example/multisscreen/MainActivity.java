package com.example.multisscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    public static final String EXTRA_NAME = "com.example.multisscreen.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openActivity(View view){
        Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        editText= findViewById(R.id.editTextText);
        String nameText = editText.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);
    }
}