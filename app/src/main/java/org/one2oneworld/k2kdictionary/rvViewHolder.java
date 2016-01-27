package org.one2oneworld.k2kdictionary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.one2oneworld.k2kdictionary.view.activity.VocabActivity;

/**
 * Created by Louis on 26/1/16.
 */
public class rvViewHolder extends RecyclerView.ViewHolder {
    public TextView vocabulary;
    public TextView definition;

    public rvViewHolder(View itemView, final Context context) {
        super(itemView);
        vocabulary = (TextView) itemView.findViewById(R.id.voca);
        definition = (TextView) itemView.findViewById(R.id.some_def);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("qqq", "1");
                Intent i = new Intent(context, VocabActivity.class);
//                i.putExtra()
                context.startActivity(i);
            }
        });
    }
}
