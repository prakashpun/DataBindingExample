package com.tuts.prakash.databinding.handlers;
import android.view.View;
import android.widget.Toast;

import com.tuts.prakash.databinding.model.User;

public class MyHandlers {
    public void btnClick(View view, User user) {
        Toast.makeText(view.getContext(),"Name: "+user.getName() , Toast.LENGTH_LONG).show();
    }
}
