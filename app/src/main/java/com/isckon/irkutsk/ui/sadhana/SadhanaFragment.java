package com.isckon.irkutsk.ui.sadhana;

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

public class SadhanaFragment extends Fragment {

    private SadhanaViewModel sadhanaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sadhanaViewModel =
                ViewModelProviders.of(this).get(SadhanaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sadhana, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        sadhanaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}