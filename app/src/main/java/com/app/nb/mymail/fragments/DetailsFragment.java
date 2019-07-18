package com.app.nb.mymail.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.nb.mymail.R;
import com.app.nb.mymail.models.Mail;

public class DetailsFragment extends Fragment {

    private TextView tvSubject;
    private TextView tvSender;
    private TextView tvMessage;
    private LinearLayout wrapper;


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        tvSubject = view.findViewById(R.id.tvFragmentSubject);
        tvSender = view.findViewById(R.id.tvFragmentSenderName);
        tvMessage = view.findViewById(R.id.tvFragmentMessage);
        wrapper = (LinearLayout) view.findViewById(R.id.fragmentDetailsMailWrapper);

        // Inflate the layout for this fragment
        return view;
    }

    public void renderMail(Mail mail){
        wrapper.setVisibility(View.VISIBLE);
        tvSubject.setText(mail.getSubject());
        tvSender.setText(mail.getSenderName());
        tvMessage.setText(mail.getMessage());
    }

}
