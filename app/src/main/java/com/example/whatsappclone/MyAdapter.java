package com.example.whatsappclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Innerclass> {

    Context context;
    ArrayList<MyModel> data;

    public MyAdapter(Context context, ArrayList<MyModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyAdapter.Innerclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.mychatcard,parent,false);
        return new Innerclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.Innerclass holder, int position) {
        holder.textView.setText(data.get(position).getName());
        holder.imageView.setImageResource(data.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Innerclass  extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public Innerclass(View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.my_img);
            textView = itemView.findViewById(R.id.my_txt);
        }
    }
}
