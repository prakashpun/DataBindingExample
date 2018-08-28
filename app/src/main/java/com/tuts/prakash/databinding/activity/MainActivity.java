package com.tuts.prakash.databinding.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tuts.prakash.databinding.R;
import com.tuts.prakash.databinding.databinding.ActivityMainBinding;
import com.tuts.prakash.databinding.handlers.MyHandlers;
import com.tuts.prakash.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setName("Prakash");
        user.setEmail("praks@email.com");

        binding.setUser(user);
        binding.setHandler(new MyHandlers());


    }
}
