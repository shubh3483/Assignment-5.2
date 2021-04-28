package com.example.assignment5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.assignment5_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        setUpEventHandlers();
    }

    private void setUpEventHandlers() {
        b.toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();    
            }
        });
        b.countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCount();
            }
        });
        b.zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showZero();
            }
        });
    }

    private void showZero() {
        b.countTextView.setText(""+ 0);
        count = 0;
    }

    private void showCount() {
        b.countTextView.setText(""+count);
        count++;
    }

    private void showToast() {
        Toast toast = Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT);
        toast.show();
    }
}