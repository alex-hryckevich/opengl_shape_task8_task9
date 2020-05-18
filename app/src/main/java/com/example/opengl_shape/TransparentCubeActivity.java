package com.example.opengl_shape;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TransparentCubeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent_cube);

        final GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        glSurfaceView.setEGLContextClientVersion(2);
        OpenGLRendererCube renderer = new OpenGLRendererCube();
        glSurfaceView.setRenderer(renderer);
        setContentView(glSurfaceView);
    }
}
