package com.dzy.pulltorefresh;

import android.os.Bundle;

public class ReleaseActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        mLayout.setHeaderView(new ArrowHeaderView(this));
        mLayout.mRefreshImmediately = false;

    }
}