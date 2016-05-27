package com.freesoulapps.baseapplication.data;

import com.freesoulapps.baselibrary.data.BaseObject;

/**
 * Created by Test on 27/05/2016.
 */
public class SampleObject extends BaseObject {
    private String mName;

    public SampleObject(String name)
    {
        mName=name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
