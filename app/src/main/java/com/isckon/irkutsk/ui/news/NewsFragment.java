package com.isckon.irkutsk.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.isckon.irkutsk.NewsAdapter;
import com.isckon.irkutsk.R;
import com.isckon.irkutsk.data.News;

import java.util.Date;
import java.util.LinkedList;

public class NewsFragment extends Fragment {

    protected RecyclerView mRecyclerView;
    protected NewsAdapter mAdapter;

    LinkedList<News> news = new LinkedList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        news.add(new News(R.drawable.corona, "В Роспотребнадзоре назвали распространенные симптомы коронавируса у детей", "Температура и кашель являются наиболее распространенными симптомами коронавируса среди детей. Об этом сообщил «РИА Новости» заместитель директора по научной работе ЦНИИ эпидемиологии Роспотребнадзора Александр Горелов.", new Date()));
        news.add(new News(R.drawable.carabah, "Азербайджан не признал резолюцию Сената Франции по Карабаху", "Баку не считает резолюцию Сената Франции с призывом к правительству признать самопровозглашенную Нагорно-Карабахскую Республику (НКР) документом, заявил помощник президента Азербайджана Хикмет Гаджиев.", new Date()));
        news.add(new News(R.drawable.isu, "В ИГУ пройдут курсы дополнительного образования", "Иркутский государственный университет получил федеральный грант на организацию дополнительного образования. В вузе ожидают, что курсы посетят больше трёх тысяч слушателей. Учиться никогда не поздно, а улучшать свои профессиональные навыки — тем более.", new Date()));
        news.add(new News(R.drawable.corona, "В Роспотребнадзоре назвали распространенные симптомы коронавируса у детей", "Температура и кашель являются наиболее распространенными симптомами коронавируса среди детей. Об этом сообщил «РИА Новости» заместитель директора по научной работе ЦНИИ эпидемиологии Роспотребнадзора Александр Горелов.", new Date()));
        news.add(new News(R.drawable.carabah, "Азербайджан не признал резолюцию Сената Франции по Карабаху", "Баку не считает резолюцию Сената Франции с призывом к правительству признать самопровозглашенную Нагорно-Карабахскую Республику (НКР) документом, заявил помощник президента Азербайджана Хикмет Гаджиев.", new Date()));
        news.add(new News(R.drawable.isu, "В ИГУ пройдут курсы дополнительного образования", "Иркутский государственный университет получил федеральный грант на организацию дополнительного образования. В вузе ожидают, что курсы посетят больше трёх тысяч слушателей. Учиться никогда не поздно, а улучшать свои профессиональные навыки — тем более.", new Date()));
        news.add(new News(R.drawable.corona, "В Роспотребнадзоре назвали распространенные симптомы коронавируса у детей", "Температура и кашель являются наиболее распространенными симптомами коронавируса среди детей. Об этом сообщил «РИА Новости» заместитель директора по научной работе ЦНИИ эпидемиологии Роспотребнадзора Александр Горелов.", new Date()));
        news.add(new News(R.drawable.carabah, "Азербайджан не признал резолюцию Сената Франции по Карабаху", "Баку не считает резолюцию Сената Франции с призывом к правительству признать самопровозглашенную Нагорно-Карабахскую Республику (НКР) документом, заявил помощник президента Азербайджана Хикмет Гаджиев.", new Date()));
        news.add(new News(R.drawable.isu, "В ИГУ пройдут курсы дополнительного образования", "Иркутский государственный университет получил федеральный грант на организацию дополнительного образования. В вузе ожидают, что курсы посетят больше трёх тысяч слушателей. Учиться никогда не поздно, а улучшать свои профессиональные навыки — тем более.", new Date()));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_news, container, false);
        mRecyclerView = rootView.findViewById(R.id.recylerView);
        mAdapter = new NewsAdapter(inflater, news);
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }

}