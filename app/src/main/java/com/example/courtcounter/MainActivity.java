package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int countA = 0;
    int countB = 0;
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

                countA = countA + 3;

                textView1.setText(String.valueOf( countA));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countA = countA + 2;

                textView1.setText(String.valueOf( countA));

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countA = countA + 1;

                textView1.setText(String.valueOf( countA));

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countB = countB + 3;

                textView2.setText(String.valueOf( countB));

            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countB = countB + 2;

                textView2.setText(String.valueOf( countB));

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countB = countB + 1;

                textView2.setText(String.valueOf( countB));

            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("0");
                textView2.setText("0");
                countA = 0 ;
                countB = 0 ;
            }
        });
    }
}
