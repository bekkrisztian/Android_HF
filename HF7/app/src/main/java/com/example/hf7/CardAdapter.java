package com.example.hf7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private Activity mCtx;
    private List<Card> cardList;

    public CardAdapter(Activity mCtx, List<Card> cardList) {
        this.mCtx = mCtx;
        this.cardList = cardList;
    }

    @Override
    public CardAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new CardViewHolder(itemView, mCtx);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Card card = cardList.get(position);
        holder.rootView.setTag(card);
        holder.textView1.setText(card.getCurrency());
        holder.textView2.setText(card.getDescription());
        holder.textView5.setText(card.getBuyPrice());
        holder.textView6.setText(card.getSellPrice());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(card.getImage(),null));
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
    class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView1, textView2, textView3, textView4, textView5 ,textView6;
        View rootView;

        public CardViewHolder(View itemView,final Context context) {
            super(itemView);
            rootView = itemView;
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    textView3.setVisibility(v.VISIBLE);
                    textView4.setVisibility(v.VISIBLE);
                    textView5.setVisibility(v.VISIBLE);
                    textView6.setVisibility(v.VISIBLE);
                }
            });
        }
    }
}
