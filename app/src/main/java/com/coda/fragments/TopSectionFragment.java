package com.coda.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 660161986 on 2/8/2016.
 */
public class TopSectionFragment extends Fragment {

    private static EditText topET;
    private static EditText bottomET;

    TopSectionListener activityCommander;

    public interface TopSectionListener{

        public void createMeme(String Top, String Bottom);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        //***********************
        //get widget references
        //***********************
        topET = (EditText) view.findViewById(R.id.topET);
        bottomET = (EditText) view.findViewById(R.id.bottomET);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });


        return view;
    }

    private void buttonClicked(View v) {
        activityCommander.createMeme(topET.getText().toString(), bottomET.getText().toString());
    }

}
