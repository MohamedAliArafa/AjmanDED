package com.zeowls.ajmanded;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.zeowls.ajmanded.ui.AnimatedFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class OnlineServicesFragment extends AnimatedFragment {

    public OnlineServicesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    ScrollView scrollView;
    LinearLayout cardView;
    LinearLayout cardView2;
    LinearLayout cardView3;
//    LinearLayout cardView4;
//    LinearLayout cardView5;
//    LinearLayout cardView6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTheme(R.style.Theme_MyAwesomeApp_Red);
        View view = inflater.inflate(R.layout.fragment_online_services, container, false);
        scrollView = view.findViewById(R.id.main_scroll);
        cardView = view.findViewById(R.id.line1);
        cardView2 = view.findViewById(R.id.line2);
        cardView3 = view.findViewById(R.id.line3);
//        cardView4 = view.findViewById(R.id.line4);
//        cardView5 = view.findViewById(R.id.line5);
//        cardView6 = view.findViewById(R.id.line6);
//
        cardView.setVisibility(View.INVISIBLE);
        cardView2.setVisibility(View.INVISIBLE);
        cardView3.setVisibility(View.INVISIBLE);
//        cardView4.setVisibility(View.INVISIBLE);
//        cardView5.setVisibility(View.INVISIBLE);
//        cardView6.setVisibility(View.INVISIBLE);

        return view;
    }

    @Override
    public void startAnimation() {
        new AnimatedFragment.animate(new View[]{cardView, cardView2, cardView3}).execute();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        startAnimation();
    }

    public static AnimatedFragment newInstance(int i, String s) {
        return new OnlineServicesFragment();
    }
}
