package com.example.edvard.popping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button_start_pop);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                onClickPopping(v);
            }
        });
    }

    protected void onClickPopping(View v) {
        TextView tv1 = (TextView)findViewById(R.id.textView_popping_status);
        tv1.setText("Started Popping");
    }
}
