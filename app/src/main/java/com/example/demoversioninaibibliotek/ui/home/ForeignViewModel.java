package com.example.demoversioninaibibliotek.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ForeignViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ForeignViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}