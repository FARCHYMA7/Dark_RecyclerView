package com.example.firstrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomeAdapter extends RecyclerView.Adapter<CustomeAdapter.MyViewHolder> {

    ArrayList<DataModel> dataset;
    public CustomeAdapter(ArrayList<DataModel> dataSet) {
        this.dataset = dataSet;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        TextView textViewText;
        ImageView imageView;

        public MyViewHolder (View itemView){
            super(itemView);

            textViewName = itemView.findViewById(R.id.textView);
            textViewText = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }

    @NonNull
    @Override
    public CustomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout , parent , false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomeAdapter.MyViewHolder holder, int position) {

        TextView textViewName = holder.textViewName;
        TextView textViewText = holder.textViewText;
        ImageView imageView = holder.imageView;

        textViewName.setText(dataset.get(position).getName());
        textViewText.setText((dataset.get(position).getText()));
        imageView.setImageResource(dataset.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
