package com.example.ejdia5;

import androidx.appcompat.app.AppCompatActivity;

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
        Bundle bundle = getIntent().getExtras();
        Log.d("prueba",bundle.getString("name"));
        if (bundle != null){
            mBinding.textViewname.setText(bundle.getString("name"));
            mBinding.textViewlastName.setText(bundle.getString("lastName"));

        }



    }
}