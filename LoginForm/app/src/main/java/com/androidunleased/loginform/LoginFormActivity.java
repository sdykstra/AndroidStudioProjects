package com.androidunleased.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginFormActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        Button b =(Button)this.findViewById(R.id.login_button);
        b.setOnClickListener(this);
    }

    public  void onClick(View v){

        EditText userid = (EditText)findViewById(R.id.user_ID);
        EditText password = (EditText)findViewById(R.id.password);
        TextView resp = (TextView)this.findViewById(R.id.response);
        String usr = userid.getText().toString();
        String pswd = password.getText().toString();

        if(usr.trim().length()==0 || pswd.trim().length()==0){
            String str = "The user name or password was left blank, \nplease try again";
            resp.setText(str);
        }else{
            if(usr.equals("guest")&& pswd.equals("guest")){
                resp.setText("Welcome "+ usr +" ! ");
            }else{
                resp.setText("The User ID or Password is incorrect\nPlease try again");
            }
        }
    }
}
