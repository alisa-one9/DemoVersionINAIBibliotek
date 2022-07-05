package com.example.demoversioninaibibliotek.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgrammingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProgrammingViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {

        return mText;
    }
}