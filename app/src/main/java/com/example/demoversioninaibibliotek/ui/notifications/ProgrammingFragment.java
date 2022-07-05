package com.example.demoversioninaibibliotek.ui.notifications;

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
import com.example.demoversioninaibibliotek.databinding.FragmentProgrammingBinding;
import com.example.demoversioninaibibliotek.ui.Book;
import com.example.demoversioninaibibliotek.ui.BookAdapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;

public class ProgrammingFragment extends Fragment {

    private FragmentProgrammingBinding binding;
    private NavController navController;
    private RecyclerView recyclerView;
    private BookAdapter adapter;
    private ArrayList<Book> list = new ArrayList<>();
    private BottomSheetBehavior sheetBehavior;

    public ProgrammingFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new BookAdapter();
        createList();
        adapter.setList(list);
    }



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProgrammingViewModel viewModel = new ViewModelProvider(this).get(ProgrammingViewModel.class);
        binding = FragmentProgrammingBinding.inflate(inflater, container, false);
        binding.rvBooks.setAdapter(adapter);
           return binding.getRoot();
    }



    private void createList() {
        list.add(new Book("Титтел Эд, Минник Крис", "HTML5 и CSS3 для чайников",R.drawable.html5css3,"10", R.string.html5css3 ));
        list.add(new Book("Eric Evans", "Domain-Drive Design",R.drawable.domain, "1",R.string.griffith));
        list.add(new Book("Vaughn Vernon", "Domain-Driven Design Distilled",R.drawable.distilled, "6",R.string.distilled));
        list.add(new Book("Тимур Машнин", "Eclipse. Разработка RCP-, Web-, Ajax- и Android-приложений на Java",R.drawable.ecclipse, "10",R.string.Ecclipse));
        list.add(new Book("Kroner", "HTML 5",R.drawable.html5, "1238 S Beach Blvd Anaheim, CA 92804",R.string.HTML5));
        list.add(new Book("Michael Firnkes", "Professionelle Webtexte",R.drawable.webtexte, "13",R.string.webtexte));
        list.add(new Book("Элизабет Робсон ,Эрик Фримен", "HTML,XHTML,CSS",R.drawable.xhtml, "8039 Beach Blvd Buena Park CA 90620",R.string.xhtml));
        list.add(new Book("Элизабет Робсон ,Эрик Фримен", "Изучаем программирование JavaScript",R.drawable.java_script, "11",R.string.JavaScript));
        list.add(new Book("Jeremy Kepner ,Hayder Jananthan", "Mathematics of Big Data: Spreadsheets, Databases, Matrices and Graphs",R.drawable.math_of_bd, "11",R.string.math_of_bd));
        list.add(new Book("Nathan Marz ,James Warren", "Big Data: Principles and best practices of scalable realtime data systems",R.drawable.bd_principles, "11",R.string.bd_principles));
        list.add(new Book("B. Franks", "A revolution in Big Data analytics",R.drawable.bd_rev, "Количество : 11",R.string.bd_rev));
        list.add(new Book("Tom Fawcett ,Foster Provost", "Data Science for Business: What You Need to Know about Data Mining and Data-Analytic Thinking",R.drawable.ds_for_b, "2",R.string.ds_for_b));
        list.add(new Book("Marcos lopez de prado", "Advances in Financial Machine Learning  ",R.drawable.mashinel, "11",R.string.mashinel));
        list.add(new Book("Sebastian Raschka , Vahid Mirjalili", "Python Machine Learning: Machine Learning and Deep Learning with Python, scikit-learn, and TensorFlo ",R.drawable.python_ml, "1",R.string.python_ml));
        list.add(new Book("John D. Kelleher ,Brian Mac Namee, Aoife D.Arcy ", "Fundamentals of Machine Learning for Predictive Data Analytics",R.drawable.fund_ml, "1",R.string.fund_ml));
        list.add(new Book("Murali Chemuturi ", "Requirements Engineering and Management for Software Development Projects",R.drawable.softwaredev, "3",R.string.softwaredev));
        list.add(new Book("Kevin P.Murpy", "Machine Learning: A Probabilistic Perspective ",R.drawable.ml_pp, "1",R.string.ml_pp));
        list.add(new Book("Sanford Friedenthal. Alan Moore. Rick Steiner ;", "A practical guide to SysML. The system modeling language ",R.drawable.sys_ml, "0",R.string.sys_ml));


            }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}