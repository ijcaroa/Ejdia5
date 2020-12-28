package com.example.ejdia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ejdia5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.editTxtMail.setText("mail@mail.cl");
        mBinding.editTxtPass.setText("123456");
        mBinding.buttonSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mBinding.editTxtName.getText().toString();
                String lastName = mBinding.editTxtLastname.getText().toString();

                Toast.makeText(MainActivity.this, "Hola " + name + " " + lastName, Toast.LENGTH_SHORT).show();
                tosecondact(name, lastName);
            }
        });
    }
    private void tosecondact (String name, String lastName){
        Intent tosecondact = new Intent(MainActivity.this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        bundle.putString("lastName", lastName);
        startActivity(tosecondact, bundle);

    }



}