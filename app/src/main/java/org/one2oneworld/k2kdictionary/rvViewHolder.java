package org.one2oneworld.k2kdictionary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Louis on 26/1/16.
 */
public class rvViewHolder extends RecyclerView.ViewHolder {
    public TextView vocabulary;
    public TextView definition;

    public rvViewHolder(View itemView) {
        super(itemView);
        vocabulary = (TextView) itemView.findViewById(R.id.voca);
        definition = (TextView) itemView.findViewById(R.id.some_def);
    }
}
