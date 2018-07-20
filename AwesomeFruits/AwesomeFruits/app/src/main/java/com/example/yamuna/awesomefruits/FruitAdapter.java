package com.example.yamuna.awesomefruits;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.fruitViewHolder> {

    private ArrayList<Fruit> fruitsLists;

        public FruitAdapter(ArrayList<Fruit>fruitsList) {
            fruitsLists = fruitsList;
        }

    @NonNull
    @Override
    public fruitViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new fruitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull fruitViewHolder fruitViewHolder, int i) {
        fruitViewHolder.fruitImage.setImageResource(fruitsLists.get(i).getImageId());
        fruitViewHolder.fruitName.setText(fruitsLists.get(i).getFruitName());
    }

    @Override
    public int getItemCount() {
        return fruitsLists.size();
    }

    class fruitViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.iv_fruit_image)
        ImageView fruitImage;

        @BindView(R.id.tv_fruit_name)
        TextView fruitName;

        public fruitViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
