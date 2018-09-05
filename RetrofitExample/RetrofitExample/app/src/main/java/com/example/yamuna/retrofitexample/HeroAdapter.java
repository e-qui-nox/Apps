package com.example.yamuna.retrofitexample;


import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder>{
    private Context context;
    private List<Hero> heroList;

    public HeroAdapter(Context context, List<Hero> heroList){
        this.context = context;
        this.heroList = heroList;
    }


    @Override
    public HeroAdapter.HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.content_main, parent, false);

        return new HeroViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HeroAdapter.HeroViewHolder holder, int position) {
        Hero hero = heroList.get(position);

        Glide.with(context).load(Uri.parse(hero.getImageurl())).into(holder.image);
        holder.name.setText(hero.getRealname());

    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        public HeroViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.real_name);
        }
    }
}
