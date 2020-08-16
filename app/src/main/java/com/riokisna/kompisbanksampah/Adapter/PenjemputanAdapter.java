package com.riokisna.kompisbanksampah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.riokisna.kompisbanksampah.R;

public class PenjemputanAdapter extends RecyclerView.Adapter<PenjemputanAdapter.ViewHolder> {

    private Context context;
    public PenjemputanAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PenjemputanAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_penjemputan,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PenjemputanAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
