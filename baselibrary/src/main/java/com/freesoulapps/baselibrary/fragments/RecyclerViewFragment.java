package com.freesoulapps.baselibrary.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freesoulapps.baselibrary.R;
import com.freesoulapps.baselibrary.adapters.BaseAdapter;

/**
 * Created by Alex on 27/05/2016.
 */
public abstract class RecyclerViewFragment extends Fragment {
    protected BaseAdapter mAdapter;
    protected RecyclerView mRecyclerView;
    protected SwipeRefreshLayout mSwipeRefreshLayout;
    protected LinearLayoutManager mLinearLayoutManager;
    protected View mRootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_recycler_view, parentViewGroup, false);
        mSwipeRefreshLayout = (SwipeRefreshLayout) mRootView.findViewById(R.id.swipe_refresh_view);
        mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.recycler_view);
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        instantiateAdapter();
        mRecyclerView.setAdapter(mAdapter);

        mSwipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mSwipeRefreshLayout.setRefreshing(true);
                loadData();
            }
        });

        return mRootView;
    }

    /**
     * Instantiate adapter.
     * You must instantiate it here.
     */
    public abstract void instantiateAdapter();

    /**
     * Showing or hiding swipe refresh loader icon
     * @param visible
     */
    public void setSwipeRefreshState(boolean visible)
    {
        mSwipeRefreshLayout.setRefreshing(visible);
    }

    /**
     * Implement here loading data method,
     * don't forget to call setSwipeRefreshState(fales) to remove swipe refresh loader icon after finishing loading data
     * @param args
     */
    public abstract void loadData(Object... args);

}
