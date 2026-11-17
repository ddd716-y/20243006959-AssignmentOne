package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * Intent extra key carrying the index of the topic that was clicked.
     * The index maps directly onto the arrays in arrays.xml.
     */
    public static final String EXTRA_TOPIC_INDEX = "com.example.assignmentone.TOPIC_INDEX";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Each image button opens the detail screen for its own topic.
        addTopicButton(R.id.buttonFacilities, 0);
        addTopicButton(R.id.buttonEvents, 1);
        addTopicButton(R.id.buttonClubs, 2);
        addTopicButton(R.id.buttonSupport, 3);
    }

    /**
     * Registers a click listener that starts DetailActivity with the given
     * topic index as an extra.
     *
     * @param buttonId the image button resource id
     * @param topicIndex the position of the topic in the arrays.xml arrays
     */
    private void addTopicButton(int buttonId, final int topicIndex) {
        findViewById(buttonId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(EXTRA_TOPIC_INDEX, topicIndex);
                startActivity(intent);
            }
        });
    }
}
