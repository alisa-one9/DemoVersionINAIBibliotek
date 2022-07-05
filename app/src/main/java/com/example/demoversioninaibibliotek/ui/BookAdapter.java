package com.example.demoversioninaibibliotek.ui;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.demoversioninaibibliotek.OnItemClickListener;
import com.example.demoversioninaibibliotek.R;
import com.example.demoversioninaibibliotek.databinding.ListItemBinding;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Locale;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private ListItemBinding binding;
    private NavController navController;
    private ArrayList<Book> list = new ArrayList();
    private OnItemClickListener onItemClickListener;

    public BookAdapter() {
    }
    public void setList(ArrayList<Book>list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ListItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));


        binding.btnBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController = Navigation.findNavController((Activity) view.getContext(),
                        R.id.nav_host_fragment_activity_main);
                navController.navigate(R.id.bookingFragment);


            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addItem(Book book){
        list.add(0,book);
        notifyItemChanged(0);
    }

    public Book getItem(int position){
        return list.get(position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Book book) {
            binding.nameOfBook.setText(book.getName());
            binding.authorBook.setText(book.getAuthor());
            Glide.with(binding.getRoot())
                    .load(book.getImage())
                    .centerCrop()
                    .into(binding.imageBook);
          binding.btnMore.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  onItemClickListener.onClick(getAdapterPosition());

              }
          });



        }

    }
}
