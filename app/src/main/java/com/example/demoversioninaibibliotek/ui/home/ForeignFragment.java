package com.example.demoversioninaibibliotek.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoversioninaibibliotek.R;
import com.example.demoversioninaibibliotek.databinding.FragmentForeignBinding;
import com.example.demoversioninaibibliotek.ui.Book;
import com.example.demoversioninaibibliotek.ui.BookAdapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;


public class ForeignFragment extends Fragment {

    private FragmentForeignBinding binding;
    private BookAdapter adapter;
    private ArrayList<Book> list = new ArrayList<>();
    private NavController navController;
    private RecyclerView recyclerView;
    private BottomSheetBehavior sheetBehavior;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new BookAdapter();
        createList();
        adapter.setList(list);

    }



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ForeignViewModel viewModel =
                new ViewModelProvider(this).get(ForeignViewModel.class);

        binding = FragmentForeignBinding.inflate(inflater, container, false);
        binding.rvBooks.setAdapter(adapter);
         return binding.getRoot();
    }


    private void createList() {

        list.add(new Book("Hermann Funk und Christina Kuhn","Studio 21 A1 das Deutschbuch", R.drawable.studioa1, "36",R.string.studioa1));
        list.add(new Book(" Hermann Funk, Christina Kuhn, Laura Nielsen,Rita","Das Leben A1 Kurs und Übungsbuch",R.drawable.dasleben, "1",R.string.dasleben));
        list.add(new Book("Hannelore Pistorius and Nellie Mukmenova","Studio 21 A1 Testheft mit Audio CD",R.drawable.studioa1audio, "1",R.string.studioa1audio));
        list.add(new Book("Ayten Genc, Sofia Koliaki, Andy Bayer ,Nelli Pasemann , Verena Paar-Grünbichler ","Studio 21 A1 Unterrichtsvorbereitung",R.drawable.unterrichtsvorbereitung, "1",R.string.unterrichtsvorbereitung));
        list.add(new Book("Hermann Funk; Christina Kuhn","Studio d A1 Kurs-/ÜB+CD ",R.drawable.studiod, "1",R.string.studiod));
        list.add(new Book("Maria Niemann","Studio d A1 Sprachtraining",R.drawable.studiod1, "Количество: 6",R.string.studiod1));
        list.add(new Book("Maria Niemann","Studio d A1 Kurs und Übungsbuch",R.drawable.studiod2, "3",R.string.studiod2));
        list.add(new Book("Hermann Funk, Christina Kuhn und Britta Winzer-Kiontke","Studio 21 A2 das Deutschbuch",R.drawable.studioa2, "25",R.string.studioa2));
        list.add(new Book("Herman Funk, Christina Kuhn, Laura Nielsen, Rita von Eggeling, Gunther Weimann","Das Leben A2 Kurs und Übungsbuch",R.drawable.dasleben2, "1",R.string.dasleben2));
        list.add(new Book("Nelli Pasemann","Studio 21 A2 Testheft mit Audio CD",R.drawable.studioa2t, "1",R.string.studioa2t));
        list.add(new Book("Christel Bettermann; Regina Werner","Studio 21 A2 Unterrichtsvorbereitung",R.drawable.studioa2u, "3",R.string.studioa2u));
        list.add(new Book("Hannelore Pistorius; Nelli Pasemann","Studio d A2 Testheft",R.drawable.studioda2t, "13",R.string.studioda2t));
        list.add(new Book("Hermann Funkn Christina Kuhn, Laura Nielsen, Britta Winzer-Kiontke","Studio 21 B1 das Deutschbuch",R.drawable.studiob1, "15",R.string.studiob1));
        list.add(new Book("Dieter Maenner und Maria Funk","Studio 21 B1 Testheft mit MP3-CD",R.drawable.studiob1t, "1",R.string.studiob1t));
        list.add(new Book("Christine Becker, Andreas fechner, Priscilla M. Pessutti Nascimento Elena Shcherbinina , Ralf Weißer","Studio 21 B1 Unterrichtsvorbereitung",R.drawable.studiob1u, "1",R.string.studiob1u));
        list.add(new Book(" Nelli Pasemann Gedruckt ","Studio d B1 Sprachtraining",R.drawable.studiodb1, "3",R.string.studiodb1));
        list.add(new Book(" Nelli Pasemann Gedruckt","Studio d B1 Kurs und Übungsbuch mit Zertifikatstraining",R.drawable.studiodb1z, "3",R.string.studiodb1z));
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}