package com.freesoulapps.baseapplication.fragments;

import com.freesoulapps.baseapplication.adapters.SampleAdapter;
import com.freesoulapps.baseapplication.data.SampleObject;
import com.freesoulapps.baselibrary.data.BaseObject;
import com.freesoulapps.baselibrary.fragments.RecyclerViewFragment;

import java.util.ArrayList;

/**
 * Created by Test on 27/05/2016.
 */
public class SampleFragment extends RecyclerViewFragment {

    public static SampleFragment newInstance()
    {
        SampleFragment fragment=new SampleFragment();
        return fragment;
    }

    @Override
    public void instantiateAdapter() {
        mAdapter=new SampleAdapter();
    }

    @Override
    public void loadData(Object... args) {
        ArrayList<BaseObject> items=new ArrayList<>();
        items.add(new SampleObject("Item 1"));
        items.add(new SampleObject("Item 2"));
        items.add(new SampleObject("Item 3"));
        items.add(new SampleObject("Item 4"));
        items.add(new SampleObject("Item 5"));

        mAdapter.setItems(items);
        setSwipeRefreshState(false);
    }
}
