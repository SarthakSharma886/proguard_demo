package com.example.androidproguard.model;

import android.content.Context;
import android.widget.Toast;

public class ModelConsumer {
    Context mContext ;
    public  ModelConsumer( Context context){
        mContext = context;
    }
    public void showToast(Model model){
        Toast.makeText(mContext, model.getName(), Toast.LENGTH_SHORT).show();
    }
}
