package com.isckon.irkutsk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.isckon.irkutsk.data.News;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    private LayoutInflater inflater;
    private List<News> news = new LinkedList<>();

    public NewsAdapter(LayoutInflater inflater, List<News> news) {
        this.inflater = inflater;
        this.news = news;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single_news_scroll, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        News singleNews = news.get(position);
        holder.image.setImageResource(singleNews.getImage());
        holder.header.setText(singleNews.getHeader());
        holder.date.setText(sdf.format(singleNews.getDate()));
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView image;
        final TextView header, date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.image = itemView.findViewById(R.id.newsImage);
            this.header = itemView.findViewById(R.id.newsHeader);
            this.date = itemView.findViewById(R.id.newsDate);
        }
    }
}
