package com.example.socs_fund.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socs_fund.R;
import com.example.socs_fund.models.Model;

import java.util.ArrayList;

public class AdapterDash extends RecyclerView.Adapter<AdapterDash.ViewHolder> {
    private ArrayList<Model>list=new ArrayList<>();

    public void addlist(ArrayList<Model>list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_service,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list,position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.plate_icon);
            textView=itemView.findViewById(R.id.plate_title);
        }

        public void onBind(Model model) {
            imageView.setImageResource(model.getImageIcon();
            textView.setText(model.getTitle());

        }
    }
}
