package com.freesoulapps.baselibrary.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.freesoulapps.baselibrary.data.BaseObject;

import java.util.ArrayList;

/**
 * Created by Alex on 27/05/2016.
 */
public abstract class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected ArrayList<BaseObject> mItems;

    @Override
    public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    @Override
    public abstract void onBindViewHolder(RecyclerView.ViewHolder holder, int position);

    @Override
    public int getItemCount() {
        return mItems==null? 0:mItems.size();
    }

    public void setItems(ArrayList<BaseObject> items)
    {
        this.mItems=items;
        notifyDataSetChanged();
    }

    public void addItem(BaseObject item, int position)
    {
        this.mItems.add(position,item);
        notifyItemChanged(position);
    }
    public void addItem(BaseObject item)
    {
        this.mItems.add(item);
        notifyItemChanged(this.mItems.size()-1);
    }
    public void addItems(ArrayList<BaseObject> items)
    {
        this.mItems.addAll(items);
        notifyDataSetChanged();
    }

}
