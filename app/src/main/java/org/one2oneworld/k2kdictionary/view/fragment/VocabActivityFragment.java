package org.one2oneworld.k2kdictionary.view.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.one2oneworld.k2kdictionary.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class VocabActivityFragment extends Fragment {

    public VocabActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vocab, container, false);
    }
}
