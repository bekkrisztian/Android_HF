package com.example.pizza;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.ViewHolder> {

    private Context context;
    private List<Pizza> pizzak;

    public PizzaAdapter(Context context, List<Pizza> pizzak) {
        this.context = context;
        this.pizzak = pizzak;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pizza pizza = pizzak.get(position);
        holder.rootView.setTag(pizza);
        holder.image.setImageResource(pizza.getImage());
        holder.nev.setText(pizza.getNev());
        holder.leiras.setText(pizza.getLeiras());
        holder.ar.setText(String.valueOf(pizza.getAr()));
    }

    @Override
    public int getItemCount() {
        return pizzak.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final View rootView;
        final ImageView image;
        final TextView nev;
        final TextView leiras;
        final TextView ar;

        public ViewHolder(View rootView, final Context context) {
            super(rootView);
            this.rootView = rootView;
            this.image = (ImageView)rootView.findViewById(R.id.imageView2);
            this.nev = (TextView) rootView.findViewById(R.id.textView);
            this.leiras = (TextView) rootView.findViewById(R.id.textView2);
            this.ar = (TextView) rootView.findViewById(R.id.textView4);

            rootView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final  Pizza pizza = (Pizza)v.getTag();
                    if(pizza != null) {
                        Intent intent = new Intent(context, PizzaDetails.class);
                        intent.putExtra("PIZZA", pizza);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}
