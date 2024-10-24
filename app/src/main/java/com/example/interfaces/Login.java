package com.example.interfaces;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView mGirl = findViewById(R.id.pantalla);

        .with(this)
                .load("R.drawable.girl")
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .circleCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.black)))
                .into(mGirl);
    }
    public void openSignUp (View v)
    {
        Intent intent = new Intent(Login.this, SignUp.class);
        startActivity(intent);
    }

    public void openMain (View v)
    {
        Intent intent = new Intent(Login.this, Main.class);
        startActivity(intent);
    }

    public void openTerms (View v)
    {
        Intent intent = new Intent(Login.this, terms.class);
        startActivity(intent);
    }
}