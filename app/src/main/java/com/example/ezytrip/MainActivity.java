package com.example.ezytrip;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView; // Import TextView

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonLihat1;
    private Button wantMoreButton;
    private ImageView iconHelp;
    private ImageView iconProfile; // Declare the ImageView for profile icon
    private TextView clothing; // Declare the TextView for clothing

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLihat1 = findViewById(R.id.buttonLihat1);
        wantMoreButton = findViewById(R.id.wantMoreButton);
        iconHelp = findViewById(R.id.icon_help);
        iconProfile = findViewById(R.id.icon_profile); // Initialize the profile icon
        clothing = findViewById(R.id.clothing); // Initialize the clothing TextView

        buttonLihat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Sate Kambing-Buntel Pak H.Kasdi"));
                startActivity(intent);
            }
        });

        wantMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        iconHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:088806051566"));
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the profile icon
        iconProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the clothing TextView
        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}