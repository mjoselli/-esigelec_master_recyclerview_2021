package com.esigelec.recyclerviewapp.controller;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.esigelec.recyclerviewapp.R;
import com.esigelec.recyclerviewapp.model.DataModel;
import com.esigelec.recyclerviewapp.model.ProductDetail;

public class ProductsAdapter extends RecyclerView.Adapter <ProductsAdapter.ViewHolder>{
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView1;
        TextView textView2;
        public ViewHolder(View itemView){
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }

    int created = 0;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.recycler_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        Log.v("PRODUCT_ADAPTER","created["+created+"]");
        created++;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductDetail p = DataModel.getInstance().products.get(position);
        holder.textView1.setText(p.getName());
        holder.textView2.setText(""+p.getValue());
        Log.v("PRODUCT_ADAPTER","Item["+position+"]:"+ p.getName());
    }

    @Override
    public int getItemCount() {
        Log.v("PRODUCT_ADAPTER","Size:"+ DataModel.getInstance().products.size());

        return DataModel.getInstance().products.size();
    }
}
