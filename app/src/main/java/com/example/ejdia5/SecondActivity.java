package com.example.ejdia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.ejdia5.databinding.ActivityMainBinding;
import com.example.ejdia5.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        Intent intent = getIntent();
       // Bundle bundle = intent.getExtras();
        Log.d("prueba",intent.getStringExtra("name"));
        if (intent != null){
            mBinding.textViewname.setText(intent.getStringExtra("name"));
            mBinding.textViewlastName.setText(intent.getStringExtra("lastName"));

        }



    }
}