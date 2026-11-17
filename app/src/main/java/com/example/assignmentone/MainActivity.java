package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Temporary click feedback while the detail navigation is not yet wired up.
        addClickListener(R.id.buttonFacilities, "Facilities clicked");
        addClickListener(R.id.buttonEvents, "Events clicked");
        addClickListener(R.id.buttonClubs, "Clubs clicked");
        addClickListener(R.id.buttonSupport, "Support clicked");
    }

    /**
     * Registers a click listener that shows a short toast, used to verify that
     * every image button responds to taps.
     */
    private void addClickListener(int buttonId, final String message) {
        findViewById(buttonId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}