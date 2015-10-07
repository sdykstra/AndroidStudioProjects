package com.androidunleased.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.RadioButton;
import android.view.View;
import android.view.View.OnClickListener;


public class RadioButtonApp extends AppCompatActivity {
    String str1="";
    String str2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_app);
        RadioButton radioFivestar =(RadioButton)findViewById(R.id.radio_fivestar);
        RadioButton radioThreestar = (RadioButton)findViewById(R.id.radio_threeStar);
        RadioButton radioSutie = (RadioButton)findViewById(R.id.radio_suite);
        RadioButton radioLuxury = (RadioButton)findViewById(R.id.radio_luxary);
        RadioButton radioOrainary = (RadioButton)findViewById(R.id.radio_ordinary);
        radioFivestar.setOnClickListener(radioListener1);
        radioThreestar.setOnClickListener(radioListener1);
        radioSutie.setOnClickListener(radioListener2);
        radioLuxury.setOnClickListener(radioListener2);
        radioOrainary.setOnClickListener(radioListener2);
    }

    private OnClickListener radioListener1 = new OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView selectedOptions =(TextView)findViewById(R.id.hoteltype);
            RadioButton rb =(RadioButton) v;
            str1="The hotel type selected is: "+ rb.getText();
            selectedOptions.setText(str1 + "\n" + str2);
        }
    };

    private OnClickListener radioListener2 = new OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView selectedOptions =(TextView)findViewById(R.id.hoteltype);
            RadioButton rb =(RadioButton) v;
            str2= "Room type selected is : "+rb.getText();
            selectedOptions.setText(str1+"\n"+str2);
        }
    };
}