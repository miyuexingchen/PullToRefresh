package com.dzy.pulltorefresh.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dzy.pulltorefresh.R;

import java.util.List;

/**
 * Created by dzysg on 2016/4/22 0022.
 */
public class DefaultRecycleViewAdapter extends RecyclerView.Adapter<DefaultRecycleViewAdapter.Holder>
{

    List<String> mDatas;
    Context mContext;

    public DefaultRecycleViewAdapter(Context context, List<String> list)
    {
        mContext = context;
        mDatas = list;

    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item_layout, parent, false);
        TextView tv = (TextView) view.findViewById(R.id.tvTitile);
        Holder holder =  new Holder(view);
        holder.Tv = tv;

        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position)
    {
        holder.Tv.setText("title "+position);
    }

    @Override
    public int getItemCount()
    {
        if (mDatas == null)
            return 20;

        return mDatas.size();
    }

    public static class Holder extends RecyclerView.ViewHolder
    {
        public TextView Tv;
        public Holder(View itemView)
        {
            super(itemView);
        }
    }
}
