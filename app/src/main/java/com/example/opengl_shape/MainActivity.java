package com.example.opengl_shape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstBtn = findViewById(R.id.transparent_triangle);
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransparentTriangleActivity.class);
                startActivity(intent);
            }
        });

        Button secondBtn = findViewById(R.id.gradient_triangle);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GradientTriangleActivity.class);
                startActivity(intent);
            }
        });

        Button thirdButton = findViewById(R.id.cube);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransparentCubeActivity.class);
                startActivity(intent);
            }
        });

        Button fourthButton = findViewById(R.id.colored_cube);
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColoredCubeActivity.class);
                startActivity(intent);
            }
        });
    }
}