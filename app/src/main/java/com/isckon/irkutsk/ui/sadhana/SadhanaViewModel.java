package com.isckon.irkutsk.ui.sadhana;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SadhanaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SadhanaViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}