package com.isckon.irkutsk.ui.news;

import androidx.appcompat.app.AppCompatActivity;
import com.isckon.irkutsk.R;
import com.isckon.irkutsk.data.News;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class SingleNewsFull extends AppCompatActivity {
private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_news_full);
        News news = getIntent().getParcelableExtra("news");
        ImageView image = findViewById(R.id.newsFullImageView);
        TextView mainText = findViewById(R.id.newsFullMainText);
        TextView label = findViewById(R.id.newsFullLabel);
        image.setImageResource(news.getImage());
        mainText.setText(news.getText());
        label.setText(news.getHeader());
    }
}