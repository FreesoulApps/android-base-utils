package com.freesoulapps.baseapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.freesoulapps.baseapplication.R;
import com.freesoulapps.baseapplication.data.SampleObject;
import com.freesoulapps.baselibrary.adapters.BaseAdapter;

/**
 * Created by Test on 27/05/2016.
 */
public class SampleAdapter extends BaseAdapter {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sample, null);

        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder=(ViewHolder)holder;
        SampleObject item=(SampleObject) mItems.get(position);
        viewHolder.mTextViewItem.setText(item.getName());
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewItem;
        // each data item is just a string in this case
        public ViewHolder(View view) {
            super(view);
            mTextViewItem=(TextView) view.findViewById(R.id.txtViewSampleItem);
        }
    }
}
