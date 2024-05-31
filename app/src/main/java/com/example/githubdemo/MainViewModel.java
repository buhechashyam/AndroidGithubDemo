package com.example.githubdemo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends AndroidViewModel {
    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    MutableLiveData<Integer> _counter = new MutableLiveData<>(0);
    LiveData<Integer> counter = _counter;

    public LiveData<Integer> incrementCount() {
        _counter.setValue(_counter.getValue() + 1);

        return counter;
    }
}
