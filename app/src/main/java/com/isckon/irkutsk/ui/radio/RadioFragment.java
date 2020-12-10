package com.isckon.irkutsk.ui.radio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.isckon.irkutsk.R;

public class RadioFragment extends Fragment {

    private RadioViewModel radioViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        radioViewModel =
                ViewModelProviders.of(this).get(RadioViewModel.class);
        View root = inflater.inflate(R.layout.fragment_radio, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        radioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}