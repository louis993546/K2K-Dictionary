package org.one2oneworld.k2kdictionary;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Louis on 26/1/16.
 */
public class rvAdapter extends RecyclerView.Adapter<rvViewHolder> {

    public List<Data> getmData() {
        return mData;
    }

    public void setmData(List<Data> mData) {
        this.mData = mData;
    }

    public List<Data> mData;

    @Override
    public rvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.list_item, parent, false);
        return new rvViewHolder(itemView);
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
