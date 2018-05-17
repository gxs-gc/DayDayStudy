package com.yt.demo_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yt.demo_view.lockview.LockScreenView;

public class MainActivity extends AppCompatActivity {

    private LockScreenView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = findViewById(R.id.lsv);

    }

    public void confirm(View v){
        for (int i : ls.getAnswers()) {
            System.out.println(i);
        }
        ls.clear();
    }
}
