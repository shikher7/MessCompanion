package com.example.shikher.messcompanion;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by shikher on 4/7/17.
 */

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.spinner_block)
    Spinner block;
    @BindView(R.id.imageButton_block)
ImageButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_block);
        ButterKnife.bind(this);
        ArrayAdapter<String> adapter1= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Mess_Blocks));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        block.setAdapter(adapter1);
    }

    @OnClick(R.id.imageButton_block)
    public void viewMenu()
    {
        Intent i = new Intent(this, Select_mess_type.class);

        this.startActivity(i);
    }

}


