package org.one2oneworld.k2kdictionary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Louis on 26/1/16.
 */
public class rvAdapter extends RecyclerView.Adapter<rvViewHolder> {
    public List<Data> mData;
    public Context context;

    public rvAdapter(List<Data> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public rvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.list_item, parent, false);
        return new rvViewHolder(itemView, context);
    }

    @Override
    public void onBindViewHolder(rvViewHolder holder, int position) {
        holder.vocabulary.setText(mData.get(position).vocabulary);
        holder.definition.setText(mData.get(position).definition);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
