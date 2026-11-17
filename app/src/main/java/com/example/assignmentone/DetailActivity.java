package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // The index passed from MainActivity identifies the selected topic.
        int topicIndex = getIntent().getIntExtra(MainActivity.EXTRA_TOPIC_INDEX, 0);

        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] images = getResources().getStringArray(R.array.string_array_images);
        String[] headers = getResources().getStringArray(R.array.detail_headers);

        TextView textHeader = findViewById(R.id.textDetailHeader);
        TextView textTitle = findViewById(R.id.textDetailTitle);
        TextView textContent = findViewById(R.id.textDetailContent);
        ImageView imageIcon = findViewById(R.id.imageDetailIcon);

        // Select the matching resources by position, without branching logic.
        textHeader.setText(headers[topicIndex]);
        textTitle.setText(titles[topicIndex]);
        textContent.setText(contents[topicIndex]);

        String imageName = images[topicIndex].trim();
        int imageId = getResources().getIdentifier(imageName, "drawable", getPackageName());
        imageIcon.setImageResource(imageId);
    }
}
