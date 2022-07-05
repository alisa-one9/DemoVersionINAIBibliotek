package com.example.demoversioninaibibliotek.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demoversioninaibibliotek.R;
import com.example.demoversioninaibibliotek.databinding.FragmentBookingBinding;


public class BookingFragment extends Fragment {
    private FragmentBookingBinding binding;
    private NavController navController;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_booking, container, false);
    }
}