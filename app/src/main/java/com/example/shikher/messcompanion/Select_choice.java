package com.example.shikher.messcompanion;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by shikher on 4/7/17.
 */

public class Select_choice extends AppCompatActivity {

@BindView(R.id.radio_NO)
RadioButton No;
@BindView(R.id.radio_YES)
RadioButton Yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_choice);
        ButterKnife.bind(this);
        No.setChecked(true);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_YES:
                if (checked)
                    No.setChecked(false);
                    break;
            case R.id.radio_NO:
                if (checked)
                    Yes.setChecked(false);
                    break;
        }
    }
    @OnClick(R.id.button_choice_menu)
    public void click()
    {
        Intent i = new Intent(this, MenuActivity.class);

        this.startActivity(i);
    }
    @OnClick(R.id.button_choice_submit)
    public void submit()
    {
        Intent i = new Intent(this, MainActivity.class);
        Toast.makeText(this, "Choice updated successfully.", Toast.LENGTH_SHORT).show();

        this.startActivity(i);
    }


}


