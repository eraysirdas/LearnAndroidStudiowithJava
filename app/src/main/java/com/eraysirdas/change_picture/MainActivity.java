package com.eraysirdas.change_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Change(View view){
        ImageView image1=findViewById(R.id.imageView);
        image1.setImageResource(R.drawable.image2);
    }
}