package com.example.shikher.messcompanion;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by shikher on 4/7/17.
 */

public class Select_date extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_date);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.imageButton_date)
    public void click()
    {
        Intent i = new Intent(this, Select_choice.class);

        this.startActivity(i);
    }

}


