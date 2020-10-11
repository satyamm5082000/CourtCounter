package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count1 = 0;
    int count2 = 0;
    Button button1 ;
    Button button2 ;
    Button button3 ;
    Button button4 ;
    Button button5 ;
    Button button6 ;

    Button reset ;

    TextView textView1 ;
    TextView textView2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.threeA);
        button2 = findViewById(R.id.twoA);
        button3 = findViewById(R.id.oneA);

        button4 = findViewById(R.id.threeB);
        button5 = findViewById(R.id.twoB);
        button6 = findViewById(R.id.oneB);

        reset = findViewById(R.id.reset);

        textView1 = findViewById(R.id.dispA);
        textView2 = findViewById(R.id.dispB);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1 = count1 + 3;

                textView1.setText(String.valueOf( countA));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1 = count1 + 2;

                textView1.setText(String.valueOf( count1));

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1 = count1 + 1;

                textView1.setText(String.valueOf( count1));

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count2 = count2 + 3;

                textView2.setText(String.valueOf( count2));

            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count2 = count2 + 2;

                textView2.setText(String.valueOf( count2));

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count2 = count2 + 1;

                textView2.setText(String.valueOf( count2));

            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("0");
                textView2.setText("0");
                count1 = 0 ;
                count2 = 0 ;
            }
        });
    }
}
