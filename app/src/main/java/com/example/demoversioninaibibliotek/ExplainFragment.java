package com.example.demoversioninaibibliotek;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demoversioninaibibliotek.databinding.FragmentExplainBinding;
import com.example.demoversioninaibibliotek.ui.BookAdapter;


public class ExplainFragment extends Fragment {
    private FragmentExplainBinding binding;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_explain, container, false);
    }
}