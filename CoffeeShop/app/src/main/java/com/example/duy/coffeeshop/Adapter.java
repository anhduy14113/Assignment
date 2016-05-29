package com.example.duy.coffeeshop;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DUY on 5/27/2016.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Data> drinkList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,quantity;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.drink_name);
            quantity = (TextView) view.findViewById(R.id.quantity_edt);
        }
    }


    public Adapter(List<Data> drinkList) {
        this.drinkList = drinkList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = drinkList.get(position);
        holder.name.setText(data.getName());
        holder.quantity.setText(data.getQuantity());
    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }
}
