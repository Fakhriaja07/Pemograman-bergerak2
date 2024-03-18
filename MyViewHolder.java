package com.example.recylerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView GambarView;
    TextView NamaView,NIMView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        GambarView = itemView.findViewById(R.id.GambarView);
        NamaView = itemView.findViewById(R.id.Nama);
        NIMView = itemView.findViewById(R.id.NIM);
    }
}
