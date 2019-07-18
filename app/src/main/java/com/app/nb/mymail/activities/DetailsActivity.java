package com.app.nb.mymail.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.app.nb.mymail.R;
import com.app.nb.mymail.fragments.DetailsFragment;
import com.app.nb.mymail.models.Mail;

public class DetailsActivity extends AppCompatActivity {

    private String subject;
    private String message;
    private String sender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if (getIntent().getExtras() != null) {
            subject = getIntent().getStringExtra("subject");
            message = getIntent().getStringExtra("message");
            sender = getIntent().getStringExtra("senderName");
        }

        Mail mail = new Mail(subject, message, sender);

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
        detailsFragment.renderMail(mail);
    }
}
