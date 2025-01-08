package com.example.ezytrip;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView; // Import TextView

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private Button buttonClothing1; // Changed from buttonLihat1 to buttonClothing1
    private Button wantMoreButton;
    private ImageView iconHelp;
    private ImageView iconProfile;
    private TextView culinary; // Declare the TextView for culinary

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Initialize the views
        buttonClothing1 = findViewById(R.id.buttonClothing1); // Use buttonClothing1
        wantMoreButton = findViewById(R.id.wantMoreButton);
        iconHelp = findViewById(R.id.icon_help);
        iconProfile = findViewById(R.id.icon_profile);
        culinary = findViewById(R.id.culinary); // Initialize the culinary TextView

        // Set click listener for the button to view location
        buttonClothing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Beteng Trade Center"));
                startActivity(intent);
            }
        });

        // Set click listener for the "Want More?" button
        wantMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        // Set click listener for the help icon
        iconHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:088806051566"));
                startActivity(intent);
            }
        });

        // Set click listener for the profile icon
        iconProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the culinary TextView
        culinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}