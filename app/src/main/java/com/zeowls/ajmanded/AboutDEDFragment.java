package com.zeowls.ajmanded;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zeowls.ajmanded.ui.AnimatedFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutDEDFragment extends AnimatedFragment {

    LinearLayout cardView;
    LinearLayout cardView1;
    LinearLayout cardView2;

    public AboutDEDFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTheme(R.style.Theme_MyAwesomeApp_Blue);
        View view = inflater.inflate(R.layout.fragment_about_ded, container, false);
        cardView = (LinearLayout) view.findViewById(R.id.line1);
        cardView1 = (LinearLayout) view.findViewById(R.id.line2);
        cardView2 = (LinearLayout) view.findViewById(R.id.line3);
//
        cardView.setVisibility(View.INVISIBLE);
        cardView1.setVisibility(View.INVISIBLE);
        cardView2.setVisibility(View.INVISIBLE);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        startAnimation();
    }

    @Override
    public void startAnimation(){
        new AnimatedFragment.animate(new View[] { cardView, cardView1, cardView2 }).execute();
    }
}
