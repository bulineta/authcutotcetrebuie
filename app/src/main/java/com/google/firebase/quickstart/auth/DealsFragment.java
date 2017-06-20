package com.google.firebase.quickstart.auth;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DealsFragment extends Fragment {


    public DealsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.testclassfragment, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.my_image);
        return view;
    }

}
