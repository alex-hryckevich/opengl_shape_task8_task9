package com.example.opengl_shape;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ColoredCubeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colored_cube);

        final GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        glSurfaceView.setEGLContextClientVersion(2);
        OpenGLRendererColoredCube renderer = new OpenGLRendererColoredCube();
        glSurfaceView.setRenderer(renderer);
        setContentView(glSurfaceView);
    }
}