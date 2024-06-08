package com.example.whatsappclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Chats extends Fragment {
    RecyclerView recyclerView;
    ArrayList<MyModel> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_chats,container,false);
        myinit(view);

        recyclerView.setAdapter(new MyAdapter(requireActivity(),data));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));

        return view;
    }
    private void myinit(View itemview){
        recyclerView= itemview.findViewById(R.id.my_recycle);
        data =new ArrayList<>();

        data.add(new MyModel("jalaj",R.drawable.msd));
        data.add(new MyModel("eva",R.drawable.msd));
        data.add(new MyModel("deepak",R.drawable.msd));
        data.add(new MyModel("surya",R.drawable.msd));
        data.add(new MyModel("dev",R.drawable.msd));
        data.add(new MyModel("Kanika",R.drawable.msd));
        data.add(new MyModel("Mansi",R.drawable.msd));
        data.add(new MyModel("Sarthak",R.drawable.msd));
    }
}