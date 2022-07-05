package com.example.demoversioninaibibliotek.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;


import com.example.demoversioninaibibliotek.OnItemClickListener;
import com.example.demoversioninaibibliotek.R;
import com.example.demoversioninaibibliotek.databinding.FragmentFinanceBinding;
import com.example.demoversioninaibibliotek.ui.Book;
import com.example.demoversioninaibibliotek.ui.BookAdapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;

public class FinanceFragment extends Fragment {

    private FragmentFinanceBinding binding;
    private BookAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Book>list =new ArrayList<>();
    private NavController navController;
    private BottomSheetBehavior sheetBehavior;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new BookAdapter();
        createList();
        adapter.setList(list);

        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Book book = adapter.getItem(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("rk_key",book);
                openExplainFragment();
            }
            @Override
            public void onLongClick(int position) {
            }
        });

    }



    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        FinanceViewModel viewModel =  new ViewModelProvider(this).get(FinanceViewModel.class);
        binding = FragmentFinanceBinding.inflate(inflater, container, false);
        binding.rvBooks.setAdapter(adapter);
        return binding.getRoot();
    }

    private void openExplainFragment() {


    }
    private void createList() {
        list.add(new Book("Dӓumler Klaus-Dieter", "Kostenrechnung 1 — Grundlagen ", R.drawable.kostenrechnung, "5",R.string.kostenrechnung));
        list.add(new Book("Karin A. Stock", "Deutsche Rechtschreibung aktuell",R.drawable.duden, "1",R.string.duden));
        list.add(new Book("Emmerson", "Business grammar builder",R.drawable.business_gb, "1",R.string.business_gb));
        list.add(new Book("Emmerson", "Essential business",R.drawable.e_business, "1",R.string.e_business));
        list.add(new Book(" Н.Н. Симоненко", "Краткосрочная и долгосрочная финансовая политика фирмы ",R.drawable.firm_politic, "2",R.string.firm_politic));
        list.add(new Book("Н.Г. Забродская", "Предпринимательство. Организация и экономика малых предприятий ",R.drawable.economic, "4",R.string.economic));
        list.add(new Book("В. Б. Ивашкевич", "Бизнес-задачи; решения и расчеты в управленческом учете",R.drawable.business_task, "2",R.string.business_task));
        list.add(new Book(" В.И. Бережной", "Бухгалтерский управленческий учет ",R.drawable.buch_uchet, "6060 Wilshire Blvd",R.string.buch_uchet));
        list.add(new Book("Anita Graser", " Learning QGIS Second Edition",R.drawable.qgis, "12",R.string.qgis));
        list.add(new Book(" Joel Lawhead ", " Qgis Python Programming Cookbook",R.drawable.pyqgis, "10",R.string.pyqgis));
        list.add(new Book("Chris Garrard  ", "Geoprocessing with Python",R.drawable.garrard, "8",R.string.garrard));
        list.add(new Book("Капралов, Кошкарев, Тикунов, Говоров", "Геоинформатика Книга 2",R.drawable.kapralov, " 9850 Wilshire Blvd",R.string.kapralov));
        list.add(new Book("Sabine Henning", "Online-Karten im Fokus",R.drawable.sabine, "300 Doheny Dr",R.string.sabine));
        list.add(new Book("J.M.Selig", "Geometric Fundamentals of Robotics",R.drawable.selig, "900 W Olympic Blvd",R.string.selig));
        list.add(new Book("Kathrzn Hulick", " Robotics Engineer",R.drawable.hulick, "9500 Wilshire Blvd",R.string.hulick));
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}